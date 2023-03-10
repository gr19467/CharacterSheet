package com.prog2.races;

import com.prog2.races.CreatureSize;
import com.prog2.races.Race;

import javax.swing.*;

public class RockGnome extends Race {

    public RockGnome(){
        super();

        this.raceName = "Rock Gnome";
        this.size = CreatureSize.SMALL;
        this.speed = 25;

        this.constitution = 1;
        this.intelligence = 2;

        this.proficiencies.add("Darkvision");

        this.languages.add("Common");
        this.languages.add("Gnomish");
    }

    @Override
    public JPanel getSpecialUI() {
        return null;
    }
}
