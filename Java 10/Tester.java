public class Tester {
    public static void main(String[] args) {
        NumberFormatter def = new DefaultFormatter();
        int test = -123456789;
        System.out.println("\nDefault formatting:           " + def.format(test));
        System.out.println("Expected:                     -1234567891\n");

        NumberFormatter accounting = new AccountingFormatter();
        System.out.println("Accounting formatting:        " + accounting.format(test));
        System.out.println("Expected:                     (123456789)\n");

        NumberFormatter decimal = new DecimalSeparatorFormatter();
        System.out.println("Decimal Separator formatting: " + decimal.format(test));
        System.out.println("Expected:                     -123,456,789\n");

        NumberFormatter base = new BaseFormatter(8);
        System.out.println("Accounting formatting:        " + base.format(test));
        System.out.println("Expected:                     -726746425\n");
    }
}
