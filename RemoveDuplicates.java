import java.util.*;
public class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner adi= new Scanner(System.in);

        int n= adi.nextInt();
        ArrayList<Integer> ll= new ArrayList<>();
        while(n-->0){
            ll.add(adi.nextInt());

        }

        LinkedHashSet<Integer> list = new LinkedHashSet<>();
        for(int i:ll){
            list.add(i);
        }

        System.out.println(list);
    }
}