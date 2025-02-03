import java.util.*;
public class Employee{
    static String companyName = "Capgemini";
    static int totalEmployees =0;
    
    String name;
    String designation;
    int id;
    
    public Employee(String name, String designation, final int id) {
        this.name = name;
        this.designation = designation;
        this.id = id;
        totalEmployees++;
    }
    
    public void display() {
        System.out.println("Company Name: " + companyName);
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Employee ID: " + id);
    }
    
    public static void displayTotalEmployees() {
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        
        String name = adi.nextLine();
        String designation= adi.nextLine();
        int id = adi.nextInt();
        
        Employee emp = new Employee(name, designation, id);
        
        if (emp instanceof Employee) {
            emp.display();
        }
        
        displayTotalEmployees();
    }
}

