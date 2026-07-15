package inventory;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.InputMismatchException;

public class InventorySystem {
    static void mainScreen() {
        System.out.println("Inventory Management System");
        System.out.println("1. Add Product");
        System.out.println("2. Update Product");
        System.out.println("3. Remove Product");
        System.out.println("4. Display Product");
        System.out.println("5. Display All Products");
        System.out.println("6. Exit");
    }

    static void userChoiceParser(int userInput) {
        InventoryMethods method = new InventoryMethods();
        var choicesMap = new HashMap<Integer, Runnable>();
        choicesMap.put(0, method::placeholder);
        choicesMap.put(1, method::addProduct);
        choicesMap.put(2, method::updateProduct);
        choicesMap.put(3, method::removeProduct);
        choicesMap.put(4, method::displayProduct);
        choicesMap.put(5, method::displayAll);
        choicesMap.put(6, method::exitProgram);
        
        Iterator<Integer> i = choicesMap.keySet().iterator();
        while(i.hasNext()) {
            if (i.next() == userInput) {
                choicesMap.get(userInput).run();
                return;
            }
        }
        throw new InputMismatchException("Invalid input!");
    }

    public static void mainProgram() {
        try {
            File testFile = new File("./inventory", "inventory_database.txt");
            if (!testFile.exists()) {
                testFile.createNewFile();
                throw new IOException("File not found.");
            }

            mainScreen();
            Scanner in = new Scanner(System.in);
            System.out.print("Input: ");
            userChoiceParser(in.nextInt());
            
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Created a new file.");
        } catch (InputMismatchException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again.");
        } catch (CustomExceptions.ProductIDAlreadyExistsException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again.");
        } catch (CustomExceptions.ProductIDNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
            System.out.println("Please try again.");
        } catch (NumberFormatException e) {
            throw new InputMismatchException("Invalid input!");
        } 
    }
}
