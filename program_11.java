import java.util.*;
public class program_11{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        double[] salary= new double[10];
        double[] yearsOfService = new double[10];
        double[] bonus = new double[10];
        double[] newSalary = new double[10];
        double totalBonus = 0,totalOldSalary = 0,totalNewSalary = 0;
		for (int i = 0; i < 10; i++) {
            salary[i] = adi.nextDouble();
            yearsOfService[i] = adi.nextDouble();

            if (salary[i] < 0 || yearsOfService[i] < 0) {
                System.out.println("Invalid input. Try again.");
                i--;
            }
        }

        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonus[i] = salary[i] * 0.05;
            } else {
                bonus[i] = salary[i] * 0.02;
            }
            newSalary[i] = salary[i] + bonus[i];
            totalBonus += bonus[i];
            totalOldSalary += salary[i];
            totalNewSalary += newSalary[i];
        }

        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary: " + totalOldSalary);
        System.out.println("Total new salary: " + totalNewSalary);
    }
}
