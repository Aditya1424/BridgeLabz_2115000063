import java.util.*;
public class ReverseList {
   public static void main(String[] args) {

       List<Integer> ll= new ArrayList<>(Arrays.asList(1,2,3,4,5));
       List<String> ll1= new ArrayList<>(Arrays.asList("Aditya", "Abhay"));

       arrayList(ll);
       arrayList(ll1);
       System.out.println(ll);
       System.out.println(ll1);

       LinkedList<Integer> linkedList = new LinkedList<>(Arrays.asList(1, 2, 3, 4, 5));
       linkedList = reverseLinkedList(linkedList);
       System.out.println(linkedList);
   }

   public static <T> void arrayList(List<T> list){

       int left=0;
       int right= list.size()-1;

       while(left<right){
           T temp= list.get(left);
           list.set(left,list.get(right));
           list.set(right,temp);

           left++;
           right--;
       }
   }
   public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
       LinkedList<T> reversedList = new LinkedList<>();
       for (T item : list) {
           reversedList.addFirst(item);
       }
       return reversedList;
   }
}

