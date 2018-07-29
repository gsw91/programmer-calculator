package com.programmerCalculator.GUI.otherFrames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;


public class InformationFrame extends JFrame {

    private JFrame frame = new JFrame("Information");


    public void showInformationFrame() {

        JTextArea textArea = new JTextArea();
        setInformation(textArea);
        textArea.setEditable(false);
        JButton closeButton = new JButton("Close");
        closeButton.addActionListener(new CloseButtonListener());

        frame.getContentPane().add(BorderLayout.CENTER, textArea);
        frame.getContentPane().add(BorderLayout.SOUTH, closeButton);
        frame.setSize(400,300);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);

    }


    private void setInformation(JTextArea jTextArea) {

        String absolutePath = new File("").getAbsolutePath();
        String filePath = absolutePath + "\\src\\main\\resources\\information.txt";

        try {
            String textLine;
            FileReader fr = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fr);

            while((textLine = reader.readLine()) != null) {

                if (!textLine.startsWith(">"))
                {
                    jTextArea.append(textLine + "\n");
                }

            }

        } catch (IOException ioe) {
            System.err.println(ioe.getMessage());
        }

    }


    class CloseButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
        }

    }


}
