package com.programmerCalculator.exceptions;

import com.programmerCalculator.GUI.GUIConfiguration;


public class OctalException extends IllegalArgumentException {

    private static String message = "Octal number should only contain values from 7 to 0";


    public OctalException() {

        GUIConfiguration configuration = GUIConfiguration.getInstance();
        configuration.getTextOctal().setText(message);
        configuration.getField().setCaretPosition(configuration.getField().getColumns());
        configuration.getField().setText("");
        configuration.getField().requestFocus();

    }


    @Override
    public String getMessage() {
        return message;
    }


}
