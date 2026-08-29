package tracy.company;

public class Developer extends Employee {
    private String currentLanguage;
    
    public Developer(String employeeName, String employeeDepartment, String employeeRole, double employeeSalary, double employeeAllowance, String currentLanguage) {
        super(employeeName, employeeDepartment, employeeRole, employeeSalary, employeeAllowance);
        Employee.incrementDevelopers();
        this.employeeID = "D" + String.format("%04d", Employee.returnDeveloperNumber());
        this.currentLanguage = currentLanguage;
    }

    public void displayInformation() {
        System.out.println("===== Developer INFORMATION =====");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Department: " + getEmployeeDepartment());
        System.out.println("Basic Salary: " + String.format("%,.2f", getEmployeeSalary()));
        System.out.println("Allowance: " + String.format("%,.2f", getEmployeeAllowance()));
        System.out.println("Role: " + getEmployeeRole());
        System.out.println("Programming Langauge " + currentLanguage + "\n");
        
        System.out.println("Salary: PHP " + String.format("%,.2f", this.getEmployeeSalary()));
        System.out.println("Salary w/ Bonus: PHP " + String.format("%,.2f", this.getEmployeeSalary() * 1.1));
        System.out.println("Salary w/ Bonus & Allowance: PHP " + String.format("%,.2f", this.getEmployeeSalary() * 1.1 + this.getEmployeeAllowance()) + "\n");
    }

    public void displayRole() {
        System.out.println("===== MANAGER ROLE =====");
        System.out.println("Employee Role: " + getEmployeeRole());
        System.out.println("Department: " + getEmployeeDepartment());
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Name: " + getEmployeeName() + "\n");
    }

    public void setCurrentLangauge(String language) { this.currentLanguage = language; }

    public String getEmployeeID() { return this.employeeID; }
    public String getCurrentLanguage() { return this.currentLanguage; }
}
