public class BankAccountTester {
  public static void main(String[] args) {
    BankAccount account = new BankAccount();

    //Check balance of unaltered BankAccount
    System.out.println("Testing consructor");
    System.out.println("Account balance   : $" + account.getBalance());
    System.out.println("Expected  balance : $" + "0.0 \n");

    //Check deposit function
    System.out.println("Testing deposit");
    account.deposit(4.20);
    System.out.println("Account balance   : $" + account.getBalance());
    System.out.println("Expected  balance : $" + "4.20 \n");

    //Check withdrawl function
    System.out.println("Testing withdrawl");
    account.withdrawl(3.51);
    System.out.println("Account balance   : $" + account.getBalance());
    System.out.println("Expected  balance : $" + "0.69 \n");

    //Check monthly charge
    System.out.println("Testing monthly charge (makes 10 more account changes, total of 12)");
    account.deposit(1.00);
    account.deposit(1.00);
    account.deposit(1.00);
    account.deposit(1.00);
    account.deposit(1.00);
    account.deposit(1.00);
    account.deposit(1.00);
    account.deposit(1.00);
    account.deposit(1.00);
    account.deposit(1.00);
    account.deductMonthlyCharge();
    System.out.println("Account balance   : $" + account.getBalance());
    System.out.println("Expected  balance : $" + "10.09 \n");

    //Check balance of bankAccount with initial deposit after creation
    System.out.println("Testing consructor 2");
    account = new BankAccount(69);
    System.out.println("Account balance   : $" + account.getBalance());
    System.out.println("Expected  balance : $" + "69.00 \n");

    //Check monthly charge
    System.out.println("Testing monthly charge (no transatcions)");
    account.deductMonthlyCharge();
    System.out.println("Account balance   : $" + account.getBalance());
    System.out.println("Expected  balance : $" + "69.00 \n");
  }
}
