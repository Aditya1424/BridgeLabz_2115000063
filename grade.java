import java.util.*;
public class grade{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        int physics =adi.nextInt();
        int chemistry =adi.nextInt();
        int maths =adi.nextInt();

        int totalMarks =physics+chemistry+maths;
        double percentage = totalMarks/3.0;

        String grade = "";
        String remarks = "";

        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4, above agency-normalized standards";
        } 
		else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3, at agency-normalized standards";
        } 
		else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2, below, but approaching agency-normalized standards";
        } 
		else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1, well below agency-normalized standards";
        } 
		else if (percentage >= 40) {
            grade = "E";
            remarks = "Level 1-, too below agency-normalized standards";
        } 
		else {
            grade = "R";
            remarks = "Remedial standards";
        }
		
        System.out.printf("Average Marks: %.2f\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
    }
}