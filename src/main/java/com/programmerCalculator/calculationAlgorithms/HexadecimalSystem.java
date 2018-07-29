package com.programmerCalculator.calculationAlgorithms;

import com.programmerCalculator.exceptions.HexadecimalException;
import javax.swing.*;
import java.math.BigInteger;


public class HexadecimalSystem extends JButton {

    private static BigInteger SIXTEEN = BigInteger.valueOf(16);
    private DecimalSystem decimal = new DecimalSystem();


    public String toBinary(String hex) {
        checkDigits(hex);
        return decimal.toBinary(toDecimal(hex));
    }


    public BigInteger toOctal(String hex) {
        checkDigits(hex);
        return decimal.toOctal(toDecimal(hex));
    }


    public BigInteger toDecimal(String hex) {

        checkDigits(hex);
        char[] chars = hex.toCharArray();
        char hexDigit;
        int arrayLength = chars.length;
        int pow = 0;
        BigInteger sum = BigInteger.ZERO;

        for (int i = arrayLength - 1; i >= 0; i--) {
            hexDigit = chars[i];
            sum = countNextChar(hexDigit, pow, sum);
            pow++;
        }

        return sum;

    }


    private BigInteger countNextChar(char hexDigit, int pow, BigInteger sum) {

        BigInteger digit;
        switch (hexDigit) {
            case '0':
                //do nothing without an exception ;-)
                break;
            case '1':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(SIXTEEN.pow(pow)));
                break;
            case '2':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(SIXTEEN.pow(pow)));
                break;
            case '3':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(SIXTEEN.pow(pow)));
                break;
            case '4':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(SIXTEEN.pow(pow)));
                break;
            case '5':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(SIXTEEN.pow(pow)));
                break;
            case '6':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(SIXTEEN.pow(pow)));
                break;
            case '7':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(SIXTEEN.pow(pow)));
                break;
            case '8':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(SIXTEEN.pow(pow)));
                break;
            case '9':
                digit = loadValue(hexDigit);
                sum = sum.add(digit.multiply(SIXTEEN.pow(pow)));
                break;
            case 'A':
                sum = sum.add(BigInteger.valueOf(10L).multiply(SIXTEEN.pow(pow)));
                break;
            case 'B':
                sum = sum.add(BigInteger.valueOf(11L).multiply(SIXTEEN.pow(pow)));
                break;
            case 'C':
                sum = sum.add(BigInteger.valueOf(12L).multiply(SIXTEEN.pow(pow)));
                break;
            case 'D':
                sum = sum.add(BigInteger.valueOf(13L).multiply(SIXTEEN.pow(pow)));
                break;
            case 'E':
                sum = sum.add(BigInteger.valueOf(14L).multiply(SIXTEEN.pow(pow)));
                break;
            case 'F':
                sum = sum.add(BigInteger.valueOf(15L).multiply(SIXTEEN.pow(pow)));
                break;
        }

        return sum;

    }


    private BigInteger loadValue(char hexDigit) {
        return BigInteger.valueOf(Long.valueOf(String.valueOf(hexDigit)));
    }


    private void checkDigits (String hex) throws HexadecimalException {

        int length = hex.length();
        char[] chars = hex.toCharArray();

        for (int i = 0; i < length; i++) {
            char hexDigit = chars[i];
            switch (hexDigit) {
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
                case '8':
                    break;
                case '9':
                    break;
                case 'A':
                    break;
                case 'B':
                    break;
                case 'C':
                    break;
                case 'D':
                    break;
                case 'E':
                    break;
                case 'F':
                    break;
                default:
                    throw new HexadecimalException();
            }

        }

    }


}
