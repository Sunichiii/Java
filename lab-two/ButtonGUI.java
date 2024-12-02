import javax.swing.*;
import java.awt.*;

public class ButtonGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Button GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(2, 2, 10, 10)); // GridLayout with 2 rows, 2 columns

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");

        button2.setEnabled(false);
        button4.setEnabled(false);

        button1.setText("one");
        button3.setText("three");

        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);

        frame.setVisible(true);
    }
}
