import java.util.*;
public class StringConcatination {
    public static String concatinateStrings(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String str :arr) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner adi = new Scanner(System.in);
        int n = adi.nextInt();
        adi.nextLine(); 
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = adi.nextLine();
        }
        
        String res= concatinateStrings(arr);
        System.out.println(res);
    }
}
