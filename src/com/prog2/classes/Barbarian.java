package com.prog2.classes;

import com.prog2.listeners.LimitedCheckBoxListener;

import javax.swing.*;
import java.awt.*;

public class Barbarian extends CharacterClass {

    private String[] skillChoices = {
            "Animal Handling", "Athletics", "Intimidation", "Nature", "Perception", "Survival"
    };

    private JCheckBox[] skillCheckBoxes;

    private String[] startingEquipment1 = {
            "Greataxe", "Martial meelee weapon"
    };

    public String[] startingEquipment2 = {
            "Two handaxes", "Simple weapon"
    };

    public Barbarian(){
        super();

        this.className = "Barbarian";
        this.hitDice = 1;
        this.proficiencies.add("Light armor");
        this.proficiencies.add("Medium armor");
        this.proficiencies.add("Shields");
        this.proficiencies.add("Simple weapons");
        this.proficiencies.add("Martial weapons");

        this.savingThrows.put("Strength", true);
        this.savingThrows.put("Constitution", true);

        this.startingEquipment.put("Explorer's pack", true);
        this.startingEquipment.put("Javelin", true);

    }

    @Override
    public JPanel getSpecialUI() {
        JPanel specialUI = new JPanel(new GridLayout(0, 2));

        JLabel skillChoiceLabel = new JLabel("Choose two of the following skills: ");
        JLabel equipmentChoiceLabel1 = new JLabel("Choose your Starting Equipment 1");
        JLabel equipmentChoiceLabel2 = new JLabel("Choose your Starting Equipment 2");

        JPanel skillChoicePanel = new JPanel();
        skillChoicePanel.setLayout(new BoxLayout(skillChoicePanel,BoxLayout.PAGE_AXIS));

        skillCheckBoxes = new JCheckBox[skillChoices.length];

        LimitedCheckBoxListener listener = new LimitedCheckBoxListener(2, skillCheckBoxes);

        for (int i = 0; i < skillCheckBoxes.length; i++) {
            skillCheckBoxes[i] = new JCheckBox(skillChoices[i]);
            skillCheckBoxes[i].addItemListener(listener);
            skillChoicePanel.add(skillCheckBoxes[i]);
        }

        specialUI.add(skillChoiceLabel);
        specialUI.add(skillChoicePanel);

        JComboBox<String> equipmentChoiceBox1 = new JComboBox<>();
        JComboBox<String> equipmentChoiceBox2 = new JComboBox<>();

        for (String s : startingEquipment1){
            equipmentChoiceBox1.addItem(s);
        }

        for (String s : startingEquipment2){
            equipmentChoiceBox2.addItem(s);
        }

        equipmentChoiceBox1.addActionListener(e -> {
            startingEquipment.put(e.getActionCommand(), true);
            System.out.println(e.getActionCommand());
        });

        equipmentChoiceBox2.addActionListener(e -> {
            startingEquipment.put(e.getActionCommand(), true);
            System.out.println(e.getActionCommand());
        });

        specialUI.add(equipmentChoiceLabel1);
        specialUI.add(equipmentChoiceBox1);

        specialUI.add(equipmentChoiceLabel2);
        specialUI.add(equipmentChoiceBox2);

        return specialUI;
    }
}
