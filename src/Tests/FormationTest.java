package Tests;

import Entities.Exo2.Formation;
import Entities.Exo2.Participant;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class FormationTest
{
    private Formation formation;
    private Participant participant1;
    private Participant participant2;
    private Participant participant3;
    private Participant participant4;
    private Participant participant5;
    @BeforeEach
    void setUp()
    {
        formation = new Formation(1,"Excel", 150);
        participant1 = new Participant(1,"Gand", false, 45);
        participant2 = new Participant(2,"Alison", true, 90);
        participant3 = new Participant(3,"Muller", true, 111);
        participant4 = new Participant(4,"Fortin", false, 17);
        participant5 = new Participant(5,"Cousinot", true, 34);
    }

    @org.junit.jupiter.api.Test
    void getNombreDePresents()
    {
        // Cas n°1 : On ajoute les 2 premiers participants à la formation



        // Cas n°2 : on ajoute le reste des participants


    }

    @org.junit.jupiter.api.Test
    void calculerFraisRemboursementKilometriques()
    {
        // Cas n°1 : On ajoute les 3 premiers participants à la formation



        // Cas n°2 : on ajoute le reste des participants



    }

    @org.junit.jupiter.api.Test
    void tauxDePresence()
    {
        // Cas n°1 : On ajoute les 2 premiers participants à la formation



        // Cas n°2 : on ajoute le reste des participants


    }

    @org.junit.jupiter.api.Test
    void beneficeFormation()
    {
        // Cas n°1 : On ajoute les 2 premiers participants à la formation


        // Cas n°2 : on ajoute le reste des participants


    }
}