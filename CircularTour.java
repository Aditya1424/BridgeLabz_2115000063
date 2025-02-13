import java.util.*;
public class CircularTour {
    static class PetrolPump {
        int petrol, distance;
        public PetrolPump(int petrol,int distance) {
            this.petrol =petrol;
            this.distance= distance;
        }
    }

    public static int findStartingPoint(PetrolPump pumps[]){
        int start =0;
		int deficit = 0;
		int surplus = 0;
        
        for (int i = 0; i < pumps.length; i++) {
            surplus += pumps[i].petrol-pumps[i].distance;
            if (surplus < 0){
                start =i+1;
                deficit += surplus;
                surplus= 0;
            }
        }
        
        return ((surplus+deficit)>= 0) ? start: -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        PetrolPump pumps[]= new PetrolPump[n];

        for (int i = 0; i < n; i++) {
            int petrol = scanner.nextInt();
            int distance = scanner.nextInt();
            pumps[i] = new PetrolPump(petrol, distance);
        }
        
        int start = findStartingPoint(pumps);
        System.out.println(start == -1 ? "No possible tour" : "Start at pump: " + start);
    }
}
