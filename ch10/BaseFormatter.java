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

public class BaseFormatter implements NumberFormatter {

private int nx;

    public BaseFormatter(int n) {
        if (n >= 2 && n <= 36) {
            this.nx = n;
        } else {
            this.nx = 2;
        }
    }

    public String format(int n) {
        return Integer.toString( Integer.parseInt(Integer.toString(n), 10), nx);
    }
}

// Based? Based on what?
