package utilityDemoTest.staticAndNonStaticTest;

class Bank3 {
    static double interestRate = 5.0; // shared across all accounts
    double balance;

    Bank3(double balance) {
        this.balance = balance;
    }

    // Method to calculate interest (overridden in subclasses)
    double calculateInterest() {
        return balance * interestRate / 100;
    }
}

class SavingsAccount3 extends Bank3 {
    SavingsAccount3(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        // Savings accounts get +1% bonus
        return balance * (interestRate + 1) / 100;
    }
}

class CurrentAccount3 extends Bank3 {
    CurrentAccount3(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        // Current accounts earn no interest
        return 0;
    }
}

class FixedDepositAccount extends Bank3 {
    FixedDepositAccount(double balance) {
        super(balance);
    }

    @Override
    double calculateInterest() {
        // Fixed deposits earn double interest
        return balance * (interestRate * 2) / 100;
    }
}

public class RealWorldExampleWithPolymorpism{
    public static void main(String[] args) {
        // Parent class reference pointing to different child objects
        Bank3 acc1 = new SavingsAccount3(1000);
        Bank3 acc2 = new CurrentAccount3(2000);
        Bank3 acc3 = new FixedDepositAccount(5000);

        // Polymorphism: same method call, different behavior
        System.out.println("Savings Account Interest: " + acc1.calculateInterest());
        System.out.println("Current Account Interest: " + acc2.calculateInterest());
        System.out.println("Fixed Deposit Interest: " + acc3.calculateInterest());

        // Change static variable (interest rate)
        Bank3.interestRate = 6.5;

        System.out.println("\nAfter changing interest rate:");
        System.out.println("Savings Account Interest: " + acc1.calculateInterest());
        System.out.println("Current Account Interest: " + acc2.calculateInterest());
        System.out.println("Fixed Deposit Interest: " + acc3.calculateInterest());
    }
}
