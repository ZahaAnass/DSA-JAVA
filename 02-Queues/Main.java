import java.util.LinkedList;
import java.util.Queue;

public class Main {

    public static void main(String[] args){

        // Queue = FIFO data stucture (First In First Out)
        //         A collection designed for holding elements prior to processing
        //         Linear data structure
        
        //         add = enqueue, offer()
        //         remove = dequeue, poll()

        // ***************************************************

        // Where are queus used?
        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs shold be completed in order)
        // 3. Used in LinkedLists, Priority queues, Breadth-Firt Search (BFS) algorithms, etc. 

        // ***************************************************

        Queue<String> queue = new LinkedList<String>();

        queue.offer("Karen");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harold");

        System.out.println("Size of the queue is: " + queue.size()); // Returns the number of elements in the queue
        System.out.println("Contains Chad? " + queue.contains("Chad")); // Returns true if the queue contains the specified element
        System.out.println("The First Element In The Queue Is: " + queue.peek()); // Returns the head of the queue, or null if empty
        System.out.println("The Retrived element is: " + queue.poll()); // Retrieves and removes the head of the queue, or returns
        System.out.println("The Retrived element is: " + queue.poll()); // Retrieves and removes the head of the queue, or returns

        System.out.println(queue);

    }

}