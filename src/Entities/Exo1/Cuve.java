package Entities.Exo1;

public class Cuve extends Captage implements IVolume
{
    protected int largeur;
    protected int longueur;

    protected double Volume;

    public Cuve(int idCaptage, String nomCaptage, int hauteurCaptage, int uneLargeur, int uneLongeur, double unVolume)
    {
        super(idCaptage,nomCaptage,hauteurCaptage);

        largeur = uneLargeur;
        longueur = uneLongeur;

        Volume = unVolume;



    }

    @Override
    public String getDescription()
    {
        return super.getDescription();
    }

    public double getVolume()
    {
        return longueur * largeur;
    }





}
