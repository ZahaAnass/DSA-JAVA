// import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

        // ArrayList<String> arrayList = new ArrayList<String>();

        DynamicArray dynamicArray = new DynamicArray(5);

        dynamicArray.add("A");
        dynamicArray.add("B");
        dynamicArray.add("C");
        dynamicArray.add("D");
        dynamicArray.add("E");
        dynamicArray.add("F"); // This will trigger a grow operation
    
        dynamicArray.insert(0, "X"); // Insert X at index 0

        dynamicArray.delete("A"); // Delete element B

        int index = dynamicArray.search("C"); // Search for element C
        System.out.println("Index of C: " + index); // Should print the index of C

        System.out.println("Dynamic Array created with default capacity: " + dynamicArray.capacity);
        System.out.println("Array is empty: " + dynamicArray.isEmpty());
        System.out.println("Current size of the array: " + dynamicArray.size);
        System.out.println("Array capacity: " + dynamicArray.capacity);
        System.out.println("Array content: " + dynamicArray.toString()); // Output: A, B, C, Optional: add toString method to format output
    }
    


}