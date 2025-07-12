public class Main {
    
    public static void main(String[] args) {
        
        // ********************************************
        
        // Big O Notation = used to describe the efficiency of an algorithm
        //                  time complexity: how runtime scales with input size
        //                  space complexity: how memory usage scales with input size
        //                  used to analyze "best case", "average case", and "worst case" scenarios
        
        // ********************************************
        
        // Common Big O notations (from fastest to slowest):
        // O(1)        - Constant time: always takes same time regardless of input size
        // O(log n)    - Logarithmic time: input size is reduced with each step
        // O(n)        - Linear time: runtime grows linearly with input size
        // O(n log n)  - Linearithmic time: typical for efficient sorting algorithms
        // O(n²)       - Quadratic time: nested loops over the data
        // O(n³)       - Cubic time: triple nested loops
        // O(2^n)      - Exponential time: doubles with each addition to input
        // O(n!)       - Factorial time: extremely slow, used in brute force algorithms
        
        // ********************************************
        
        // O(1) Example - Constant Time
        System.out.println("\n--- O(1) Example - Constant Time ---");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(numbers[0]); // Always takes same time regardless of array size
        
        // ********************************************
        
        // O(n) Example - Linear Time
        System.out.println("\n--- O(n) Example - Linear Time ---");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }
        // Time complexity increases linearly with array size
        
        // ********************************************
        
        // O(n²) Example - Quadratic Time
        System.out.println("\n--- O(n²) Example - Quadratic Time ---");
        for(int i = 0; i < numbers.length; i++) {
            for(int j = 0; j < numbers.length; j++) {
                System.out.println(numbers[i] + " " + numbers[j]);
            }
        }
        // Nested loops = quadratic growth with input size
        
        // ********************************************
        
        // O(log n) Example - Logarithmic Time
        System.out.println("\n--- O(log n) Example - Logarithmic Time ---");
        // Binary search example
        int target = 5;
        int left = 0;
        int right = numbers.length - 1;
        
        while(left <= right) {
            int mid = left + (right - left) / 2;
            if(numbers[mid] == target) {
                System.out.println("Found at index: " + mid);
                break;
            }
            else if(numbers[mid] < target) {
                left = mid + 1;
            }
            else {
                right = mid - 1;
            }
        }
        // Each step eliminates half of the remaining elements
        
        // ********************************************
        
        // Tips for writing efficient code:
        // 1. Avoid nested loops when possible
        // 2. Use efficient data structures (HashMap for lookups)
        // 3. Avoid recursion without memoization
        // 4. Use binary search when data is sorted
        // 5. Be mindful of space complexity too!
        
        System.out.println("\n--- Space vs. Time Tradeoff Example ---");
        System.out.println("Sometimes using more memory can speed up algorithms");
        System.out.println("Example: Caching results of expensive calculations");
    }
}