public class Main {
  public static void main(String[] args) {
    // declare relevant variables
    double pi = 1;
    int subtract = -1;
    long start = System.currentTimeMillis( );

    // calculate pi
    for (double i = 3; i < 2147483647; i += 2) {
      pi += (1 / i) * subtract;
      subtract = -subtract;
    }
    pi = pi * 4;
    long end = System.currentTimeMillis( );

    // output pi and calculate time in milliseconds
    System.out.println("Pi is approximately equal to: " + pi);
    System.out.println("This took " + (end - start) + " milliseconds to calculate");
  }
}
