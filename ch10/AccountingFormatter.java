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

public class AccountingFormatter implements NumberFormatter {

    public AccountingFormatter() {}

    public String format(int n) {
        if (n >= 0) {
          return Integer.toString(n);
        }
        String s = Integer.toString(n);
        return "(" + s.substring(1, s.length()) + ")";
    }
}
