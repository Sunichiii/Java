import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LanguageSelectionGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Language Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());
        JLabel selectedLanguageLabel = new JLabel("Selected Language: None");
        String[] languages = {"C", "Java", "Python", "C++", "Dotnet"};
        JComboBox<String> languageComboBox = new JComboBox<>(languages);
        languageComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedItem = (String) languageComboBox.getSelectedItem();
                selectedLanguageLabel.setText("Selected Language: " + selectedItem);
            }
        });
        frame.add(selectedLanguageLabel);
        frame.add(languageComboBox);
        frame.setVisible(true);
    }
}
