package com.prog2.races;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Dwarf extends Race {

    protected String[] toolChoices = {
            "Smith's Tools", "Brewer's Supplies", "Mason's Tools"
    };

    /***
     * Creates an instance of Dwarf for Reference Purposes Only.
     * "Dwarf" should never be chosen as a fully fledged race. It should only be used via its subraces.
     */
    public Dwarf(){

        this.subRaces.add(new HillDwarf());
        this.subRaces.add(new MountainDwarf());

        this.raceName = "Dwarf";
    }

    /**
     * When called from a subrace, sets all stats, traits, and proficiencies that are shared by all
     * subraces of Dwarf.
     * @param subRaceName
     */
    protected Dwarf(String subRaceName){
        this.raceName = subRaceName;
        this.size = CreatureSize.MEDIUM;
        this.speed = 25;

        this.constitution = 2;

        this.languages.add("Dwarvish");
        this.languages.add("Common");

        this.traits.add("Darkvision");
        this.traits.add("Dwarven Resilience");
        this.traits.add("Stonecutting");

        this.proficiencies.add("Battleaxe");
        this.proficiencies.add("Handaxe");
        this.proficiencies.add("Throwing Hammer");
        this.proficiencies.add("Warhammer");
    }

    /**
     * Dwarves have to choose a set of tools to be proficient in.
     * This panel will contain a combo box
     * @return
     */
    @Override
    public JPanel getSpecialUI() {

        JPanel specialBoy = new JPanel(new GridLayout(0, 2));

        JLabel toolChoiceLabel = new JLabel("Choose a set of Tools to be Proficient In: ");

        JComboBox<String> toolChoiceBox = new JComboBox<>();

        for (String s : toolChoices) {
            toolChoiceBox.addItem(s);
        }

        toolChoiceBox.addActionListener(e -> {
            proficiencies.add(e.getActionCommand());
            System.out.println(e.getActionCommand());
        });

        specialBoy.add(toolChoiceLabel);
        specialBoy.add(toolChoiceBox);
        return specialBoy;
    }

}
