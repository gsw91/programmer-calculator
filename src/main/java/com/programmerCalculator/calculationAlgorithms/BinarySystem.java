package com.programmerCalculator.calculationAlgorithms;

import com.programmerCalculator.exceptions.BinaryException;
import javax.swing.*;
import java.math.BigInteger;


public class BinarySystem extends JButton {

    private static BigInteger TWO = BigInteger.valueOf(2);
    private DecimalSystem decimal = new DecimalSystem();


    public String toHexadecimal(String binary) {
        checkDigits(binary);
        return decimal.toHexadecimal(toDecimal(binary));
    }


    public BigInteger toOctal(String binary) {
        checkDigits(binary);
        return decimal.toOctal(toDecimal(binary));
    }


    public BigInteger toDecimal(String binary) {

        checkDigits(binary);
        int length = binary.length();
        int pow = 0;
        BigInteger result = BigInteger.ZERO;
        String digit;

        for (int i = length; i > 0; i--) {
            digit = binary.substring(i - 1, i);
            int digitInt = Integer.parseInt(digit);
            if (digitInt != 0) {
                result = result.add(BigInteger.valueOf(digitInt).multiply(TWO.pow(pow)));
            }
            pow++;
        }

        return result;

    }


    private void checkDigits(String binary) throws BinaryException {

        int length = binary.length();

        for (int i=0; i<length; i++) {
            String digit = binary.substring(i, i+1);
            int value;

            try {
                value = Integer.valueOf(digit);
                if(value>1 || value<0) {
                    throw new BinaryException();
                }
            } catch (NumberFormatException e) {
                throw new BinaryException();
            }

        }

    }


}