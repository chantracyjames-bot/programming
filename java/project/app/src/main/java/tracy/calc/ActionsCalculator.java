package tracy.calc;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;

// abstraction and inheritance
public class ActionsCalculator implements ActionListener {
    // encapsulation
    private BasicCalculator bc;
    private JTextField in;

    // constructor
    public ActionsCalculator(BasicCalculator bc, JTextField in) {
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
                // if the input is not empty
                if (!in.getText().isEmpty()) {
                    // grabs the input from the screen
                    // places it in bc.firstNum (private)
                    bc.setFirstNumber(Double.parseDouble(in.getText()));
                    // sets the operator
                    bc.setOperator(command.charAt(0));
                    // gets ready for the second number
                    in.setText("");
                }
            }
                
            // adds a decimal point
            case "." -> {
                // if there is no dot in the screen, adds one
                if (!currentText.contains(".")) {
                    in.setText(in.getText() + ".");
                }
            }

            // flips the sign of the value on screen
            case "+/-" -> {
                // if the input is not empty
                // flips the sign of the current number
                if (!in.getText().isEmpty()) {
                    Double currentNumber = -1 * Double.parseDouble(in.getText());
                    in.setText(Double.toString(currentNumber));
                }
            }

            // gets the result of the thing'ma'bobs
            case "=" -> {
                // easter egg
                // the original stupid ideaz
                // ignore this
                if (in.getText().equals("Hello World")) {
                    idkman.tarcySux();
                }

                // if the input is not empty and the operator is also not empty
                if (!in.getText().isEmpty() && (bc.getOperator() != ' ')) {
                    // places the number on the screen to be in bc.secondNum (private)
                    bc.setSecondNumber(Double.parseDouble(in.getText()));
                    
                    // basic switch case to determice which operator to use
                    // used a getter to get bc.operator (private)
                    switch (bc.getOperator()) {
                        case '+' -> bc.addNumbers();
                        case '-' -> bc.subtractNumbers();
                        case '*' -> bc.multiplyNumbers();
                        case '/' -> bc.divideNumbers();
                        case '%' -> { 
                            bc.moduloNumbers();
                            // ignore this, some stupid easter egg
                            if (bc.getResult() == -1) {
                                in.setText("Hello World");
                            }
                        }
                    }

                    // displays the result
                    in.setText(String.valueOf(bc.getResult()));
                    // sets the operator to be empty again
                    bc.setOperator(' ');
                    // sets this value to be true
                    // pressing any numbers after pressing the "=" button
                    // it clears everything and then displays the new number
                    bc.setAfterCalc(true);
                }
            }

            // clears the screen
            case "C" -> {
                // clears everything
                in.setText("");
                bc.setFirstNumber(0);
                bc.setSecondNumber(0);
                bc.setResult(0);
                bc.setOperator(' ');
            }

            // backspace stuff
            case "D" -> {
                // deletes the later number if the input is not empty
                if (!in.getText().isEmpty()) {
                    in.setText(currentText.substring(0, currentText.length() - 1));
                }
            }

            // if the user pressed the NUMBER buttons
            default -> {
                // afterCalc is used here, clearing the number if the value is true
                if (bc.getAfterCalc()) {
                    bc.setAfterCalc(false);
                    in.setText("");
                }
                // sets the number
                in.setText(in.getText() + command);
            }
        }
    }
}

