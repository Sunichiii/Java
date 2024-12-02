import javax.swing.*;

public class EnrollmentGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Enrollment Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        JLabel programLabel = new JLabel("Choose a program to enroll:");
        JCheckBox cCheckBox = new JCheckBox("C");
        JCheckBox javaCheckBox = new JCheckBox("Java");
        JCheckBox htmlCheckBox = new JCheckBox("HTML");
        JCheckBox phpCheckBox = new JCheckBox("PHP");
        JLabel paymentLabel = new JLabel("Payment:");
        JRadioButton nowRadioButton = new JRadioButton("Now");
        JRadioButton laterRadioButton = new JRadioButton("Later", true); 
        ButtonGroup paymentGroup = new ButtonGroup();
        paymentGroup.add(nowRadioButton);
        paymentGroup.add(laterRadioButton);
        frame.add(programLabel);
        frame.add(cCheckBox);
        frame.add(javaCheckBox);
        frame.add(htmlCheckBox);
        frame.add(phpCheckBox);
        frame.add(paymentLabel);
        frame.add(nowRadioButton);
        frame.add(laterRadioButton);
        frame.setVisible(true);
    }
}
