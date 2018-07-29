package com.programmerCalculator.exceptions;

import com.programmerCalculator.GUI.GUIConfiguration;


public class HexadecimalException extends IllegalArgumentException {

    private static String message = "Hexadecimal number should contain values from 9 to 0 and letters from A to F";


    public HexadecimalException() {

        GUIConfiguration configuration = GUIConfiguration.getInstance();
        configuration.getTextHexadecimal().setText(message);
        configuration.getField().setCaretPosition(configuration.getField().getColumns());
        configuration.getField().setText("");
        configuration.getField().requestFocus();

    }


    @Override
    public String getMessage() {
        return message;
    }


}
