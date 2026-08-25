package tracy.calc;

import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.FlatDarkLaf;

public class GUICalculator {
    // basic constructor
    // creates the GUI using Swing
    public GUICalculator(String windowName, int windowWidth, int windowHeight) {
        // dark mode 'cuz i hate light mode
        FlatDarkLaf.setup();
        // thread-safe stuff
        SwingUtilities.invokeLater(() -> {
            BasicCalculator bc = new BasicCalculator();
            // creates the frame and text fields
            JFrame calc = createFrame(windowName, windowWidth, windowHeight);
            JTextField field = createTextField();
            // prevents any keyboard input
            field.setEditable(true);
            // adds the text field and window controls to the top of the window
            calc.add(createPanels(field), BorderLayout.NORTH);
            // adds the buttons to the bottom of the window
            calc.add(createButtonPanel(bc, field));
            // sets the GUI to be visible after setup
            calc.setVisible(true);
        });
    }

    // creates the frame, or the window
    private JFrame createFrame(String windowName, int width, int height) {
        JFrame tempFrame = new JFrame(windowName);
        tempFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tempFrame.setSize(width, height);
        tempFrame.setLayout(new BorderLayout());
        return tempFrame;
    }

    // creates the text field
    // where input is placed in
    private JTextField createTextField() {
        JTextField tempField = new JTextField();
        tempField.setFont(new Font("Arial", Font.BOLD, 72));
        tempField.setHorizontalAlignment(JTextField.RIGHT);
        return tempField;
    }

    // creates the panels and such
    private JPanel createPanels(JTextField field) {
        JPanel tempPanel = new JPanel(new BorderLayout());
        tempPanel.add(createTopWindowPanel(), BorderLayout.NORTH);
        tempPanel.add(field, BorderLayout.SOUTH);
        return tempPanel;
    }

    // adds the window name and controls (i use arch btw)
    private JPanel createTopWindowPanel() {
        JLabel tempLabel = new JLabel("tarcy's dumb cacl (calc stands for calculator btw (btw btw stands for by the way))");
        tempLabel.setFont(new Font("Arial", Font.PLAIN, 11));

        JButton tempButton = new JButton("x");
        tempButton.addActionListener(e -> {
            System.exit(0);
        });

        JPanel tempPanel = new JPanel(new BorderLayout());
        tempPanel.add(tempLabel, BorderLayout.WEST);
        tempPanel.add(tempButton, BorderLayout.EAST);
        return tempPanel;
    }

    // creates the button setup
    private JPanel createButtonPanel(BasicCalculator bc, JTextField in) {
        // 5 x 4 layout, with paddings of 10 in all sides
        JPanel tempPanel = new JPanel(new GridLayout(5, 4, 10, 10));
        String[] buttons = {
              "1", "2", "3", "+",
              "4", "5", "6", "-",
              "7", "8", "9", "*",
            "+/-", "0", "%", "/",
              "C", "D", ".", "="
        };

        // adds action listeners to the buttons created
        for (String label : buttons) {
            JButton button = new JButton(label);
            button.setFont(new Font("Arial", Font.BOLD, 18));

            button.addActionListener(new ActionsCalculaor(bc, in)); 
            tempPanel.add(button);
        }
        return tempPanel;
    }
}
