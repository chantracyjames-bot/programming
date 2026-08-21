package tracy.conversion;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        while (true) {
            try {
                MenuLogic.mainMenu(new Scanner(System.in));
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input!");
            } catch (Exception e) {
                System.out.println("\nblame tarcy: " + e);
            } 
        }
    }
}
