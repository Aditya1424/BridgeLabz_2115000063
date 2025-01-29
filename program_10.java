import java.util.*;
public class program_10{
    public static void main(String []args){
        Scanner adi= new Scanner(System.in);
        
        String s= adi.nextLine();
        char ch= adi.next().charAt(0);
        
        String res="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)!=ch){
                res+=s.charAt(i);
            }
        }
        System.out.println(res);
        
    }
}