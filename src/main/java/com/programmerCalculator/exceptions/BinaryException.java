package com.programmerCalculator.exceptions;

import com.programmerCalculator.GUI.GUIConfiguration;


public class BinaryException extends IllegalArgumentException {

    private static String message = "Binary number should contain only 1 or 0";


    public BinaryException() {

        GUIConfiguration configuration = GUIConfiguration.getInstance();
        configuration.getTextBinary().setText(message);
        configuration.getField().setCaretPosition(configuration.getField().getColumns());
        configuration.getField().setText("");
        configuration.getField().requestFocus();

    }


    @Override
    public String getMessage() {
        return message;
    }


}
