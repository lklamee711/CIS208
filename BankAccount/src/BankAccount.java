//Linda LaMee
//Bank Account
//Professor Rodney Nelson
//CIS 208

class Bank_Account {
    String owner;
    int number;
    double balance;
    
    Bank_Account(String ownerName, int accountNumber, double startingBalance)
    {
    	owner=ownerName;
    	number=accountNumber;
    	balance=startingBalance;
    }
    void deposit(double amount) {
        balance = balance + amount;
    }
    void withdraw(double amount) {
        if (amount<balance)
        		balance = balance - amount;
    		else
    			System.out.println("Insufficient funds");
    }
    void displayBalance() {
        System.out.println(owner + " has $" + balance);
    }
    void displayAccountInfo() {
    	 	System.out.println();  	
        System.out.println("Owner: "+ owner);
        System.out.println("Account number: "+ number);   
        System.out.println("Balance: "+ balance);          
    }
    void transfer(Bank_Account otherAccount, double money) {
        if (balance < money)   
    		System.out.println("Insufficient funds");
        else  
        {
        withdraw(money);
        otherAccount.deposit(money);
        }       
    } 
    
}
public class BankAccount
{
    public static void main(String[] args) {


    		Bank_Account account1= new Bank_Account ("John", 1,500);
        account1.deposit(200);
        account1.displayBalance();      
        account1.withdraw(100);
        account1.displayBalance();
        
		Bank_Account account2= new Bank_Account ("Jackie", 2,1500);
        account2.deposit(20);
        account2.displayBalance(); 
        account2.withdraw(1000);
        account2.displayBalance();
        
        account1.transfer(account2, 10.0);
        account1.displayBalance();        
        account2.displayBalance(); 
        account1.displayAccountInfo();
        account2.displayAccountInfo();       
        
    }
}
