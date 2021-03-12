import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;

public class NumberToWords {
    private int num[];
    private static Character[][] numberToCharMap;
    public ArrayList<String> words;

    public NumberToWords(int number) throws FileNotFoundException {
        this.num = intToArray(number);
        generateNumberToCharMap();
        this.words = wordList(verboseList(num));
    }

    private static ArrayList<String> verboseList(int[] number, int index, String tempString) {
        int length = number.length;
        if(length == index) {
            return new ArrayList<>(Collections.singleton(tempString));
        }

        ArrayList<String> verboseList = new ArrayList<>();

        for(int i = 0; i < numberToCharMap[number[index]].length; i++) {
            String tempStringClone = String.copyValueOf(tempString.toCharArray());
            tempStringClone = tempStringClone.concat(numberToCharMap[number[index]][i].toString());
            verboseList.addAll(verboseList(number, index + 1, tempStringClone));
        }
        return verboseList;
    }

    private static ArrayList<String> verboseList(int[] number) {
        // generateNumberToCharMap();
        ArrayList<String> verboseList = verboseList(number, 0, "");
        return verboseList;
    }

    private static ArrayList<String> wordList(ArrayList<String> verboseList) throws FileNotFoundException {
        Scanner wordMaster = new Scanner(new File("words.txt"));
        ArrayList<String> words = new ArrayList<String>();
        while (wordMaster.hasNext()) {
            words.add(wordMaster.next());
        }
        ArrayList<String> wordList = new ArrayList<String>();
        for (String s : verboseList) {
            if (words.contains(s)) { wordList.add(s); }
        }
        return wordList;
    }

    private static void generateNumberToCharMap() {
        numberToCharMap = new Character[10][5];
        numberToCharMap[0] = new Character[] {'\0'};
        numberToCharMap[1] = new Character[] {'\0'};
        numberToCharMap[2] = new Character[] {'a','b','c'};
        numberToCharMap[3] = new Character[] {'d','e','f'};
        numberToCharMap[4] = new Character[] {'g','h','i'};
        numberToCharMap[5] = new Character[] {'j','k','l'};
        numberToCharMap[6] = new Character[] {'m','n','o'};
        numberToCharMap[7] = new Character[] {'p','q','r','s'};
        numberToCharMap[8] = new Character[] {'t','u','v'};
        numberToCharMap[9] = new Character[] {'w','x','y','z'};
    }

    private int[] intToArray(int num) {
        int[] out = new int[Integer.toString(num).length()];
        while (num > 0) {
            out[Integer.toString(num).length()-1] = num % 10;
            num /= 10;
        }
        return out;
    }
}

// Phone numbers and PIN codes can be easier to remember when you find words that spell out the number on a standard phone pad.
// For example, instead of remembering the combination 5282, you can just think of JAVA.
// Write a recursive method that, given a number, yields all possible spellings (which may or may not be real words).
//
// checking the words against the /usr/share/dict/words file on your computer, or the words.txt file in the companion code for this book.
// For a given number, return only actual words.
