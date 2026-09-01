import javax.swing.*;
import java.awt.*;

public class TestCalculator {
    static Double firstNum;
    static Double secNum;
    static Character operator;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame window = new JFrame("Window Title");
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setSize(400, 600);
            window.setResizable(false);
            window.setLayout(new BorderLayout());

            JPanel panel = new JPanel(new GridLayout(4, 3, 5, 5));

            JTextField field = new JTextField();
            field.setFont(new Font("Arial", Font.BOLD, 100));
            field.setHorizontalAlignment(JTextField.RIGHT);
            window.add(field, BorderLayout.NORTH);

            String[] buttons = {
                "1", "2", "3", "+",
                "4", "5", "6", "-",
                "7", "8", "9", "*",
                "/", "0", "C", "="
            };

            for (String button : buttons) {
                JButton temp = new JButton(button);
                temp.setFont(new Font("Arial", Font.BOLD, 60));
                temp.addActionListener(e -> {
                    String command = e.getActionCommand();

                    switch (command) {
                        case "+", "-", "*", "/" -> {
                            firstNum = Double.parseDouble(field.getText());
                            operator = command.charAt(0);
                            field.setText("");
                        } case "=" -> {
                            secNum =  Double.parseDouble(field.getText());
                            switch (operator) {
                                case '+' -> {
                                    field.setText(Double.toString(firstNum + secNum));
                                } case '-' -> {
                                    field.setText(Double.toString(firstNum - secNum));
                                } case '*' -> {
                                    field.setText(Double.toString(firstNum * secNum));
                                } case '/' -> {
                                    field.setText(Double.toString(firstNum / secNum));
                                }
                            }
                        } case "C" -> {
                            firstNum = 0.0;
                            secNum = 0.0;
                            operator = 0;
                            field.setText("");
                        } default -> {
                            field.setText(field.getText() + e.getActionCommand());
                        }
                    }
                });
                panel.add(temp);
            }

            window.add(panel);
            window.setVisible(true);
        });
    }
}