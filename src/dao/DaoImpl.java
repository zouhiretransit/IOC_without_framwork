package dao;

public class DaoImpl implements IDao{
    @Override
    public double getData() {
        /*
        Connecter a la base de donnée pour récupérer la température
         */
        System.out.println("Version base de donnée");
        double temp=Math.random()*40;
        return temp;
    }
}
