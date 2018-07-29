package com.programmerCalculator.calculationAlgorithms;

import com.programmerCalculator.exceptions.OctalException;
import javax.swing.*;
import java.math.BigInteger;


public class OctalSystem extends JButton {

    private static BigInteger EIGHT = BigInteger.valueOf(8);
    private DecimalSystem decimal = new DecimalSystem();


    public String toBinary(BigInteger oct) {
        checkDigit(oct);
        return decimal.toBinary(toDecimal(oct));
    }


    public String toHexadecimal(BigInteger oct) {
        checkDigit(oct);
        return decimal.toHexadecimal(toDecimal(oct));
    }


    public BigInteger toDecimal(BigInteger oct) {

        checkDigit(oct);
        BigInteger result = BigInteger.ZERO;
        String number = String.valueOf(oct);
        int length = number.length();
        int pow = 0;

        if (oct.equals(BigInteger.ZERO)) {
            return result;
        } else {
            for (int i = length; i > 0; i--) {
                char digit = number.charAt(i - 1);
                result = countDigits(digit, result, pow);
                pow++;
            }
        }

        return result;

    }


    private BigInteger countDigits(char hexDigit, BigInteger sum, int pow) {

        BigInteger digit;
        switch (hexDigit) {
            case '0':
                //do nothing
                break;
            case '1':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(EIGHT.pow(pow)));
                break;
            case '2':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(EIGHT.pow(pow)));
                break;
            case '3':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(EIGHT.pow(pow)));
                break;
            case '4':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(EIGHT.pow(pow)));
                break;
            case '5':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(EIGHT.pow(pow)));
                break;
            case '6':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(EIGHT.pow(pow)));
                break;
            case '7':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(EIGHT.pow(pow)));
                break;
        }

        return sum;

    }


    private BigInteger loadValue(char hexDigit) {
        return BigInteger.valueOf(Long.valueOf(String.valueOf(hexDigit)));
    }


    private void checkDigit (BigInteger oct){

        String number = String.valueOf(oct);
        int length = number.length();
        char[] digits = number.toCharArray();

        for (int i=0; i<length; i++) {
            char digit = digits[i];

            switch (digit) {
                case '0':
                    break;
                case '1':
                    break;
                case '2':
                    break;
                case '3':
                    break;
                case '4':
                    break;
                case '5':
                    break;
                case '6':
                    break;
                case '7':
                    break;
                default:
                    throw new OctalException();
            }

        }

    }


}