package com.prog2.classes;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public abstract class CharacterClass {

    public String className;
    public int hitDice;
    public ArrayList<String> proficiencies;
    public Map<String, Boolean> savingThrows;
    public Map<String, Boolean> skills;
    public Map<String, Boolean> startingEquipment;
    public ArrayList<String> traits;

    public CharacterClass(){
        proficiencies = new ArrayList<>();
        savingThrows = new HashMap<>();
        skills = new HashMap<>();
        startingEquipment = new HashMap<>();
        traits = new ArrayList<>();
    }

    @Override
    public String toString() {
        return className;
    }

    public abstract JPanel getSpecialUI();
}
