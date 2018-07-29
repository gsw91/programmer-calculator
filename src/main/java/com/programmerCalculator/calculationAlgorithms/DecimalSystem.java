package com.programmerCalculator.calculationAlgorithms;

import com.programmerCalculator.exceptions.DecimalException;
import javax.swing.*;
import java.math.BigInteger;


public class DecimalSystem extends JButton {

    private static BigInteger SIXTEEN = BigInteger.valueOf(16);
    private static BigInteger EIGHT = BigInteger.valueOf(8);
    private static BigInteger TWO = BigInteger.valueOf(2);


    public String toHexadecimal(BigInteger dec) {

        if (dec.equals(BigInteger.ZERO)) {
            return "0";
        }

        StringBuilder hexScore = new StringBuilder();
        while (!dec.equals(BigInteger.ZERO)) {
            String modulo = String.valueOf(dec.mod(SIXTEEN));
            hexScore = addNextChar(modulo, hexScore);
            dec = dec.divide(SIXTEEN);
        }

        return hexScore.toString();

    }


    private StringBuilder addNextChar(String modulo, StringBuilder hexScore) {

        switch (modulo) {
            case "0":
                hexScore.insert(0, "0");
                break;
            case "1":
                hexScore.insert(0, "1");
                break;
            case "2":
                hexScore.insert(0, "2");
                break;
            case "3":
                hexScore.insert(0, "3");
                break;
            case "4":
                hexScore.insert(0, "4");
                break;
            case "5":
                hexScore.insert(0, "5");
                break;
            case "6":
                hexScore.insert(0, "6");
                break;
            case "7":
                hexScore.insert(0, "7");
                break;
            case "8":
                hexScore.insert(0, "8");
                break;
            case "9":
                hexScore.insert(0, "9");
                break;
            case "10":
                hexScore.insert(0, "A");
                break;
            case "11":
                hexScore.insert(0, "B");
                break;
            case "12":
                hexScore.insert(0, "C");
                break;
            case "13":
                hexScore.insert(0, "D");
                break;
            case "14":
                hexScore.insert(0, "E");
                break;
            case "15":
                hexScore.insert(0, "F");
                break;
            default:
                throw new DecimalException();
        }

        return hexScore;

    }


    public BigInteger toOctal(BigInteger dec) {

        if(dec.equals(BigInteger.ZERO)) {
            return BigInteger.ZERO;
        }

        StringBuilder resultBuilder = new StringBuilder();
        int modulo;

        while (!dec.equals(BigInteger.ZERO)) {
            modulo = dec.mod(EIGHT).intValue();
            dec = dec.divide(EIGHT);
            resultBuilder.insert(0, modulo);
        }

        return new BigInteger(resultBuilder.toString());

    }



    public String toBinary(BigInteger dec) {

        BigInteger modulo;
        StringBuilder stringBuilder = new StringBuilder();

        if(dec.equals(BigInteger.ZERO)) {
            return "0";
        }

        while(!dec.equals(BigInteger.ZERO)) {
            modulo = dec.mod(TWO);
            stringBuilder.append(modulo);
            if (modulo.equals(BigInteger.ONE)) {
                dec = (dec.subtract(BigInteger.ONE)).divide(TWO);
            } else {
                dec = dec.divide(TWO);
            }
        }

        return stringBuilder.reverse().toString();

    }


}
