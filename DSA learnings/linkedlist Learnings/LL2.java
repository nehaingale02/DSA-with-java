// Linkedlist with collection frameworks
import java.util.*;
class LL2 {
    public static void main (String args[]){
        LinkedList<String> list = new LinkedList<String>();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast("list");
        list.add("of String"); // by default when we add the element in list, it enters from last
        System.out.println(list);
        System.out.println(list.size());

        //for printing linked list we run a loop 
        for (int i=0 ;i< list.size(); i++ ){
            System.out.print(list.get(i) + " -> ");
        }
        System.out.println("null");
        
        list.removeFirst();
        System.out.println(list);
        list.removeLast();
        System.out.println(list);
       
        //  OR

        // list.remove(index num to remove)
        // list.remove(3);
        // System.out.println(list);
    }
}  

