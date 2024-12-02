import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SimpleGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new GridLayout(3, 2, 10, 10)); // GridLayout with 3 rows, 2 columns

        JLabel nameLabel = new JLabel("Name");
        JLabel addressLabel = new JLabel("Address");

        nameLabel.setHorizontalAlignment(SwingConstants.CENTER);
        addressLabel.setHorizontalAlignment(SwingConstants.CENTER);

        JTextField nameField = new JTextField();
        JTextField addressField = new JTextField();

        JButton okButton = new JButton("OK");
        JButton cancelButton = new JButton("Cancel");

        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                nameLabel.setText("Full Name");
            }
        });

        frame.add(nameLabel);
        frame.add(nameField);
        frame.add(addressLabel);
        frame.add(addressField);
        frame.add(okButton);
        frame.add(cancelButton);

        frame.setVisible(true);
    }
}
