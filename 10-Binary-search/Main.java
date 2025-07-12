
public class Main {

    public static void main(String[] args){

        // Binary Search = Search algorithm that finds the position of a target
        //                 value within a sorted array. requires the array to be
        //                 sorted in ascending or descending order.
        //                 Half of the array is eliminated during each "step" .
        //                 runtime complexity = O(log n)

        int[] array = new int[1000000];
        int target = 777777;

        for(int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // int index = Arrays.binarySearch(array, target);
        
        int index = binarySearch(array, target);

        if(index == -1) {
            System.out.println("Target not found in the array.");
        } else {
            System.out.println("Target found at index: " + index);
        }


    }

    private static int binarySearch(int[] array, int target) {
        
        int low = 0;
        int high = array.length - 1;

        while(low <= high) {
            int middle = low + (high - low) / 2;
            int value = array[middle];

            System.out.println("low: " + low + ", high: " + high + ", middle: " + middle + ", value: " + value);

            if(value < target) low = middle + 1;
            else if(value > target) high = middle - 1;
            else return middle; // found the target

        }

        return -1;
    }


}