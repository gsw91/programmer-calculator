package com.programmerCalculator.exceptions;

import com.programmerCalculator.GUI.GUIConfiguration;


public class DecimalException extends IllegalArgumentException {

    private static String message = "Decimal number should only contain values from 9 to 0";


    public DecimalException() {

        GUIConfiguration configuration = GUIConfiguration.getInstance();
        configuration.getTextDecimal().setText(message);
        configuration.getField().setCaretPosition(configuration.getField().getColumns());
        configuration.getField().setText("");
        configuration.getField().requestFocus();

    }


    @Override
    public String getMessage() {
        return message;
    }


}
