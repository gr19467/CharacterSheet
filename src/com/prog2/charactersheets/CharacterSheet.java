package com.prog2.charactersheets;

import com.prog2.classes.CharacterClass;
import com.prog2.races.Race;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class CharacterSheet implements Serializable {
    public String characterName;
    public CharacterClass characterClass;

    public int level;

    public Race race;
    public Background background;
    public Alignment alignment;
    public String playerName;

    public int xp;

    public int armorClass;
    public int initiative;
    public int speed;

    public int maxHP;
    public int currentHP;

    public int hitDiceType;
    public int amountHitDice;
    
    //proficiency bonus
    public int strength;

    public int dexterity;

    public int constitution;

    public int intelligence;

    public int wisdom;

    public int charisma;

    // * Passives
    public int passivePerception;

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

    // * Skills and Saving Throws
    public Map<String, Boolean> skills;
    public Map<String, Boolean> savingThrows;

    // * Money
    public int copper;
    public int silver;
    public int electrum;
    public int gold;
    public int platinum;

    public CharacterSheet(){

    }
}
