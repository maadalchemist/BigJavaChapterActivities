import java.io.*;
import java.util.Scanner;

public class Tester{
    public static void main(String[] args) throws FileNotFoundException {
        NumberToWords test = new NumberToWords(2356833);
        for (String s : test.words) {
            System.out.println(s);
        }
    }
}
