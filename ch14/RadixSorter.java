import java.util.*;

public class RadixSorter {
    private ArrayList<int> zero, one, two, three, four, five, six, seven, eight, nine;

    public RadixSorter() {
        zero = new ArrayList<int>();
        one = new ArrayList<int>();
        two = new ArrayList<int>();
        three = new ArrayList<int>();
        four = new ArrayList<int>();
        five = new ArrayList<int>();
        six = new ArrayList<int>();
        seven = new ArrayList<int>();
        eight = new ArrayList<int>();
        nine = new ArrayList<int>();
    }

    public ArrayList<int> radix_sort(ArrayList<int> unsorted) {
        int digit = 1;
        int max_digit = 0;
        for(int num : unsorted) {
            switch (num % 10) {
                case 0:
                    zero.add(num);
                    break;
                case 1:
                    one.add(num);
                    break;
                case 2:
                    two.add(num);
                    break;
                case 3:
                    three.add(num);
                    break;
                case 4:
                    four.add(num);
                    break;
                case 5:
                    five.add(num);
                    break;
                case 6:
                    six.add(num);
                    break;
                case 7:
                    seven.add(num);
                    break;
                case 8:
                    eight.add(num);
                    break;
                case 9:
                    nine.add(num);
                    break;
            }

            int temp = 0;
            while
        }
    }
}
/**
* The radix sort algorithm sorts an array of n integers with d digits, using ten auxiliary arrays.
* First place each value v into the auxiliary array whose index corresponds to the last digit of v.
* Then move all values back into the original array, preserving their order.
* Repeat the process, now using the next-to-last (tens) digit, then the hundreds digit, and so on.
* What is the big-Oh time of this algorithm in terms of n and d? When is this algorithm preferable to merge sort?
*/
