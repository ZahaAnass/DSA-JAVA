import java.util.*;

public class Main {

    public static void main(String args[]){

        // Priority Queue = A FIFO data structure that serves elements
        //                  with the highest priority first.
        //                  before elements with lower priority.

        Queue<Double> queue = new PriorityQueue<Double>(); // Default is min-heap, retrieves the smallest element first
        Queue<Double> reverseQueue = new PriorityQueue<Double>(Collections.reverseOrder()); // Using Collections.reverseOrder() to create a max-heap, retrieves the largest element first
        Queue<String> stringQueue = new PriorityQueue<String>();

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        reverseQueue.offer(3.0);
        reverseQueue.offer(2.5);
        reverseQueue.offer(4.0);
        reverseQueue.offer(1.5);
        reverseQueue.offer(2.0);

        stringQueue.offer("B");
        stringQueue.offer("A");
        stringQueue.offer("D");
        stringQueue.offer("C");
        stringQueue.offer("F");

        System.out.printf("******** Max Queue: ******** \n");
        while (!reverseQueue.isEmpty()) {
            System.out.println("The Retrived element is: " + reverseQueue.poll()); // Retrieves and removes the head of the queue, or returns null if empty
            // This will print the elements in descending order due to max-heap:
            // 4.0
            // 3.0
            // 2.5
            // 2.0
            // 1.5
        }

        System.out.printf("******** Min Queue: ******** \n");
        while (!queue.isEmpty()) {
            System.out.println("The Retrived element is: " + queue.poll()); // Retrieves and removes the head of the queue, or returns null if empty
            // This will print the elements in ascending order due to min-heap:
            // 1.5
            // 2.0
            // 2.5
            // 3.0
            // 4.0
            
        }

        System.out.printf("******** String Queue: ******** \n");
        while (!stringQueue.isEmpty()) {
            System.out.println("The Retrived element is: " + stringQueue.poll()); // Retrieves and removes the head of the queue, or returns null if empty
        }

    }

}
