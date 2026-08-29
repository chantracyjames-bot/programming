package tracy.company;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.HashMap;

public class Console {
    private static Scanner in = new Scanner(System.in);
    private static HashMap<String, Employee> employees = new HashMap<String, Employee>();

    public static void console() {
        String userInput;
        while(true) {
            try {
                printConsoleMenu();
                userInput = in.nextLine();

                switch (userInput) {
                    case "1" -> { addNewEmployee(); }
                    case "2" -> { displayAllEmployees(); }
                    case "3" -> { displayEmployeeInformation(); }
                    case "4" -> { displayEmployeeRole(); }
                    case "5" -> { removeEmployee(); }
                    case "6" -> { System.exit(0); }
                    default -> { throw new InputMismatchException(); }
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Try again.\n");
            }
        }
    }

    private static void addNewEmployee() {
        String userInput = "";
        String tempName;
        String tempDepartment;
        String tempRole;
        Double tempSalary = 0.0;
        Double tempAllowance = 0.0;

        getEmployeeType: while (true) {
            try {
                System.out.println("\nChoose employee type");
                System.out.println("1. Manager");
                System.out.println("2. Developer");
                System.out.print("Input: ");
                userInput = in.nextLine();

                if (userInput.equals("1") || userInput.equals("2")) { break getEmployeeType; }
                throw new InputMismatchException();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input! Try again.\n");
            }
        }

        addEmployee: while (true) {
            try {
                System.out.println("\nPersonal information");
                switch (userInput) {
                    case "1" -> {
                        Integer tempSpecial = 0;

                        do {
                            System.out.print("Enter name: ");
                            tempName = in.nextLine();
                            if (tempName.isEmpty()) { System.out.println("Invalid input! Please Try Again.\n"); }
                        } while (tempName.isBlank());
                        
                        do {
                            System.out.print("Enter department: ");
                            tempDepartment = in.nextLine();
                            if (tempDepartment.isEmpty()) { System.out.println("Invalid input! Please Try Again.\n"); }
                        } while (tempDepartment.isBlank()) ;
                        
                            do {
                            System.out.print("Enter role: ");
                            tempRole = in.nextLine();
                            if (tempRole.isEmpty()) { System.out.println("Invalid input! Please Try Again.\n"); }
                        } while (tempRole.isBlank());

                        do {
                            System.out.print("Enter salary: ");
                            tempSalary = getDoubleInput();
                        } while (tempSalary == 0);

                        do {
                            System.out.print("Enter allowance: ");
                            tempAllowance = getDoubleInput();
                        } while (tempAllowance == 0);

                        do {
                            System.out.print("How many employees managed?: ");
                            tempSpecial = (int) getDoubleInput();
                        } while (tempSpecial == 0);

                        String key = String.format("M%04d", Employee.returnManagerNumber() + 1);
                        employees.put(key, new Manager(tempName, tempDepartment, tempRole, tempSalary, tempAllowance, tempSpecial));
                        System.out.println("\nAdded new manager with ID of " + ((Manager) employees.get(key)).getEmployeeID() + ". Welcome " + ((Manager) employees.get(key)).getEmployeeName() + "\n");
                        break addEmployee;
                    }
                    case "2" -> {
                        String tempSpecial;

                        do {
                            System.out.print("Enter name: ");
                            tempName = in.nextLine();
                            if (tempName.isEmpty()) { System.out.println("Invalid input! Please Try Again.\n"); }
                        } while (tempName.isBlank());
                        
                        do {
                            System.out.print("Enter department: ");
                            tempDepartment = in.nextLine();
                            if (tempDepartment.isEmpty()) { System.out.println("Invalid input! Please Try Again.\n"); }
                        } while (tempDepartment.isBlank()) ;
                        
                            do {
                            System.out.print("Enter role: ");
                            tempRole = in.nextLine();
                            if (tempRole.isEmpty()) { System.out.println("Invalid input! Please Try Again.\n"); }
                        } while (tempRole.isBlank());

                        do {
                            System.out.print("Enter salary: ");
                            tempSalary = getDoubleInput();
                        } while (tempSalary == 0);

                        do {
                            System.out.print("Enter allowance: ");
                            tempAllowance = getDoubleInput();
                        } while (tempAllowance == 0);

                        do {
                            System.out.print("Programming language?: ");
                            tempSpecial = in.nextLine();
                            if (tempSpecial.isEmpty()) { System.out.println("Invalid input! Please Try Again.\n"); }
                        } while (tempSpecial.isBlank());

                        String key = String.format("D%04d", Employee.returnDeveloperNumber() + 1);
                        employees.put(key, new Developer(tempName, tempDepartment, tempRole, tempSalary, tempAllowance, tempSpecial));
                        System.out.println("\nAdded new developer with ID of " + ((Developer) employees.get(key)).getEmployeeID() + ". Welcome " + ((Developer) employees.get(key)).getEmployeeName() + "\n");
                        break addEmployee;
                    }
                }
            } catch (Exception e) {
                System.out.println("bug detected, tarcy must be eliminated: " + e);
            }
        }
    }

    public static void displayAllEmployees() {
        System.out.println("\n===== Current Employees =====");
        for ( Employee tempEmployee : employees.values() ) {
            System.out.println("ID: " + tempEmployee.getEmployeeID() + " -> " + tempEmployee.getEmployeeName());
        }
        System.out.println();
    }

    public static void displayEmployeeInformation() {
        String tempInput;
        System.out.print("Enter employee ID: ");
        tempInput = in.nextLine();
        if (!employees.containsKey(tempInput)) {
            System.out.println("Invalid key! Try again.\n");
            return;
        }
        System.out.println();
        employees.get(tempInput).displayInformation();
    }

    public static void displayEmployeeRole() {
        String tempInput;
        System.out.print("Enter employee ID: ");
        tempInput = in.nextLine();
        if (!employees.containsKey(tempInput)) {
            System.out.println("Invalid key! Try again.\n");
            return;
        }
        System.out.println();
        employees.get(tempInput).displayRole();
    }

    public static void removeEmployee() {
        String tempInput;
        System.out.print("Enter employee ID: ");
        tempInput = in.nextLine();
        if (!employees.containsKey(tempInput)) {
            System.out.println("Invalid key! Try again.\n");
            return;
        }
        System.out.println("Removed ID "+ tempInput + ". Goodbye " + employees.get(tempInput).getEmployeeName() + "\n");
        employees.remove(tempInput);
    }

    private static void printConsoleMenu() {
        System.out.println("===== Manage Employees =====");
        System.out.println("1. Add new Employees");
        System.out.println("2. Display All Employees");
        System.out.println("3. Display Employee Information");
        System.out.println("4. Display Employee Role");
        System.out.println("5. Remove an Employee");
        System.out.println("6. Exit");
        System.out.print("Choose Action: ");
    }

    private static double getDoubleInput() {
        double tempInput = 0.0;
        try {
            tempInput = Double.parseDouble(in.nextLine());
            if (tempInput < 0) {
                System.out.println("Input input! Value must be higher than zero;");
            }
        } catch (Exception e) {
            System.out.println("Invalid Input, Try Again.\n");
        } return tempInput;
    }
}
