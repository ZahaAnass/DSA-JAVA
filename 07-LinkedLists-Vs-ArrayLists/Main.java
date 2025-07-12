// ********************************************
//
// LinkedList vs ArrayList: Quick Reference
//
// 1. Structure:
//    - ArrayList: Dynamic array (contiguous memory)
//    - LinkedList: Chain of nodes with references
//
// 2. Performance:
//    - ArrayList: Fast access O(1), slow insertions O(n)
//    - LinkedList: Slow access O(n), fast end insertions O(1)
//
// 3. When to use:
//    - ArrayList: For lots of random access, few modifications
//    - LinkedList: For frequent insertions/deletions, sequential access
//
// 4. Memory:
//    - ArrayList: Lower overhead per element
//    - LinkedList: Higher overhead (extra pointers)
//
// ********************************************

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<Integer>();
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        
        long startTime, endTime, elapsedTime;

        for(int i = 0; i < 1000000; i++) {
            linkedList.add(i);
            arrayList.add(i);
        }        

        // **********************LinkedList**********************
        startTime = System.nanoTime();

        // linkedList.get(0);
        // linkedList.get(500000);
        // linkedList.get(999999);
        // linkedList.remove(0);
        // linkedList.remove(500000);
        linkedList.remove(999999); // Remove last element


        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("LinkedList elapsed time: " + elapsedTime + " nanoseconds");

        // **********************ArrayList**********************

        startTime = System.nanoTime();

        // arrayList.get(0);
        // arrayList.get(500000);
        // arrayList.get(999999);
        // arrayList.remove(0);
        // arrayList.remove(500000);
        arrayList.remove(999999); // Remove last element

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("ArrayList elapsed time: " + elapsedTime + " nanoseconds");



    }

}