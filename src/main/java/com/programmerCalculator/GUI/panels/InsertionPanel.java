package com.programmerCalculator.GUI.panels;

import com.programmerCalculator.GUI.GUIConfiguration;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class InsertionPanel extends JPanel {


    public JPanel getInsertionPanel(JTextField insertionField) {

        JLabel centerLabel = new JLabel();
        centerLabel.setFont(new Font(Font.SERIF, Font.PLAIN, 16));
        centerLabel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        centerLabel.setText(" Number to convert ");
        centerLabel.setSize(150, 50);

        JButton delete = new JButton("DEL");
        delete.addActionListener(new DeleteButtonListener());

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.X_AXIS));
        centerPanel.add(centerLabel);
        centerPanel.add(delete);
        centerPanel.add(insertionField);

        return centerPanel;

    }


    class DeleteButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            GUIConfiguration guiConfiguration = GUIConfiguration.getInstance();
            JTextField field = guiConfiguration.getField();
            String number = field.getText();
            int length = number.length();
            String delete = number.substring(0, length-1);
            field.setText(delete);
            guiConfiguration.setField(field);

        }

    }


}
