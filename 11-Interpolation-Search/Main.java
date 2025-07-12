public class Main {

    public static void main(String[] args) {
        
        // interpolation search = improvement over binary search used for "uniformly"
        //                        distributed data "guesses" where a value might be
        //                        based on calculated probe results
        //                        if probe is incorrect, search area is narrowed, and 
        //                        a new probe is calculated

        //                        average case: O(log log n)
        //                        worst case: O(n) (if data is not uniformly distributed)
    
        // int[] firstArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] secondArray = {1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024};

        int index = interpolationSearch(secondArray, 8);

        if(index != -1) {
            System.out.println("Value found at index: " + index);
        } else {
            System.out.println("Value not found in the array.");
        }
    }

    private static int interpolationSearch(int[] array, int value) {

        int high = array.length - 1;
        int low = 0;

        while (value >= array[low] && value <= array[high] && low <= high) {
            // calculate probe position
            int probe = low + ((value - array[low]) * (high - low)) / (array[high] - array[low]);

            System.out.println("Probe: " + probe + " | Low: " + low + " | High: " + high + " | Value: " + value);

            // check if probe is correct
            if (array[probe] == value) {
                return probe;
            }

            // if probe is too low, narrow search to upper half
            if (array[probe] < value) {
                low = probe + 1;
            } 
            // if probe is too high, narrow search to lower half
            else {
                high = probe - 1;
            }
            
        }
        return -1; // value not found
    }   
}