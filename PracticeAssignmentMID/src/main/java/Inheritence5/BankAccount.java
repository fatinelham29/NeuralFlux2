
package Inheritence5;
public class BankAccount {
   double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    public void withdraw(double amount) {
        balance -= amount;
        System.out.println("Withdrew: $" + amount);
    }
    public void showBalance() {
        System.out.println("Current balance: $" + balance);
    }
}
