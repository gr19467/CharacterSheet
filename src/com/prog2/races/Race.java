package com.prog2.races;


import javax.swing.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


public abstract class Race implements Serializable {

    /// region Racial Information
    public String raceName;
    public CreatureSize size;
    public int speed;

    public ArrayList<Race> subRaces;

    /// endregion

    // * bonus stats are added to a character's rolled ability scores

    /// region Racial Bonus Stats

    public int hp;
    public int strength;
    public int dexterity;
    public int constitution;
    public int intelligence;
    public int wisdom;
    public int charisma;

    /// endregion

    /// region Proficiencies and Features
    // * Features and Traits
    public ArrayList<String> traits;

    // * Proficiencies
    public ArrayList<String> languages;
    public ArrayList<String> proficiencies;

    // * Equipment
    public ArrayList<String> equipment;
    public ArrayList<String> weapons;
    public ArrayList<String> armor;
    public ArrayList<String> spells;

    public Map<String, Boolean> skills;
    /// endregion

    public Race() {
        subRaces = new ArrayList<>();
        traits = new ArrayList<>();
        languages = new ArrayList<>();
        proficiencies = new ArrayList<>();
        equipment = new ArrayList<>();
        weapons = new ArrayList<>();
        armor = new ArrayList<>();
        spells = new ArrayList<>();
        skills = new HashMap<>();
    }

    /**
     * Races often have unique choices to make based on the race.
     * As a result, every race is equipped with an option for a custom UI.
     * This custom UI can then be retrieved and added to the main com.prog2.races.Race Choosing UI when a race is selected.
     * @return
     */
    public abstract JPanel getSpecialUI();

    @Override
    public String toString(){
        return raceName;
    }

}
