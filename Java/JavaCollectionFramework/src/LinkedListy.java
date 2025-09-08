import java.util.Arrays;
import java.util.LinkedList;



// class Node{
//     public int value;

//     public Node next;
// }

public class LinkedListy {
    public static void main(String[] args) {
        // Node node1 = new Node();
        // Node node2 = new Node();
        
        // node1.value = 1;
        // node1.next = node2;
        // node2.value = 9;
        // node2.next = null;      // this is referance to next node 

        LinkedList <Integer> linkedList = new LinkedList<>();
        linkedList.add(7);
        linkedList.add(8);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.addFirst(5);
        linkedList.addLast(8);
        linkedList.getFirst();
        linkedList.getLast();
        linkedList.remove(2);
        System.out.println(linkedList);
        System.out.println(linkedList.getFirst());
        linkedList.removeIf(x -> x%2==0);
        System.out.println(linkedList);

        LinkedList <String> animals = new LinkedList<>(Arrays.asList("cat", "dog","cow"));
    }
    
}
