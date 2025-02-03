import java.util.*;
public class Student {
    static String universityName = "GLA University";
    static int totalStudents = 0;
    
    String name;
    char grade;
    int rollNumber;
    
    public Student(String name, final int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    
    public void display() {
        System.out.println("University Name: " + universityName);
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
    
    public static void displayTotalStudents() {
        System.out.println("Total Students Enrolled: " + totalStudents);
    }
    
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        
        String name= adi.nextLine();
        int rollNumber =adi.nextInt();
        char grade =adi.next().charAt(0);
        
        Student student = new Student(name, rollNumber, grade);
        
        if (student instanceof Student) {
            student.display();
        }
        
        displayTotalStudents();
    }
}