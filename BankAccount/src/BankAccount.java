//Linda LaMee
//Bank Account
//Professor Rodney Nelson
//CIS 208

class Bank_Account {
    String owner;
    double balance;

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        balance = balance - amount;
    }

    void displayBalance() {
        System.out.println(owner + " has $" + balance);
    }
}

public class BankAccount
{
    public static void main(String[] args) {
        Bank_Account account1 = new Bank_Account();

        account1.owner = "John";
        account1.balance = 500;

        account1.deposit(200);
        account1.withdraw(100);

        account1.displayBalance();
        
        Bank_Account account2 = new Bank_Account();
        account2.owner = "Jackie";
        account2.balance = 1500;

        account2.deposit(20);
        account2.withdraw(1000);

        account2.displayBalance();
        
       
    }
}
