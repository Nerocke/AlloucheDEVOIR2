package Vues;

import Entities.Exo1.Captage;
import Entities.Exo1.Cuve;
import Entities.Exo1.Forage;
import Tools.ModelJTable;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collections;

public class FrmMenu extends JFrame{
    private JPanel pnlRoot;
    private JTable tblCaptages;
    ArrayList<Captage> mesCaptages;
    ModelJTable mdl;

    public FrmMenu()
    {
        this.setTitle("Devoir - Concepts POO");
        this.setContentPane(pnlRoot);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);

        mesCaptages = new ArrayList<>();
        LoadDatas();

        // A compléter ici
        mdl = new ModelJTable();
        mdl.LoadDatas(mesCaptages);
        tblCaptages.setModel(mdl);

        tblCaptages.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);

                int numCaptage = Integer.parseInt(tblCaptages.getValueAt(tblCaptages.getSelectedRow(),0).toString());
                for(Captage capt : mesCaptages)
                {
                    if(capt.getIdCaptage() == numCaptage)
                    {
                        mdl = new ModelJTable();
                        mdl.LoadDatas(capt.getIdCaptage());
                        tblCaptages.setModel(mdl);
                        break;
                    }
                }
            }


























    }

    public void LoadDatas()
    {

        Captage cap1 = new Captage(3,"Captage du bois du pin", 23, 500);
        Captage cap2 = new Captage(5,"Captage du lac", 37, 780);
        Forage for1 = new Forage(1,"Forage de l'enfer", 17, 56, 6);
        Forage for2 = new Forage(6,"Forage des 4 chemins", 32, 72, 9);
        Cuve cuve1 = new Cuve(2,"Cuve du centre", 3, 14, 12, 2);
        Cuve cuve2 = new Cuve(4,"Cuve de l'avenir", 6, 15, 8, 4);
        mesCaptages.add(cap1);mesCaptages.add(cap2);
        mesCaptages.add(for1);mesCaptages.add(for2);
        mesCaptages.add(cuve1);mesCaptages.add(cuve2);

    }
}
