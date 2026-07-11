import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchPractice {
    public static void main(String[] args) {
        int oxygenLevels[] = {50, 50, 50, 50};
        int key = 1;

        while(key == 1) {
            Scanner in = new Scanner(System.in);
            try {
                int index = 0, newValue;
                System.out.print("\n--- MARS COLONY LIFE SUPPORT ---\nCurrent Levels: ");
                for(int i = 0; i < oxygenLevels.length; i++) {
                    System.out.printf("%s%d %d%s", "[S", i, oxygenLevels[i], "%] ");
                }
                System.out.print("Enter Sector ID to adjust (0-3): ");
                index = in.nextInt();
                oxygenLevels[index] = oxygenLevels[index]; // reads the index stuff yesyes

                System.out.print("Enter New Oxygen Level (0-100%): ");
                newValue = in.nextInt();
                if(newValue > 100 || newValue < 0) { throw new IllegalArgumentException(); }
                oxygenLevels[index] = newValue;
                System.out.printf("%n%s%d%s", "Sector ", index, " successfully updated!"); 
            } catch(InputMismatchException e) {
                System.out.println("Error! Input must be an Integer!");
            } catch(ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: That sector does not exist in this dome!");
            } catch(IllegalArgumentException e) {
                System.out.println("Error: Invalid Oxygen Levels!");
            } finally {
                System.out.println("-----------------------------------------");
                in.close();
            }
        }
    }
}
