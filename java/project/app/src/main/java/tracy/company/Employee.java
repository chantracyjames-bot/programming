package tracy.company;

public abstract class Employee {
    protected String employeeID;
    private String employeeName;
    private String employeeDepartment;
    private String employeeRole;
    private Double employeeSalary;
    private Double employeeAllowance;
    private static Integer numberOfManagers = 0;
    private static Integer numberOfDevelopers = 0;

    public Employee(String employeeName, String employeeDepartment, String employeeRole, double employeeSalary, double employeeAllowance) {
        this.employeeName = employeeName;
        this.employeeDepartment = employeeDepartment;
        this.employeeRole = employeeRole;
        this.employeeSalary = employeeSalary;
        this.employeeAllowance = employeeAllowance;
    }

    public abstract void displayInformation();
    public abstract void displayRole();

    public void setEmployeeName(String employeeName) { this.employeeName = employeeName; }
    public void setEmployeeDepartment(String employeeDepartment) { this.employeeDepartment = employeeDepartment; }
    public void setEmployeeRole(String employeeRole) { this.employeeRole = employeeRole; }
    public void setEmployeeSalary(Double employeeSalary) { this.employeeSalary = employeeSalary; }
    public void setEmployeeAllowance(Double employeeAllowance) { this.employeeAllowance = employeeAllowance; }
    public static void incrementManagers() { numberOfManagers++; }
    public static void incrementDevelopers() { numberOfDevelopers++; }

    public String getEmployeeID() { return this.employeeID; }
    public String getEmployeeName() { return this.employeeName; }
    public String getEmployeeDepartment() { return this.employeeDepartment; }
    public String getEmployeeRole() { return this.employeeRole; }
    public Double getEmployeeSalary() { return this.employeeSalary; }
    public Double getEmployeeAllowance() { return this.employeeAllowance; }
    public static Integer returnManagerNumber() { return numberOfManagers; }
    public static Integer returnDeveloperNumber() { return numberOfDevelopers; }
}
