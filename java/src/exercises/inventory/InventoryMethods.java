package inventory;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InventoryMethods {
    public void placeholder() {
        System.out.println("This is a placeholder option.");
    }

    public void addProduct() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        String searchItem = in.nextLine();
        String[] invContent = null;

        try (BufferedReader readFile = new BufferedReader(new FileReader("./inventory/inventory_database.txt"))) {
            invContent = readFile.lines().toArray(String[]::new);
        } catch (IOException e) { System.out.println("Error: Problem with reading database file."); }
        
        for(String l : invContent) {
            String[] part = l.strip().split(",");
            if (searchItem.equals(part[0])) {
                throw new CustomExceptions.ProductIDAlreadyExistsException("Product ID already exists");
            } else {
                continue;
            }
        }

        var newEntry = new ArrayList<String>();
        newEntry.add(searchItem);
        System.out.print("Enter Product Name: ");
        newEntry.add(in.nextLine());
        System.out.print("Enter Product Price: ");
        newEntry.add(Float.toString(Float.parseFloat(in.nextLine())));
        System.out.print("Enter Product Stock: ");
        newEntry.add(Integer.toString(Integer.parseInt(in.nextLine())));

        try (BufferedWriter writeFile = new BufferedWriter(new FileWriter("./inventory/inventory_database.txt", true))) {
            writeFile.newLine();
            writeFile.write(String.join(",", newEntry));
            System.out.println("Product successfully added to the database.");
        } catch (IOException e) { System.out.println("Error: Parsing file failed."); }

        System.out.println("Product \"" + searchItem + "\" has been added.");
    }

    public void updateProduct() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        String searchItem = in.nextLine();
        String[] invContent = null;
        int counter = 0;
        boolean key = false;

        try (BufferedReader readFile = new BufferedReader(new FileReader("./inventory/inventory_database.txt"))) {
            invContent = readFile.lines().toArray(String[]::new);
        } catch (IOException e) { System.out.println("Error: Parsing file failed."); }
        
        for(String l : invContent) {
            String[] part = l.strip().split(",");
            if (searchItem.equals(part[0])) {
                System.out.print("Enter new product price: ");
                part[2] = Float.toString(Float.parseFloat(in.nextLine()));
                System.out.print("Enter new product stock: ");
                part[3] = Integer.toString(Integer.parseInt(in.nextLine()));
                invContent[counter] = String.join(",", part);
                key = true;
                break;
            } counter++;
        }

        if (key) {
            try (BufferedWriter writeFile = new BufferedWriter(new FileWriter("./inventory/inventory_database.txt"))) {
                for (String l : invContent) {
                    writeFile.write(l);
                    writeFile.newLine();
                    System.out.println("Product successfully updated to the database.");
                }
            } catch (IOException e) { System.out.println("Error: Parsing file failed."); }
        } else {
            throw new CustomExceptions.ProductIDNotFoundException("Product ID does not exist!");
        }
    }

    public void removeProduct() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        String searchItem = in.nextLine();
        String[] invContent = null;
        int counter = 0;
        boolean key = false;

        try (BufferedReader readFile = new BufferedReader(new FileReader("./inventory/inventory_database.txt"))) {
            invContent = readFile.lines().toArray(String[]::new);
        } catch (IOException e) { System.out.println("Error: Parsing file failed."); }
        
        for(String l : invContent) {
            String[] part = l.strip().split(",");
            if (searchItem.equals(part[0])) {
                invContent[counter] = "";
                key = true;
                break;
            } counter++;
        }

        if (key) {
            try (BufferedWriter writeFile = new BufferedWriter(new FileWriter("./inventory/inventory_database.txt"))) {
                for (String l : invContent) {
                    writeFile.write(l);
                    writeFile.newLine();
                    System.out.println("Product successfully removed from the database.");
                }
            } catch (IOException e) { System.out.println("Error: Parsing file failed."); }
        } else {
            throw new CustomExceptions.ProductIDNotFoundException("Product ID does not exist!");
        }
    }

    public void displayProduct() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        String searchItem = in.nextLine();
        String[] invContent = null;
        boolean key = false;

        try (BufferedReader readFile = new BufferedReader(new FileReader("./inventory/inventory_database.txt"))) {
            invContent = readFile.lines().toArray(String[]::new);
        } catch (IOException e) { System.out.println("Error: Parsing file failed."); }
        
        for(String l : invContent) {
            String[] part = l.strip().split(",");
            if (searchItem.equals(part[0])) {
                System.out.println("- ID: " + part[0] + " | Name: " + part[1] + " | Price: " + part[2] + " | Stock: " + part[3]);
                key = true;
                break;
            }
        }

        if (!key) { throw new CustomExceptions.ProductIDNotFoundException("Product ID does not exist!"); }
    }

    public void displayAll() {
        String[] invContent = null;
        boolean key = false;

        try (BufferedReader readFile = new BufferedReader(new FileReader("./inventory/inventory_database.txt"))) {
            invContent = readFile.lines().toArray(String[]::new);
        } catch (IOException e) { System.out.println("Error: Parsing file failed."); }
        
        for(String l : invContent) {
            String[] part = l.strip().split(",");
            if (!l.isEmpty()) {
                System.out.println("- ID: " + part[0] + " | Name: " + part[1] + " | Price: " + part[2] + " | Stock: " + part[3]);
                key = true;
            }
        }

        if (!key) { throw new CustomExceptions.ProductIDNotFoundException("Product ID does not exist!"); }
    }

    public void exitProgram() {
        System.out.println("Exitting program.");
        System.exit(0);
    }
}
