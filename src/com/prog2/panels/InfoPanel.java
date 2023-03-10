package com.prog2.panels;

import com.prog2.backgrounds.Criminal;
import com.prog2.charactersheets.Alignment;
import com.prog2.charactersheets.Background;

import javax.swing.*;
import java.awt.*;

public class InfoPanel extends JPanel {

    private JPanel characterInfoPanel;

    public JTextField characterName;
    public JLabel characterNameLabel;

    public JTextField playerName;
    public JLabel playerNameLabel;

    private JComboBox<Alignment> alignmentCombo;
    private JLabel alignmentChoiceLabel;

    private JComboBox<Background> backgroundCombo;
    private JLabel backgroundChoiceLabel;

    public InfoPanel(){
        super();

        characterInfoPanel = new JPanel();
        characterInfoPanel.setLayout(new GridLayout(0,2));

        characterName = new JTextField();
        characterNameLabel = new JLabel("Character Name: ");

        playerName = new JTextField();
        playerNameLabel = new JLabel("Player Name: ");

        initAlignmentCombo();
        initBackgroundCombo();

        alignmentChoiceLabel = new JLabel("Choose your Alignment");
        backgroundChoiceLabel = new JLabel("Choose your Background");

        characterInfoPanel.add(characterNameLabel);
        characterInfoPanel.add(characterName);

        characterInfoPanel.add(playerNameLabel);
        characterInfoPanel.add(playerName);

        characterInfoPanel.add(alignmentChoiceLabel);
        characterInfoPanel.add(alignmentCombo);

        characterInfoPanel.add(backgroundChoiceLabel);
        characterInfoPanel.add(backgroundCombo);

        this.add(characterInfoPanel);

        onAlignmentSelected();
        onAlignmentSelected();
    }

    private void initAlignmentCombo(){
        alignmentCombo = new JComboBox<>();

        alignmentCombo.addActionListener(e -> onAlignmentSelected());
    }

    private void onAlignmentSelected(){
        Alignment chosen = (Alignment)alignmentCombo.getSelectedItem();

        for (Alignment alignment: Alignment.values()) {
            alignmentCombo.addItem(alignment);
        }
    }

    private void initBackgroundCombo(){
        backgroundCombo = new JComboBox<>();

        backgroundCombo.addItem(new Criminal());

        backgroundCombo.addActionListener(e -> onBackgroundSelected());
    }

    private void onBackgroundSelected(){
        Background chosen = (Background)backgroundCombo.getSelectedItem();

        add(chosen.getSpecialUI());
    }
}
