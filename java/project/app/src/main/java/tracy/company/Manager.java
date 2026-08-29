package tracy.company;

public class Manager extends Employee {
    private Integer employeesManaged;
    
    public Manager(String employeeName, String employeeDepartment, String employeeRole, double employeeSalary, double employeeAllowance, int employeesManaged) {
        super(employeeName, employeeDepartment, employeeRole, employeeSalary, employeeAllowance);
        Employee.incrementManagers();
        this.employeeID = "M" + String.format("%04d", Employee.returnManagerNumber());
        this.employeesManaged = employeesManaged;
    }

    public void displayInformation() {
        System.out.println("===== MANAGER INFORMATION =====");
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Name: " + getEmployeeName());
        System.out.println("Department: " + getEmployeeDepartment());
        System.out.println("Basic Salary: " + String.format("%,.2f", getEmployeeSalary()));
        System.out.println("Allowance: " + String.format("%,.2f", getEmployeeAllowance()));
        System.out.println("Employee Role: " + getEmployeeRole());
        System.out.println("Managing " + this.employeesManaged + " employees.\n");
        
        System.out.println("Salary: PHP " + String.format("%,.2f", this.getEmployeeSalary()));
        System.out.println("Salary w/ Bonus: PHP " + String.format("%,.2f", this.getEmployeeSalary() * 1.1));
        System.out.println("Salary w/ Bonus & Allowance: PHP " + String.format("%,.2f", this.getEmployeeSalary() * 1.1 + this.getEmployeeAllowance()) + "\n");
    }

    public void displayRole() {
        System.out.println("===== DEVELOPER ROLE =====");
        System.out.println("Employee Role: " + getEmployeeRole());
        System.out.println("Department: " + getEmployeeDepartment());
        System.out.println("Employee ID: " + this.employeeID);
        System.out.println("Name: " + getEmployeeName() + "\n");
    }

    public void setEmployeesManaged(Integer employees) { this.employeesManaged = employees; }

    public String getEmployeeID() { return this.employeeID; }
    public Integer getEmployeesManaged() { return this.employeesManaged; }
}
