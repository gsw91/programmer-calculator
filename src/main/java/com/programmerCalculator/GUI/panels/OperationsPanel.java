package com.programmerCalculator.GUI.panels;

import com.programmerCalculator.GUI.GUIConfiguration;
import com.programmerCalculator.calculationAlgorithms.*;
import com.programmerCalculator.exceptions.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.math.BigInteger;


public class OperationsPanel {

    private BinarySystem binarySystem;
    private DecimalSystem decimalSystem;
    private OctalSystem octalSystem;
    private HexadecimalSystem hexadecimalSystem;

    private JButton buttonOne = new JButton("1");
    private JButton buttonTwo = new JButton("2");
    private JButton buttonThree = new JButton("3");
    private JButton buttonFour = new JButton("4");
    private JButton buttonFive = new JButton("5");
    private JButton buttonSix = new JButton("6");
    private JButton buttonSeven = new JButton("7");
    private JButton buttonEight = new JButton("8");
    private JButton buttonNine = new JButton("9");
    private JButton buttonZero = new JButton("0");
    private JButton buttonA = new JButton("A");
    private JButton buttonB = new JButton("B");
    private JButton buttonC = new JButton("C");
    private JButton buttonD = new JButton("D");
    private JButton buttonE = new JButton("E");
    private JButton buttonF = new JButton("F");

    private GUIConfiguration guiConfiguration = GUIConfiguration.getInstance();
    private JTextField field = guiConfiguration.getField();
    private JTextField textBinary = guiConfiguration.getTextBinary();
    private JTextField textHexadecimal = guiConfiguration.getTextHexadecimal();
    private JTextField textOctal = guiConfiguration.getTextOctal();
    private JTextField textDecimal = guiConfiguration.getTextDecimal();


    public JPanel createOperationsPanel() {

        configureBinarySystem();
        configureDecimalSystem();
        configureOctalSystem();
        configureHexadecimalSystem();
        configureButtons();

        JPanel operations = new JPanel();
        operations.setLayout(new GridLayout(5, 4));
        operations.add(buttonOne);
        operations.add(buttonTwo);
        operations.add(buttonThree);
        operations.add(buttonZero);
        operations.add(buttonFour);
        operations.add(buttonFive);
        operations.add(buttonSix);
        operations.add(binarySystem);
        operations.add(buttonSeven);
        operations.add(buttonEight);
        operations.add(buttonNine);
        operations.add(decimalSystem);
        operations.add(buttonA);
        operations.add(buttonB);
        operations.add(buttonC);
        operations.add(octalSystem);
        operations.add(buttonD);
        operations.add(buttonE);
        operations.add(buttonF);
        operations.add(hexadecimalSystem);

        return operations;

    }


    private void configureBinarySystem() {

        binarySystem = new BinarySystem();
        binarySystem.setText("BIN");
        binarySystem.setSize(100, 50);
        binarySystem.addActionListener(new BinarySystemListener());

    }


    private void configureDecimalSystem() {

        decimalSystem = new DecimalSystem();
        decimalSystem.setText("DEC");
        decimalSystem.setSize(100, 50);
        decimalSystem.addActionListener(new DecimalSystemListener());

    }


    private void configureOctalSystem() {

        octalSystem = new OctalSystem();
        octalSystem.setText("OCT");
        octalSystem.setSize(100, 50);
        octalSystem.addActionListener(new OctalSystemListener());

    }


    private void configureHexadecimalSystem() {

        hexadecimalSystem = new HexadecimalSystem();
        hexadecimalSystem.setText("HEX");
        hexadecimalSystem.setSize(100, 50);
        hexadecimalSystem.addActionListener(new HexadecimalSystemListener());

    }


    private void configureButtons() {

        buttonOne.addActionListener(new ButtonOneListener());
        buttonTwo.addActionListener(new ButtonTwoListener());
        buttonThree.addActionListener(new ButtonThreeListener());
        buttonFour.addActionListener(new ButtonFourListener());
        buttonFive.addActionListener(new ButtonFiveListener());
        buttonSix.addActionListener(new ButtonSixListener());
        buttonSeven.addActionListener(new ButtonSevenListener());
        buttonEight.addActionListener(new ButtonEightListener());
        buttonNine.addActionListener(new ButtonNineListener());
        buttonZero.addActionListener(new ButtonZeroListener());
        buttonA.addActionListener(new ButtonAListener());
        buttonB.addActionListener(new ButtonBListener());
        buttonC.addActionListener(new ButtonCListener());
        buttonD.addActionListener(new ButtonDListener());
        buttonE.addActionListener(new ButtonEListener());
        buttonF.addActionListener(new ButtonFListener());

    }


    class ButtonOneListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "1");
            guiConfiguration.setField(field);
        }

    }


    class ButtonTwoListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "2");
            guiConfiguration.setField(field);
        }

    }


    class ButtonThreeListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "3");
            guiConfiguration.setField(field);
        }

    }


    class ButtonFourListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "4");
            guiConfiguration.setField(field);
        }

    }


    class ButtonFiveListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "5");
            guiConfiguration.setField(field);
        }

    }


    class ButtonSixListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "6");
            guiConfiguration.setField(field);
        }

    }


    class ButtonSevenListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "7");
            guiConfiguration.setField(field);
        }

    }


    class ButtonEightListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "8");
            guiConfiguration.setField(field);
        }

    }


    class ButtonNineListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "9");
            guiConfiguration.setField(field);
        }

    }


    class ButtonZeroListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "0");
            guiConfiguration.setField(field);
        }

    }


    class ButtonAListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "A");
            guiConfiguration.setField(field);
        }

    }


    class ButtonBListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "B");
            guiConfiguration.setField(field);
        }

    }


    class ButtonCListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "C");
            guiConfiguration.setField(field);
        }

    }


    class ButtonDListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "D");
            guiConfiguration.setField(field);
        }

    }


    class ButtonEListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "E");
            guiConfiguration.setField(field);
        }

    }


    class ButtonFListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            field.setText(field.getText() + "F");
            guiConfiguration.setField(field);
        }

    }


    class BinarySystemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                createAction();
            } catch (BinaryException exception) {
                System.out.println(exception.getMessage());
            }

        }

        private void createAction() {

            String text = field.getText();
            text = removeSpaces(text);

            if (text.length() != 0) {

                BigInteger decimalResult = binarySystem.toDecimal(text);
                String decimalValue = setSpaceOctAndDec(String.valueOf(decimalResult));
                textDecimal.setText(decimalValue);
                textDecimal.setBackground(Color.white);

                String hexadecimalResult = binarySystem.toHexadecimal(text);
                hexadecimalResult = setSpaceBinAndHex(hexadecimalResult);
                textHexadecimal.setText(hexadecimalResult);
                textHexadecimal.setBackground(Color.white);

                BigInteger octalResult = binarySystem.toOctal(text);
                String octalValue = setSpaceOctAndDec(String.valueOf(octalResult));
                textOctal.setText(octalValue);
                textOctal.setBackground(Color.white);

                text = setSpaceBinAndHex(text);
                textBinary.setText(text);
                textBinary.setBackground(Color.gray);

                field.setCaretPosition(field.getColumns());
                field.setText("");
                field.requestFocus();

                guiConfiguration.setField(field);
                guiConfiguration.setTextBinary(textBinary);
                guiConfiguration.setTextDecimal(textDecimal);
                guiConfiguration.setTextHexadecimal(textHexadecimal);
                guiConfiguration.setTextOctal(textOctal);

            }

        }

    }


    class DecimalSystemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e)  {

            try {
                createAction();
            } catch (DecimalException exception) {
                System.out.println(exception.getMessage());
            }

        }

        private void createAction() throws NumberFormatException {

            String text = guiConfiguration.getField().getText();
            text = removeSpaces(text);
            if (text.length() != 0) {

                try {

                    String binaryResult = decimalSystem.toBinary(new BigInteger(text));
                    binaryResult = setSpaceBinAndHex(binaryResult);
                    textBinary.setBackground(Color.white);
                    textBinary.setText(binaryResult);

                    String hexadecimalResult = decimalSystem.toHexadecimal(new BigInteger(text));
                    hexadecimalResult = setSpaceBinAndHex(hexadecimalResult);
                    textHexadecimal.setText(hexadecimalResult);
                    textHexadecimal.setBackground(Color.white);

                    BigInteger octalResult = decimalSystem.toOctal(new BigInteger(text));
                    String octalValue = setSpaceOctAndDec(String.valueOf(octalResult));
                    textOctal.setText(octalValue);
                    textOctal.setBackground(Color.white);

                    text = setSpaceOctAndDec(text);
                    textDecimal.setText(text);
                    textDecimal.setBackground(Color.gray);

                    field.setCaretPosition(field.getColumns());
                    field.setText("");
                    field.requestFocus();

                    guiConfiguration.setField(field);
                    guiConfiguration.setTextBinary(textBinary);
                    guiConfiguration.setTextDecimal(textDecimal);
                    guiConfiguration.setTextHexadecimal(textHexadecimal);
                    guiConfiguration.setTextOctal(textOctal);

                } catch (NumberFormatException exception) {

                    throw new DecimalException();

                }

            }

        }

    }


    class OctalSystemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            try {
                createAction();
            } catch (OctalException exception) {
                System.out.println(exception.getMessage());
            }

        }

        private void createAction() throws NumberFormatException {

            String text = field.getText();
            text = removeSpaces(text);
            if (text.length()!=0) {

                try {

                    String binaryResult = octalSystem.toBinary(new BigInteger(text));
                    binaryResult = setSpaceBinAndHex(binaryResult);
                    textBinary.setText(binaryResult);
                    textBinary.setBackground(Color.white);

                    String hexadecimalResult = octalSystem.toHexadecimal(new BigInteger(text));
                    hexadecimalResult = setSpaceBinAndHex(hexadecimalResult);
                    textHexadecimal.setText(hexadecimalResult);
                    textHexadecimal.setBackground(Color.white);

                    BigInteger octalResult = octalSystem.toDecimal(new BigInteger(text));
                    String valueDecimal = setSpaceOctAndDec(String.valueOf(octalResult));
                    textDecimal.setText(valueDecimal);
                    textDecimal.setBackground(Color.white);

                    text = setSpaceOctAndDec(text);
                    textOctal.setText(text);
                    textOctal.setBackground(Color.gray);

                    field.setCaretPosition(field.getColumns());
                    field.setText("");
                    field.requestFocus();

                    guiConfiguration.setField(field);
                    guiConfiguration.setTextBinary(textBinary);
                    guiConfiguration.setTextDecimal(textDecimal);
                    guiConfiguration.setTextHexadecimal(textHexadecimal);
                    guiConfiguration.setTextOctal(textOctal);

                } catch (NumberFormatException e) {

                    throw new OctalException();

                }

            }

        }

    }


    class HexadecimalSystemListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) throws HexadecimalException {

            try {
                createAction();
            } catch (HexadecimalException exception) {
                System.out.println(exception.getMessage());
            }
        }

        private void createAction() throws HexadecimalException {

            String text = field.getText();
            text = removeSpaces(text);
            if (text.length()!=0) {

                String binaryResult = hexadecimalSystem.toBinary(text);
                binaryResult = setSpaceBinAndHex(binaryResult);
                textBinary.setText(binaryResult);
                textBinary.setBackground(Color.white);

                BigInteger octalResult = hexadecimalSystem.toOctal(text);
                String oct = setSpaceOctAndDec(String.valueOf(octalResult));
                textOctal.setText(oct);
                textOctal.setBackground(Color.white);

                BigInteger decimalResult = hexadecimalSystem.toDecimal(text);
                String dec = setSpaceOctAndDec(String.valueOf(decimalResult));
                textDecimal.setText(dec);
                textDecimal.setBackground(Color.white);

                text = setSpaceBinAndHex(text);
                textHexadecimal.setText(text);
                textHexadecimal.setBackground(Color.gray);

                field.setCaretPosition(field.getColumns());
                field.setText("");
                field.requestFocus();

                guiConfiguration.setField(field);
                guiConfiguration.setTextBinary(textBinary);
                guiConfiguration.setTextDecimal(textDecimal);
                guiConfiguration.setTextHexadecimal(textHexadecimal);
                guiConfiguration.setTextOctal(textOctal);

            }

        }

    }


    public String removeSpaces(String textNumber) {

        int length = textNumber.length();
        int digits = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while(length!=0) {
            String digit = textNumber.substring(digits, digits+1);
            if (!digit.equals(" ")) {
                stringBuilder.append(digit);
            }
            digits++;
            length--;
        }

        return stringBuilder.toString();

    }


    public String setSpaceOctAndDec(String number) {

        int length = number.length();
        int setSpace = length;
        int digits = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (length!=0){
            String digit = number.substring(digits, digits+1);
            stringBuilder.append(digit);
            setSpace--;
            length--;
            digits++;
            if (setSpace%3==0&&setSpace!=0) {
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();

    }


    public String setSpaceBinAndHex(String number) {

        int length = number.length();
        int setSpace = length;
        int digits = 0;
        StringBuilder stringBuilder = new StringBuilder();

        while (length!=0){
            String digit = number.substring(digits, digits+1);
            stringBuilder.append(digit);
            setSpace--;
            length--;
            digits++;
            if (setSpace%4==0&&setSpace!=0) {
                stringBuilder.append(" ");
            }
        }

        return stringBuilder.toString();
    }


}
