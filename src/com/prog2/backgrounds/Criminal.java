package com.prog2.backgrounds;

import com.prog2.charactersheets.Background;

import javax.swing.*;

public class Criminal extends Background {

    public Criminal(){
        backgroundName = "Criminal";

        skillProficiencies.add("Deception");
        skillProficiencies.add("Stealth");

        toolProficiencies.add("Thieves' Tools");

        equipment.add("Crowbar");
        equipment.add("Dark Common Clothes");
        equipment.add("Belt Pouch");

        //get the languages that come with the race that was selected...somehow
    }

    @Override
    public JPanel getSpecialUI() {
        //I don't think there's any special stuff for this background? There's no choices to be made
        return null;
    }
}
