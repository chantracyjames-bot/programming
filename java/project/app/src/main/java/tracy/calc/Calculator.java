package tracy.calc;
// i know that the naming scheme is unorthrodoxial
// i am doing it for the sake of uniformity

public class Calculator {
    // private values
    private double firstNum;
    private double secondNum;
    private double result;
    private char operator;
    private boolean afterCalc;

    // setters
    public void setFirstNumber(double firstNum) {
        this.firstNum = firstNum;
    }

    public void setSecondNumber(double secondNum) {
        this.secondNum = secondNum;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public void setOperator(char operator) {
        this.operator = operator;
    }

    public void setAfterCalc(boolean afterCalc) {
        this.afterCalc = afterCalc;
    }

    // getters
    public double getFirstNumber() {
        return this.firstNum;
    }

    public double getSecondNumber() {
        return this.secondNum;
    }

    public double getResult() {
        return this.result;
    }

    public char getOperator() {
        return this.operator;
    }

    public boolean getAfterCalc() {
        return this.afterCalc;
    }
}
