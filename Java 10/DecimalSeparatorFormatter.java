// Consider an interface
//
// public interface NumberFormatter
// {
//    String format(int n);
// }
// Provide four classes that implement this interface. \
// A DefaultFormatter formats an integer in the usual way.
// A DecimalSeparatorFormatter formats an integer with decimal separators; for example, one million as 1,000,000.
// An AccountingFormatter formats negative numbers with parentheses; for example, –1 as (1).
// A BaseFormatter formats the number in base n, where n is any number between 2 and 36 that is provided in the constructor.

public class DecimalSeparatorFormatter {
    String format(int n) {
        String s = Integer.toString(n);
        int inj = 3;
        for (int i = 0; i < s.length() / 3; i++) {
            s.substring(0,inj) + "," + s.sunstring(inj,s.length());
        }
    }
}
