package dev.vetyutnev.lab5;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Lab5_Converter {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Конвертер длины");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Введите метры:");
        JTextField inputField = new JTextField(10);
        JButton button = new JButton("Конвертировать");
        JTextArea resultArea = new JTextArea(5, 20);
        resultArea.setEditable(false);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double meters = Double.parseDouble(inputField.getText());
                    double cm = meters * 100;
                    double km = meters / 1000;
                    double miles = meters * 0.000621371;

                    String result = "Сантиметры: " + cm + "\n" +
                            "Километры: " + km + "\n" +
                            "Мили: " + miles;
                    resultArea.setText(result);
                } catch (NumberFormatException ex) {
                    resultArea.setText("Ошибка: введите число");
                }
            }
        });

        frame.add(label);
        frame.add(inputField);
        frame.add(button);
        frame.add(new JScrollPane(resultArea));

        frame.setVisible(true);
    }
}