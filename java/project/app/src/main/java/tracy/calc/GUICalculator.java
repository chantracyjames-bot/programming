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
        // creates a JFrame objects, this is the actual "window"
        // you can name it be be anything
        JFrame tempFrame = new JFrame(windowName);
        // sets the window to close the program after exitting said window
        tempFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // sets the sice of the window
        tempFrame.setSize(width, height);
        // sets the layout to use Border Layout
        // it makes it possible to set the position of the panels of components
        // through EAST, WEST, CENTER, NORTH, or SOUTH 
        tempFrame.setLayout(new BorderLayout());
        return tempFrame;
    }

    // creates the text field
    // where input is placed in
    private JTextField createTextField() {
        // creates a JTextField object
        JTextField tempField = new JTextField();
        // sets the font, style and size
        tempField.setFont(new Font("Arial", Font.BOLD, 72));
        // sets the horizontal alignment to the right
        tempField.setHorizontalAlignment(JTextField.RIGHT);
        return tempField;
    }

    // creates the panels and such
    private JPanel createPanels(JTextField field) {
        // creates a JPanel object, using BorderLayout as a LayoutManager
        JPanel tempPanel = new JPanel(new BorderLayout());
        // adds components to the JPanel object
        // adds the top panel to be on the top of the screen
        tempPanel.add(createTopWindowPanel(), BorderLayout.NORTH);
        // adds the text field where the output is to the bottom of the panel
        tempPanel.add(field, BorderLayout.SOUTH);
        return tempPanel;
    }

    // adds the window name and controls (i use arch btw)
    private JPanel createTopWindowPanel() {
        // creates a JLabel object, which is the title bar
        JLabel tempLabel = new JLabel("tarcy's dumb cacl (calc stands for calculator btw (btw btw stands for by the way))");
        tempLabel.setFont(new Font("Arial", Font.PLAIN, 11));

        // creates a JButton objects, as the exit button
        JButton tempButton = new JButton("x");
        tempButton.addActionListener(e -> {
            System.exit(0);
        });

        // creates a new JPanel object
        JPanel tempPanel = new JPanel(new BorderLayout());
        // adds the title bar to be on the left of the panel
        tempPanel.add(tempLabel, BorderLayout.WEST);
        // adds the exit button to be on the right of the panel
        tempPanel.add(tempButton, BorderLayout.EAST);
        return tempPanel;
    }

    // creates the button setup
    private JPanel createButtonPanel(BasicCalculator bc, JTextField in) {
        // 5 x 4 layout, with paddings of 10 in all sides
        JPanel tempPanel = new JPanel(new GridLayout(5, 4, 10, 10));
        // button layout, made it simpler to understand by laying it out logically
        String[] buttons = {
              "1", "2", "3", "+",
              "4", "5", "6", "-",
              "7", "8", "9", "*",
            "+/-", "0", "%", "/",
              "C", "D", ".", "="
        };

        // adds action listeners to the buttons created
        for (String label : buttons) {
            // creates a JButton object, a clickable button
            // notice the label? it is based on the buttons[] array
            JButton button = new JButton(label);
            // sets the font on the
            button.setFont(new Font("Arial", Font.BOLD, 18));

            // adds actions to each of the button to the calculator
            // refer to ActionsCalculator.java for the actions
            button.addActionListener(new ActionsCalculator(bc, in)); 
            tempPanel.add(button);
        }
        return tempPanel;
    }
}
