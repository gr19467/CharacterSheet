package com.prog2.charactersheets;

import javax.swing.*;
import java.util.ArrayList;

public abstract class Background {

    public String backgroundName;

    public ArrayList<String> skillProficiencies;
    public ArrayList<String> toolProficiencies;
    public ArrayList<String> languages;
    public ArrayList<String> equipment;

    public int copper;
    public int silver;
    public int electrum;
    public int gold;
    public int platinum;

    public Background(){
        skillProficiencies = new ArrayList<>();
        toolProficiencies = new ArrayList<>();
        languages = new ArrayList<>();
        equipment = new ArrayList<>();
    }

    public abstract JPanel getSpecialUI();

    @Override
    public String toString(){
        return backgroundName;
    }

}
