package utilityDemoTest.staticAndNonStaticMethodDemo;

class Bank2 {

    static double interestRate = 5.0; // Static variable: shared across all accounts
    double balance;// Non-static variable: unique per customer

    Bank2(double balance) {
        this.balance = balance;
    }

    double calculateInterest() {// Method to calculate interest (can be overridden)
        return balance * interestRate / 100;
    }

    void showDetails() {
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Interest Earned: " + calculateInterest());
    }
}
class SavingsAccount2 extends Bank2 {// Child class overrides method to apply different rules
    String accountHolder;

    SavingsAccount2(String accountHolder, double balance) {
        super(balance);
        this.accountHolder = accountHolder;
    }

    @Override
    double calculateInterest() { // Overriding: Savings accounts get extra 1% bonus
        return balance * (interestRate + 1) / 100;
    }

    void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        showDetails();
    }
}

class CurrentAccount2 extends Bank2 {// Another child class
    String accountHolder;

    CurrentAccount2(String accountHolder, double balance) {
        super(balance);
        this.accountHolder = accountHolder;
    }

    @Override
    double calculateInterest() {
        return 0;
    } // Overriding: Current accounts have no interest

    void showAccountInfo() {
        System.out.println("Account Holder: " + accountHolder);
        showDetails();
    }
}

public class RealWorldExampleWithOverriding {
    public static void main(String[] args) {
        SavingsAccount2 acc1 = new SavingsAccount2("Alice", 1000);
        CurrentAccount2 acc2 = new CurrentAccount2("Bob", 2000);

        acc1.showAccountInfo();
        acc2.showAccountInfo();

        Bank2.interestRate = 6.5; // Change static variable (interest rate)

        System.out.println("\nAfter changing interest rate:");
        acc1.showAccountInfo();
        acc2.showAccountInfo();
    }
}