package tracy.calc;

public class BasicCalculator extends Calculator {
    // adds stuff
    public void addNumbers() {
        setResult(getFirstNumber() + getSecondNumber());
    }

    // subtracts stuff
    public void subtractNumbers() {
        // easter egg
        // got bored and did some stupid stuff
        if (getFirstNumber() == 10000 && getSecondNumber() == 10000) {
            // just ignore this part
            setResult(8);
            idkman.mrkrabs();
            return;
        }
        setResult(getFirstNumber() - getSecondNumber());
    }

    // multiplies stuff
    public void multiplyNumbers() {
        setResult(getFirstNumber() * getSecondNumber());
    }

    // divides stuff
    public void divideNumbers() {
        // runs if the second number IS NOT zero
        if (!(getSecondNumber() == 0.0)) {
            setResult(getFirstNumber() / getSecondNumber());
            return;
        } setResult(0.0); // if the second number IS zero
    }

    // modulo stuff
    public void moduloNumbers() {
        // ignore this
        // some stupid easter egg which i thought is funny
        if (getSecondNumber() == 0) {
            setResult(-1);
            return;
        }
        setResult(getFirstNumber() % getSecondNumber());
    }
}
