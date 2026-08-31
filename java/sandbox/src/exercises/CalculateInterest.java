public class CalculateInterest {
    static double simpleInterest(double P, double R, double T) {
        return (P * R * T)/100;
    }

    static double compoundInterest(double P, double R, double T) {
        return P * Math.pow(1 + (R/100), T);
    }

    public static void main(String[] args) {
        double P = 1200; double R = 5.4; double T = 2;
        System.out.println(compoundInterest(P, R, T));
    }
}
