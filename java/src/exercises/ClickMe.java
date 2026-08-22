import java.awt.*;
import java.awt.BorderLayout;
import java.awt.event.*;
import javax.swing.*;

// to lazy to create another file
public class ClickMe implements ActionListener {
    private Integer clicks = 0;

    public void actionPerformed(ActionEvent eve) {
        clicks++;

        JButton buttOn = (JButton) eve.getSource();
        buttOn.setText("Clicks: " + clicks);
    }

    public static void createGUI() {
        JFrame window = new JFrame();
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(200, 80);

        ClickMe idkman = new ClickMe();
        JButton buttOn = new JButton("Click me");
        buttOn.addActionListener(idkman);

        JPanel panel = new JPanel(new BorderLayout());
        panel.add(buttOn);

        window.add(panel);
        window.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            createGUI();
        });
    }
}
