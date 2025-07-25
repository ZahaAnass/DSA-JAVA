
public class Main {

    public static void main(String[] args) {
        
        // quick sort = moves smaller elements to left of a pivot.
        //              recursively divide array in 2 partitions

        // run-time complexity = Best case O(n log n)
        //                       Average case O(n log n)
        //                       Worst case O(n^2) if already sorted or reverse sorted

        // space complexity = O(log n) due to recursive stack space

        int[] array = {8, 2, 5, 3, 9, 4, 7, 6, 1};
        
        quickSort(array, 0, array.length - 1);

        for (int num : array) {
            System.out.print(num + " ");
        }

    }

    private static void quickSort(int[] array, int start, int end) {

        if(end <= start) return; // base case

        int pivot = partition(array, start, end);

        quickSort(array, start, pivot - 1); // sort left side
        quickSort(array, pivot + 1, end); // sort right side
    }

    private static int partition(int[] array, int start, int end) {

        int pivot = array[end]; // choose the last element as pivot
        int i = start - 1; // index of smaller element

        for(int j = start; j < end; j++) {
            if(array[j] <= pivot) { // if current element is smaller than or equal to pivot
                i++; // increment index of smaller element
                int temp = array[i]; // swap elements
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        int temp = array[i];
        array[i] = array[end];
        array[end] = temp;

        return i; // return the partition index
    }

}
