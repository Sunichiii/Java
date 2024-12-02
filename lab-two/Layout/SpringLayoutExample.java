package Layout;

import javax.swing.*;

public class SpringLayoutExample {
    public static void main(String[] args) {
        JFrame frame = new JFrame("SpringLayout Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        frame.setLayout(new SpringLayout());

        JButton button1 = new JButton("Button 1");
        JButton button2 = new JButton("Button 2");

        frame.add(button1);
        frame.add(button2);

        SpringLayout layout = (SpringLayout) frame.getLayout();

        layout.putConstraint(SpringLayout.WEST, button1, 50, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, button1, 50, SpringLayout.NORTH, frame);
        layout.putConstraint(SpringLayout.WEST, button2, 50, SpringLayout.WEST, frame);
        layout.putConstraint(SpringLayout.NORTH, button2, 100, SpringLayout.NORTH, frame);

        frame.setVisible(true);
    }
}
