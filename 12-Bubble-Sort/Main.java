public class Main {

    public static void main(String[] args) {
        
        // Bubble Sort = pairs of adjacent elements are compared, and the elements
        //               swapped if they are not in order.

        //               Time Complexity: Quadratic Time O(n^2)
        //               small data set = okey-ish
        //               large data set = bad

        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        bubbleSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }

    }

    public static void bubbleSort(int[] array) {
        
        for(int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - 1 - i; j++){
                if(array[j] > array[j + 1]) { // ascending order
                // if(array[j] < array[j + 1]) { // descending order
                    // Swap the elements
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }

    }

}