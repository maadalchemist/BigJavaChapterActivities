import java.util.Scanner;

public class Main {
    enum Season {
        WINTER,
        SPRING,
        SUMMER,
        FALL {
            @Override
            public Season next() {
                return WINTER;
            };
        };

        public Season next() {
            return values()[ordinal() + 1];
        }
    }

    public static void main(String[] args) {
        int month = 0;
        int day = 0;
        Season season = Season.SPRING;
        Scanner in = new Scanner(System.in);
        System.out.print("Month: ");

        while (month == 0) {
            if (in.hasNextInt()) {
                int next_int = in.nextInt();
                if (next_int > 0 && next_int <= 12) {
                    month = next_int;
                    break;
                }
            }
            System.out.print("Please input a valid month: ");
        }

        System.out.print("Day: ");
        while (day == 0) {
            if (in.hasNextInt()) {
                int next_int = in.nextInt();
                if (next_int > 0 && next_int <= 31) {
                    day = next_int;
                    break;
                }
            }
            System.out.print("Please input a valid day: ");
        }

        if (month <=1 && month <= 3) {  season = Season.WINTER;  }
        else if (month <=4 && month <= 6) {  season = Season.SPRING;  }
        else if (month <=7 && month <= 9) {  season = Season.SUMMER;  }
        else if (month <=11 && month <= 12) {  season = Season.FALL;  }

        if (month % 3 == 0) {
            season = season.next();
        }

        System.out.print("Season: " + season);
    }
}
