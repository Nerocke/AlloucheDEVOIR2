package Entities.Exo2;

public class Participant
{
    private int idParticipant;
    private String nomParticipant;
    private boolean estPresent;
    private int nbKm;

    public Participant(int idParticipant, String nomParticipant, boolean estPresent, int nbKm) {
        this.idParticipant = idParticipant;
        this.nomParticipant = nomParticipant;
        this.estPresent = estPresent;
        this.nbKm = nbKm;
    }

    public boolean isEstPresent() {
        return estPresent;
    }

    public int getNbKm() {
        return nbKm;
    }
}
