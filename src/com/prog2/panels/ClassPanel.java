package com.prog2.panels;

import com.prog2.classes.Barbarian;
import com.prog2.classes.CharacterClass;

import javax.swing.*;
import java.awt.*;

public class ClassPanel extends JPanel {

    private JPanel classChoicePanel;
    private JComboBox<CharacterClass> classCombo;
    private JLabel classChoiceLabel;

    public ClassPanel(){
        classChoicePanel = new JPanel();

        // what layout should the choice panel use?
        classChoicePanel.setLayout(new GridLayout(2,2));

        //should the combo be initialized here, or should I make a method for it?
        initClassCombo();

        classChoiceLabel = new JLabel("Choose your Class");

        classChoicePanel.add(classChoiceLabel);
        classChoicePanel.add(classCombo);

        this.add(classChoicePanel);

        onClassSelected();
    }

    private void initClassCombo() {
        classCombo = new JComboBox<>();

        classCombo.addItem(new Barbarian());

        //parameter -> function
        classCombo.addActionListener(e -> onClassSelected());
    }

    private void onClassSelected(){
        //store the chosen class into a local variable
        CharacterClass chosen = (CharacterClass)classCombo.getSelectedItem();

        add(chosen.getSpecialUI());
    }

}
