import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        
        frame.setLayout(new GridLayout(4, 2));

        JLabel firstNumberLabel = new JLabel("First Number:");
        JLabel secondNumberLabel = new JLabel("Second Number:");
        JLabel resultLabel = new JLabel("Result:");

        JTextField firstNumberField = new JTextField();
        JTextField secondNumberField = new JTextField();
        JTextField resultField = new JTextField();
        resultField.setEditable(false);

        JButton addButton = new JButton("+");
        JButton subtractButton = new JButton("-");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(firstNumberField.getText());
                    double num2 = Double.parseDouble(secondNumberField.getText());
                    double result = num1 + num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        subtractButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double num1 = Double.parseDouble(firstNumberField.getText());
                    double num2 = Double.parseDouble(secondNumberField.getText());
                    double result = num1 - num2;
                    resultField.setText(String.valueOf(result));
                } catch (NumberFormatException ex) {
                    resultField.setText("Invalid Input");
                }
            }
        });

        frame.add(firstNumberLabel);
        frame.add(firstNumberField);
        frame.add(secondNumberLabel);
        frame.add(secondNumberField);
        frame.add(resultLabel);
        frame.add(resultField);
        frame.add(addButton);
        frame.add(subtractButton);

        frame.setVisible(true);
    }
}
