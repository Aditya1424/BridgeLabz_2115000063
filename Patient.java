import java.util.*;
public class Patient{
    static String hospitalName = "Apollo Hospital";
    static int totalPatients =0;
    String name;
    int age;
    String ailment;
    int patientID;
    
    public Patient(String name, int age, String ailment, final int patientID) {
        this.name = name;
        this.age = age;
        this.ailment = ailment;
        this.patientID = patientID;
        totalPatients++;
    }
    
    public void display() {
        System.out.println("Hospital Name: " +hospitalName);
        System.out.println("Patient Name: " +name);
        System.out.println("Age: " +age);
        System.out.println("Ailment: " +ailment);
        System.out.println("Patient ID: " +patientID);
    }
    
    public static void getTotalPatients() {
        System.out.println("Total Patients Admitted: " + totalPatients);
    }
    
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        String name = adi.nextLine();
        int age = adi.nextInt();
        adi.nextLine(); 
        String ailment = adi.nextLine();
        int patientID = adi.nextInt();
        
        Patient patient = new Patient(name, age, ailment, patientID);
        
        if (patient instanceof Patient) {
            patient.display();
        }
        
        getTotalPatients();
    }
}
