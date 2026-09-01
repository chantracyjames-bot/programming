// import needed libraries
import javax.swing.*;
import javax.swing.text.MaskFormatter;

import java.awt.FlowLayout;
import java.text.ParseException;

// main class
public class SwingGUI {
    // driver method
    static void openGUI() {
            // creates a new JFrame object
            // this is what the window is
            JFrame idkman = new JFrame("Greeting App");
            // stops the program when closed
            idkman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // sets the size of the window
            idkman.setSize(670, 690);
            // sets the window to be unresizable
            // i am using a window manager (Hyprland), cant tell the difference
            idkman.setResizable(false);

            // creates a new JPanel object
            // this is what the layout of the window is
            JPanel pane = new JPanel(new FlowLayout());

            // creates JLabel objects
            // the first object is what displays the prompt
            // the second object is where the input is stored in
            JLabel whatToSay = new JLabel("What to say?:");
            JLabel whatYouSaid = new JLabel("");

            // creates a JTextField object
            // this is what the text field is 
            JTextField youShouldSay = new JTextField(10);

            // creates a JButton object
            JButton clickMe = new JButton("Don't Click me");

            // the logic that happens when the button is clicked
            clickMe.addActionListener(e -> {
                String maybe = youShouldSay.getText();
                whatYouSaid.setText("you did not say " + maybe);
            });

            // adds all component objects to the JPanel object
            pane.add(whatToSay);
            pane.add(youShouldSay);
            pane.add(clickMe);
            pane.add(whatYouSaid);

            // adds the JPanel object to the window
            idkman.add(pane);
            // sets the window to be visible
            idkman.setVisible(true);
    }

    static void testStuff() throws ParseException {
        JFrame newWindow = new JFrame("Window");
        JPanel newPanel = new JPanel(new FlowLayout());

        JToggleButton toggleButton = new JToggleButton("Toggle");
        JRadioButton radioButton1 = new JRadioButton("yes");
        JRadioButton radioButton2 = new JRadioButton("no");
        JRadioButton radioButton3 = new JRadioButton("maybe");
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        JCheckBox checkBox = new JCheckBox("Check box");
        JTextArea textArea = new JTextArea("Text area", 10, 10);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        JTextField textField = new JTextField("Text field", 10);
        JPasswordField passwordField = new JPasswordField(10);
        JFormattedTextField formattedTextField = new JFormattedTextField(new MaskFormatter("(##) ###-###-####"));
        formattedTextField.setColumns(10);
        JLabel label = new JLabel("Label", JLabel.CENTER);

        newPanel.add(toggleButton);
        newPanel.add(radioButton1);
        newPanel.add(radioButton2);
        newPanel.add(radioButton3);
        newPanel.add(checkBox);
        newPanel.add(textArea);
        newPanel.add(textField);
        newPanel.add(passwordField);
        newPanel.add(formattedTextField);
        newPanel.add(label);

        newWindow.add(newPanel);
        newWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        newWindow.setSize(400, 600);
        newWindow.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                testStuff();
            } catch (ParseException e) {
                e.printStackTrace();
            }
        });
    }
}
