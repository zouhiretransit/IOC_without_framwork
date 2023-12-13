package metier;

import dao.IDao;

public class MetierImpl implements IMetier{
    private IDao dao; //Couplage faible
    @Override
    public double calcul() {
        double temp=dao.getData();
        double res=temp*540/Math.cos(temp*Math.PI);
        return res;
    }
    /*
     Injecter dans lavariable dao un objet d'une classe qui implémente
     l'interface IDao
     */
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
