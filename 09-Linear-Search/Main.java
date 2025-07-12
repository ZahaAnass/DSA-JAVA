
public class Main {

    public static void main(String[] args){

        // Linear Search = Iterate through a collection one element at a time

        //                 runtime complexity = O(n)

        //                 Disadvantages:
        //                 - Slow for large collections

        //                 Advantages:
        //                 - Fast for searches of small to medium data sets
        //                 - Does not need to sorted
        //                 - Useful for data structures that do not random access (Linked Lists, Trees)
        
        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        int index = linearSearch(array, 7);

        if (index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found in the array.");
        }


    }

    private static int linearSearch(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i; // Return the index if the value is found
            }
        }
        return -1; // Return -1 if the value is not found
    }



}