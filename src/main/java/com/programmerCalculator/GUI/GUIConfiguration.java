package com.programmerCalculator.GUI;

import com.programmerCalculator.GUI.panels.*;
import javax.swing.*;
import java.awt.*;


public class GUIConfiguration {

    private static GUIConfiguration guiConfigurationInstance = null;
    private JTextField textBinary = new JTextField();
    private JTextField textOctal = new JTextField();
    private JTextField textDecimal = new JTextField();
    private JTextField textHexadecimal = new JTextField();
    private JTextField field = new JTextField();


    private GUIConfiguration() {}


    public static GUIConfiguration getInstance() {

        if(guiConfigurationInstance==null) {
            guiConfigurationInstance = new GUIConfiguration();
            return guiConfigurationInstance;
        } else{
            return guiConfigurationInstance;
        }

     }


    public void run() {

        ExitInfoPanel exitInfoPanel = new ExitInfoPanel();
        JPanel exitInfo = exitInfoPanel.setExitInfoPanel();

        OperationsPanel operationsPanel = new OperationsPanel();
        JPanel operations = operationsPanel.createOperationsPanel();

        ResultsPanel resultsPanel = new ResultsPanel();
        JPanel results = resultsPanel.setResultsPanel(textBinary, textOctal, textDecimal, textHexadecimal);

        InsertionPanel insertionPanel = new InsertionPanel();
        JPanel centerPanel = insertionPanel.getInsertionPanel(field);

        JFrame frame = new JFrame("Programmer calculator");
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.SOUTH, exitInfo);
        frame.getContentPane().add(BorderLayout.WEST, operations);
        frame.getContentPane().add(BorderLayout.CENTER, results);
        frame.getContentPane().add(BorderLayout.NORTH, centerPanel);

        frame.setSize(650, 375);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


    public JTextField getTextBinary() {
        return textBinary;
    }


    public void setTextBinary(JTextField textBinary) {
        this.textBinary = textBinary;
    }


    public JTextField getTextOctal() {
        return textOctal;
    }


    public void setTextOctal(JTextField textOctal) {
        this.textOctal = textOctal;
    }


    public JTextField getTextDecimal() {
        return textDecimal;
    }


    public void setTextDecimal(JTextField textDecimal) {
        this.textDecimal = textDecimal;
    }


    public JTextField getTextHexadecimal() {
        return textHexadecimal;
    }


    public void setTextHexadecimal(JTextField textHexadecimal) {
        this.textHexadecimal = textHexadecimal;
    }


    public JTextField getField() {
        return field;
    }


    public void setField(JTextField field) {
        this.field = field;
    }


}
