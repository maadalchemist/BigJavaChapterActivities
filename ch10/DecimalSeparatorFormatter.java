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

public class DecimalSeparatorFormatter implements NumberFormatter {

    public DecimalSeparatorFormatter() {}

    public String format(int n) {
        String s = Integer.toString(n);
        String s2 = "";
        int i = 3;

        while (i < s.length() - 3){
            s2 = "," + s.substring(s.length() - i, s.length() - i + 3) + s2;
            i += 3;
        }
        s2 = s.substring(0, s.length() - i + 3) + s2;
        return s2;
    }
}
