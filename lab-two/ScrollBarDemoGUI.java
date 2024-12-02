import javax.swing.*;
public class ScrollBarDemoGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Scrollbar Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        JTextArea textArea = new JTextArea(10, 20);
        textArea.setText("This is a demo to show vertical and horizontal scrollbars in a JTextArea.\n"
                + "You can resize the window to see how the scrollbars appear.\n"
                + "This content will overflow in both directions if the window is small enough.\n"
                + "This is a long line of text to demonstrate the horizontal scrollbar appearing...\n"
                + "Keep adding more lines to make sure the vertical scrollbar is visible.\n"
                + "More content to ensure scrolling works in both directions. Keep going...\n"
                + "Scrollbars should appear when the content exceeds the JTextArea bounds.\n");

        JScrollPane scrollPane = new JScrollPane(textArea);

        scrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(scrollPane);

        frame.setVisible(true);
    }
}
