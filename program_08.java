import java.util.*;
public class program_08{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);
        String str1 = adi.nextLine();
        String str2 = adi.nextLine();
        int minLength= Math.min(str1.length(), str2.length());
        int res= 0;
        for (int i = 0;i<minLength;i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                res =str1.charAt(i) - str2.charAt(i);
                break;
            }
        }
        if (res== 0 && str1.length() != str2.length()) {
            res= str1.length() - str2.length();
        }
        if (res< 0) {
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order");
        } 
        else if (res> 0) {
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\" in lexicographical order");
        } 
        else {
            System.out.println("Both strings are equal");
        }
    }
}
