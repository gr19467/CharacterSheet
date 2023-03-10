package com.prog2.panels;

import com.prog2.races.Dwarf;
import com.prog2.races.Race;

import javax.swing.*;
import java.awt.*;

public class RacePanel extends JPanel {

    private JPanel raceChoicePanel;
    private JComboBox<Race> raceCombo;
    private JComboBox<Race> subCombo;

    private JLabel raceChoiceLabel;
    private JLabel subChoiceLabel;

    public RacePanel(){

        raceChoicePanel = new JPanel();
        raceChoicePanel.setLayout(new GridLayout(0,2));

        initRaceCombo();
        initSubCombo();

        raceChoiceLabel = new JLabel("Choose your Race");
        subChoiceLabel = new JLabel("Choose a Sub-race");

        raceChoicePanel.add(raceChoiceLabel);
        raceChoicePanel.add(raceCombo);
        raceChoicePanel.add(subChoiceLabel);
        raceChoicePanel.add(subCombo);

        this.add(raceChoicePanel);

        onRaceSelected();
    }

    private void initRaceCombo(){
        raceCombo = new JComboBox<>();

        raceCombo.addItem(new Dwarf());

        //parameter -> function
        raceCombo.addActionListener(e -> onRaceSelected());
    }

    private void initSubCombo(){
        subCombo = new JComboBox<>();
    }

    private void onRaceSelected(){
        //clear the sub combo
        subCombo.removeAllItems();

        //store the chosen race into a local variable
        Race chosen = (Race)raceCombo.getSelectedItem();

        //add all the subraces of the chosen race to the sub combo
        for(Race sub : chosen.subRaces){
            subCombo.addItem(sub);
        }

        //add the chosen subrace's special UI
        add(chosen.getSpecialUI());
    }
}
