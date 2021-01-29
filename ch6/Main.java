import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> fibonacci = new ArrayList<Integer>();
        int n;

        System.out.print("Please enter the number of iterations you would like to calculate: ");
        n = in.nextInt();

        for (int i = 0; i < n; i ++) {
            if (fibonacci.size() < 2) {
                fibonacci.add(1);
                continue;
            }
            fibonacci.add(fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2));
        }

        for (int i : fibonacci) {
            System.out.print(i + ", ");
        }
    }
}
