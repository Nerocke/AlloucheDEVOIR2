package Entities.Exo1;

public class Forage extends Captage implements IVolume
{
    protected int diametre;

    protected double volume;

    public Forage(int idCaptage, String nomCaptage, int hauteurCaptage, int unDiametre, double unVolume)
    {
        super(idCaptage,nomCaptage, hauteurCaptage);

        diametre = unDiametre;

        volume = unVolume;
    }


    @Override
    public String getDescription() {
        return super.getDescription();
    }

    public Double getVolume()
    {
        return hauteurCaptage * diametre * Math.PI;
    }
}
