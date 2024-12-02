import javax.swing.*;
import java.awt.*;

public class SportsSelectionGUI {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("Sports Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Set layout to FlowLayout for simplicity
        frame.setLayout(new FlowLayout());

        // Label for instructions
        JLabel label = new JLabel("Select Sports:");

        // List of 7 sports
        String[] sports = {"Badminton", "Hockey", "Tennis", "Cricket", "Football", "Formula1", "Rugby"};

        // Create JList for displaying sports with multiple selection mode
        JList<String> sportsList = new JList<>(sports);
        sportsList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION); // Allow multiple selections

        // Add components to the frame
        frame.add(label);
        frame.add(sportsList); // No JScrollPane, so no scrollbar will appear

        // Make the frame visible
        frame.setVisible(true);
    }
}
