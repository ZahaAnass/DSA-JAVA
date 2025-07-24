
public class Main {

    // recursion = When a thing is defined in terms of itself. - Wikipedia
    //             Apply the result of a precedure, to a procedure.
    //             A recursive method call itself. Can be a substitule for iteration.
    //             Divide a problem into sub-problems of the same type as the original.
    //             Commonly used with advance sorting algorithms and navigating trees

    //             Advantages:
    //             -----------
    //             easier to read and write
    //             easier to debug
    
    //             Disadvantages:
    //             ------------
    //             sometimes slower
    //             uses more memory

    public static void main(String[] args) {

        System.err.println("Factorial: " + factorial(7));

        System.err.println("Power: " + power(2, 8));

    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1; // base case
        return base * power(base, exponent - 1); // recursive
    }

    public static int factorial(int num) {

        if(num < 1) return 1; // base case
        return num * factorial(num - 1); // recursive

    }

}
