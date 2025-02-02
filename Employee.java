class Employee{
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeInfo() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: $" + salary);
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayManagerInfo() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Team Name: " + teamName);
    }
}

public class Main {
    public static void main(String[] args) {
		
        Employee emp = new Employee(101, "IT", 60000);
        emp.displayEmployeeInfo();

        System.out.println();

        Manager mgr = new Manager(201, "HR", 90000, "Recruitment");
        mgr.displayManagerInfo();

        System.out.println("\nUpdating salary...");
        emp.setSalary(65000);
        System.out.println("Updated Salary: $" + emp.getSalary());
    }
}
