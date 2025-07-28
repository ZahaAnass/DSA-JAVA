
public class Main {

    public static void main(String[] args) {

        long start = System.nanoTime();

        // ------------- Start Program -------------

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ------------- End Program -------------

        long duration = ( System.nanoTime() - start ) / 1000000;

        System.out.println("Execution time: " + duration + "ms");

    }


}