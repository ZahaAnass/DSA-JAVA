import java.util.LinkedList;

public class Main{
    
    public static void main(String[] args) {

        // ********************************************

        // Linked List = stores Nodes in 2 parts (data + address)
        //               Nodes are in non-consecutive memory locations
        //               Elements are linked using pointers

        //                                 Singly Linked List
        //                   Node                Node                Node
        //              [data | address]    [data | address]    [data | address]

        //                                 Doubly Linked List
        //                   Node                            Node                          Node
        //          [address | data | address]    [address | data | address]    [address | data | address]


        //             advatages?
        //             1. Dynamic Data Structure (allocates needed memory while running)
        //             2. Insertion and Deletion of Nodes is easy. O(1)
        //             3. No/Low memory waste (unlike arrays which allocate a fixed size)


        LinkedList<String> linkedList = new LinkedList<String>();

        // LinkedList as a Stack
        /*
        linkedList.push("A");
        linkedList.push("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");
        linkedList.pop(); // removes "F"
         */

        // LinkedList as a Queue
        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");
        // linkedList.poll(); // removes "A"

        linkedList.add(2, "E"); // inserts "E" at index 2
        linkedList.remove("E"); // removes element "E"
        System.out.println(linkedList.peekFirst() + " is the first element");
        System.out.println(linkedList.peekLast() + " is the last element");

        linkedList.addFirst("0");
        linkedList.addLast("G");
        String first = linkedList.removeFirst();
        String last = linkedList.removeLast();

        System.out.println("Removed first: " + first);
        System.out.println("Removed last: " + last);

        System.out.println("Linked List size: " + linkedList.size());

        System.err.println("Linked List: " + linkedList);



    }

}
