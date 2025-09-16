
package Inheritence5;
public class Main {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(500.0);

        account.showBalance();      
        account.deposit(200.0);     
        account.showBalance();      
        account.withdraw(550.0);    
        account.showBalance();      
        account.withdraw(100.0);    
        account.showBalance();      
    }
}
