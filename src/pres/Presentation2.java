package pres;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Presentation2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner=new Scanner(new File("config.txt"));
        String daoClassName=scanner.nextLine();
        Class<?> cDao= Class.forName(daoClassName);
        IDao dao =(IDao) cDao.getDeclaredConstructor().newInstance();
        System.out.println(dao.getData());

        String metierClassName=scanner.nextLine();
        Class<?> cMetier=Class.forName(metierClassName);
        IMetier metier=(IMetier) cMetier.getDeclaredConstructor().newInstance();
        Method method=cMetier.getMethod("setDao",IDao.class);
        //metier.setDao(dao)
        method.invoke(metier,dao);

        System.out.println("Resultat: " +metier.calcul());

    }
}
