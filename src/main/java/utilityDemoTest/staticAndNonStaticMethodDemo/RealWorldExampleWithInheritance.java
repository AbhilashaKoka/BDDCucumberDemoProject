package utilityDemoTest.staticAndNonStaticMethodDemo;

class Bank {

     static double interestRate = 5.0; // Static variable: shared across all accounts
     double balance; // Non-static variable: unique per customer

    Bank(double balance) {
        this.balance = balance;
    }

    void showDetails() {
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}


class SavingsAccount extends Bank {// Child class inherits non-static variable (balance) and can access static variable (interestRate)
    String accountHolder;

    SavingsAccount(String accountHolder, double balance) {
        super(balance); // inherit balance from parent
        this.accountHolder = accountHolder;
    }

    void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        showDetails(); // inherited method
    }
}

public class RealWorldExampleWithInheritance {
    public static void main(String[] args) {
        // Two different customers
        SavingsAccount acc1 = new SavingsAccount("Alice", 1000);
        SavingsAccount acc2 = new SavingsAccount("Bob", 2000);

        acc1.showAccountInfo();
        acc2.showAccountInfo();

        // Change static variable (interest rate)
        Bank.interestRate = 6.5;

        System.out.println("\nAfter changing interest rate:");
        acc1.showAccountInfo();
        acc2.showAccountInfo();
    }
}
