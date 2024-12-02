import javax.swing.*;
import java.awt.*;

public class PlanetSelectionGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Planet Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        frame.setLayout(new FlowLayout());

        JLabel label = new JLabel("Select a Planet:");

        String[] planets = {"Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

        JList<String> planetList = new JList<>(planets);
        planetList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION); 

        frame.add(label);
        frame.add(new JScrollPane(planetList));

        frame.setVisible(true);
    }
}
