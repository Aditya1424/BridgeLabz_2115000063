import java.util.*;

public class program_32{
    public static void main(String[] args) {
        Scanner adi =new Scanner(System.in);
        
        int age[]= new int[10];
        for(int i=0;i<10;i++){
            age[i]= adi.nextInt();
        }
        
        for (int i =0;i<age.length;i++){
            boolean vote =canVote(age[i]);
            if(vote) {
                System.out.println("Age: " +age[i] +" can vote.");
            }
            else{
                System.out.println("Age: " +age[i] +" cannot vote.");
            }
        }
        
        
    }
    public static boolean canVote(int age){
        if(age<0){
            return false;
        }
        
        else if(age>=18){
            return true;
        }
        
        return false;
    }
}
