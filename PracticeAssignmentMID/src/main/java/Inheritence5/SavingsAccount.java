
package Inheritence5;
public class SavingsAccount extends BankAccount {
    public SavingsAccount(double balance) {
        super(balance);
    }
    @Override
    public void withdraw(double amount) {
        if (balance - amount < 100) {
            System.out.println("Withdrawal denied: Balance cannot fall below $100");
        } else {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        }
    }
}
