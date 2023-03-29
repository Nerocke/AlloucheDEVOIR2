package Entities.Exo1;

import javax.management.Descriptor;

public class Captage implements Comparable<Captage>
{
    protected int idCaptage;
    protected String nomCaptage;
    protected int hauteurCaptage;
    protected int debitmaxCaptage;

    public Captage(int idCaptage, String nomCaptage, int hauteurCaptage, int debitmaxCaptage) {
        this.idCaptage = idCaptage;
        this.nomCaptage = nomCaptage;
        this.hauteurCaptage = hauteurCaptage;
        this.debitmaxCaptage = debitmaxCaptage;
    }



    public int getIdCaptage() {
        return idCaptage;
    }

    public String getDescription()
    {
        return nomCaptage + hauteurCaptage ;
    }


}
