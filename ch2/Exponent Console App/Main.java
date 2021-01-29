import java.util.Scanner;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        BigInteger a;

        System.out.println("Welcome to the exponent console app!");
        System.out.println("Please input a number:");
        a = new BigInteger(cin.next());
        System.out.println("Your number:                   " + a.pow(1));
        System.out.println("Your number squared:           " + a.pow(2));
        System.out.println("Your number to the power of 4: " + a.pow(4));
        System.out.println("Your number to the power of 8: " + a.pow(8));

    }
}
