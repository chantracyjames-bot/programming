package tracy.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

public class ActionsCalculaor implements ActionListener {
    private BasicCalculator bc;
    private JTextField in;

    // constructor
    public ActionsCalculaor(BasicCalculator bc, JTextField in) {
        this.bc = bc;
        this.in = in;
    }

    // action taken if any of the buttons are clicked
    public void actionPerformed(ActionEvent e) {
        String currentText = in.getText();
        String command = e.getActionCommand();

        // basic switch case
        // filters out what to do based on the clicked button
        switch (command) {
            // arithmetic operations
            case "+", "-", "*", "/", "%" -> {
                if (!in.getText().isEmpty()) {
                    bc.setFirstNumber(Double.parseDouble(in.getText()));
                    bc.setOperator(command.charAt(0));
                    in.setText("");
                }
            }
                
            // adds a decimal point
            case "." -> {
                if (!currentText.contains(".")) {
                    in.setText(in.getText() + ".");
                }
            }

            // flips the sign of the value on screen
            case "+/-" -> {
                if (!in.getText().isEmpty()) {
                    Double currentNumber = -1 * Double.parseDouble(in.getText());
                    in.setText(Double.toString(currentNumber));
                }
            }

            // gets the result of the thing'ma'bobs
            case "=" -> {
                // easter egg
                // the original stupid ideaz
                if (in.getText().equals("Hello World")) {
                    idkman.tarcySux();
                }

                if (!in.getText().isEmpty() && (bc.getOperator() != ' ')) {
                    bc.setSecondNumber(Double.parseDouble(in.getText()));
                    
                    switch (bc.getOperator()) {
                        case '+' -> bc.addNumbers();
                        case '-' -> bc.subtractNumbers();
                        case '*' -> bc.multiplyNumbers();
                        case '/' -> bc.divideNumbers();
                        case '%' -> { 
                            bc.moduloNumbers();
                            if (bc.getResult() == -1) {
                                in.setText("Hello World");
                            }
                        }
                    }
                    if (bc.getResult() != -1) {
                        in.setText(String.valueOf(bc.getResult()));
                    }
                    bc.setOperator(' ');
                    bc.setAfterCalc(true);
                }
            }

            // clears the screen
            case "C" -> {
                in.setText("");
                bc.setFirstNumber(0);
                bc.setSecondNumber(0);
                bc.setResult(0);
                bc.setOperator(' ');
            }

            // backspace stuff
            case "D" -> {
                if (!in.getText().isEmpty()) {
                    in.setText(currentText.substring(0, currentText.length() - 1));
                }
            }

            // if any of the buttons are clicked
            default -> {
                if (bc.getAfterCalc()) {
                    bc.setAfterCalc(false);
                    in.setText("");
                    System.out.println("whyyyyy");
                }
                in.setText(in.getText() + command);
            }
        }
    }
}

