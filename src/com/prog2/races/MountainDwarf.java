package com.prog2.races;

import com.prog2.races.CreatureSize;
import com.prog2.races.Race;

import javax.swing.*;

public class MountainDwarf extends Race {

    public MountainDwarf(){
        super();

        this.raceName = "Mountain Dwarf";
        this.size = CreatureSize.MEDIUM;
        this.speed = 25;

        this.strength = 2;
        this.constitution = 2;

        this.languages.add("Dwarfish");
        this.languages.add("Common");

        this.traits.add("Darkvision");
        this.traits.add("Poison Resistance");
    }

    @Override
    public JPanel getSpecialUI() {
        return null;
    }
}
