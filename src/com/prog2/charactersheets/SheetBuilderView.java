package com.prog2.charactersheets;

import com.prog2.panels.AbilityPanel;
import com.prog2.panels.ClassPanel;
import com.prog2.panels.InfoPanel;
import com.prog2.panels.RacePanel;

import javax.swing.*;
import java.awt.*;

public class SheetBuilderView extends JFrame {

    private JTabbedPane tabs;
    private JPanel raceTab, classTab, infoTab, abilityTab;

    public SheetBuilderView(){
        tabs = new JTabbedPane();

        raceTab = new RacePanel();
        classTab = new ClassPanel();
        infoTab = new InfoPanel();
        abilityTab = new AbilityPanel();

        tabs.add("Choose a Race", raceTab);
        tabs.add("Choose a Class", classTab);
        tabs.add("Choose a Name and Background", infoTab);
        tabs.add("Roll Your Abilities", abilityTab);

        this.add(tabs, BorderLayout.CENTER);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800,500);
        setVisible(true);
    }

}
