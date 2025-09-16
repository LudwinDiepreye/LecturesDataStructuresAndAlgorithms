package Task1;

public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double initialBalance) {
        this.owner = owner;
        this.balance = initialBalance;
    }

    public void deposit(double amount) { // Method to deposit the funds
        if (amount > 0) {
            balance = balance + amount;
            System.out.println("Deposited: " + amount + ". Actual Balance: " + balance);
        } else {
            System.out.println("The amount must be more than  0");
        }
    }

    public void withdraw(double amount) { // Method to withdraw the funds
        if (amount > 0) {
            if (balance >= amount) {
                balance = balance - amount;
                System.out.println("Withdrawn: " + amount + ". Actual Balance: " + balance);
            } else {
                System.out.println("Insufficient Funds!");
            }
        } else {
            System.out.println("The amount must be more than  0");
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Jack", 2500);

        account.deposit(1500);
        account.withdraw(3000);
        account.withdraw(1500);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
