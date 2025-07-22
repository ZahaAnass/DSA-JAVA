public class Main {

    public static void main(String[] args) {
        

        // insertion sort = take an element and insert it into the correct position in the sorted part of the array.
        //                  Time Complexity: Quadratic Time O(n^2)
        //                  small data set = okey-ish
        //                  large data set = BAD

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        insertionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }


    }

    private static void insertionSort(int[] array) {
        // Start with the second element (i=1) assuming first element is already sorted
        for (int i = 1; i < array.length; i++) {
            // Store current element to be inserted
            int current = array[i];
            int j = i - 1;
            
            // Compare current with each element on the left until a smaller element is found
            // or beginning of array is reached
            while (j >= 0 && array[j] > current) {
                array[j + 1] = array[j]; // Shift elements to make space
                j--;
            }
            
            // Insert current element at correct position
            array[j + 1] = current;
        }
    }
}
