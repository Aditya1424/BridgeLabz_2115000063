import java.util.*;
public class program_05{
	public static void main(String []args){
		Scanner adi= new Scanner(System.in);
		String s= adi.nextLine();
        
        String w[]= s.split(" ");
        
        String res= w[0];
        for(int i=1;i<w.length;i++){
            if(w[i].length()>res.length()){
                res= w[i];
            }
        }
        
        System.out.println(res);
	}
}
