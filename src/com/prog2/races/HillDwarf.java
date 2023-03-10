package com.prog2.races;

import com.prog2.races.CreatureSize;
import com.prog2.races.Race;

import javax.swing.*;

public class HillDwarf extends Race {

    public HillDwarf(){
        super();

        this.raceName = "Hill Dwarf";
        this.size = CreatureSize.MEDIUM;
        this.speed = 25;

        this.hp = 1;
        this.constitution = 2;
        this.wisdom = 1;

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
