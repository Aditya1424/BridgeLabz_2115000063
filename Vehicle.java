import java.util.*;

public class Vehicle {
    static double registrationFee =500.0;
    
    String ownerName;
    String vehicleType;
    int registrationNumber;
    
    public Vehicle(String ownerName, String vehicleType, final int registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    
    public void display() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Registration Fee: " + registrationFee);
    }
    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
    
    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        
        String ownerName = adi.nextLine();
        String vehicleType = adi.nextLine();
        int registrationNumber = adi.nextInt();
        
        Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);
        
        if (vehicle instanceof Vehicle) {
            vehicle.display();
        }
        
        System.out.println("Enter new registration fee: ");
        double newFee = adi.nextDouble();
        updateRegistrationFee(newFee);
        System.out.println("Updated Registration Fee: " + registrationFee);
    }
}