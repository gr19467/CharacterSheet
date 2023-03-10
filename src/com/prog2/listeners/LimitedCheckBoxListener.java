package com.prog2.listeners;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class LimitedCheckBoxListener implements ItemListener {

    private JCheckBox[] boxes; // the checkboxes we are dealing with
    private int selectedCount; // the number of check boxes currently selected
    private int MAX_CHOICES; // the maximum number of check boxes I can select

    public LimitedCheckBoxListener(int choiceLimit, JCheckBox... boxes){
        this.MAX_CHOICES = choiceLimit;
        this.boxes = boxes;

        selectedCount = 0;
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        JCheckBox source = (JCheckBox) e.getSource();

        if(source.isSelected()){
            selectedCount++;

            if(selectedCount >= MAX_CHOICES){
                for (JCheckBox box : boxes) {
                    if(!box.isSelected()){
                        box.setEnabled(false);
                    }
                }
            }

        }else{
            // if I just deselected this box...
            if(selectedCount >= MAX_CHOICES){
                for (JCheckBox box: boxes){
                    if(!box.isEnabled()){
                        box.setEnabled(true);
                    }
                }
            }

            selectedCount--;

        }
    }
}
