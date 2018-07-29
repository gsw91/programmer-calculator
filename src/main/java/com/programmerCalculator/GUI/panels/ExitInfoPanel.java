package com.programmerCalculator.GUI.panels;

import com.programmerCalculator.GUI.otherFrames.InformationFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class ExitInfoPanel extends JPanel {


    public JPanel setExitInfoPanel() {

        JButton exitButton = new JButton("Exit");
        exitButton.addActionListener(new ExitButtonListener());

        JButton information = new JButton("Information");
        information.addActionListener(new InformationButtonListener());

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(1, 2));
        panel.add(exitButton);
        panel.add(information);

        return panel;

    }


    public class InformationButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            InformationFrame frame = new InformationFrame();
            frame.showInformationFrame();
        }

    }


    public class ExitButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                Thread.sleep(500);
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
            System.exit(0);
        }

    }


}
