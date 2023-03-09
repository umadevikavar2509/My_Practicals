package corejava;

public class MainBank 
{
	public static void main(String[] args) {
        BankAccount myAccount = new BankAccount(20000, "98769876543267");

        System.out.println("Account Number: " + myAccount.getAccountNumber());
        System.out.println("Balance:" + myAccount.getBalance()+" Rs.");

        myAccount.deposit(600);
        myAccount.withdraw(400);

        System.out.println("Balance:" + myAccount.getBalance()+" Rs.");
    }
}
