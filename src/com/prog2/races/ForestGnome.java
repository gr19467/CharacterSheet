package com.prog2.races;

import com.prog2.races.CreatureSize;
import com.prog2.races.Race;

import javax.swing.*;

public class ForestGnome extends Race {

    public ForestGnome(){
        super();

        this.raceName = "Forest Gnome";
        this.size = CreatureSize.SMALL;
        this.speed = 25;

        this.dexterity = 1;
        this.intelligence = 2;

        this.proficiencies.add("Darkvision");

        this.languages.add("Common");
        this.languages.add("Gnomish");

        this.spells.add("Minor Illusion");
    }

    @Override
    public JPanel getSpecialUI() {
        return null;
    }
}
