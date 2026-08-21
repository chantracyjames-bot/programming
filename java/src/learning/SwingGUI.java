// import needed libraries
import javax.swing.*;
import java.awt.FlowLayout;

// main class
public class SwingGUI {
    // driver method
    static void openGUI() {
        // Run UI creation on the Event Dispatch Thread
        SwingUtilities.invokeLater(() -> {
            // creates a new JFrame object
            // this is what the window is
            JFrame idkman = new JFrame("Greeting App");
            // stops the program when closed
            idkman.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            // sets the size of the window
            idkman.setSize(670, 690);

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
        });
    }

    public static void main(String[] args) {
        openGUI();
    }
}
