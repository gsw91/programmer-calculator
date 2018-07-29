package com.programmerCalculator.GUI.panels;

import javax.swing.*;
import java.awt.*;


public class ResultsPanel {


    public JPanel setResultsPanel(JTextField textBinary, JTextField textOctal,
                                  JTextField textDecimal, JTextField textHexadecimal) {

        textBinary.setFont(new Font(Font.SERIF, Font.BOLD, 14));
        textBinary.setSize(100, 50);
        textBinary.setEditable(false);

        textOctal.setFont(new Font(Font.SERIF, Font.BOLD, 14));
        textOctal.setSize(100, 50);
        textOctal.setEditable(false);

        textDecimal.setFont(new Font(Font.SERIF, Font.BOLD, 14));
        textDecimal.setSize(100, 50);
        textDecimal.setEditable(false);

        textHexadecimal.setFont(new Font(Font.SERIF, Font.BOLD, 14));
        textHexadecimal.setSize(100, 50);
        textHexadecimal.setEditable(false);

        JLabel result = new JLabel("Results", JLabel.CENTER);
        result.setFont(new Font(Font.SERIF, Font.BOLD, 16));
        result.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        JPanel results = new JPanel();
        results.setLayout(new GridLayout(5, 1));
        results.add(result);
        results.add(textBinary);
        results.add(textDecimal);
        results.add(textOctal);
        results.add(textHexadecimal);

        return results;

    }


}
