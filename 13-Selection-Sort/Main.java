public class Main {

    public static void main(String[] args) {
        
        // selection sort = search through an array and keep track of minimun value during
        //                  each iteration. At the end of each iteration, we swap variables.

        //                  Time Complexity: Quadratic Time O(n^2)
        //                  small data set = okey-ish
        //                  large data set = BAD


        int[] array = {9, 1, 8, 2, 7, 3, 6, 4, 5};

        selectionSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void selectionSort(int[] array) {
        for(int i = 0; i < array.length; i++) {
            int min = i;            
            for(int j = i+1; j < array.length; j++){
                if(array[min] > array[j]){
                    min = j;
                }
            }            
            int temp = array[i];
            array[i] = array[min];
            array[min] = temp;
        }
    }
}
