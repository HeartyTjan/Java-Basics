import java.util.ArrayList;
public class Account{


	private String firstName;
	
	private String lastName;

	private String accountName;

	private String accountNumber;
		
	private double balance;

	private String pin;

	public Account(String firstName,String lastName,String accountNumber,String pin){

		this.firstName = firstName;
	
		this.lastName = lastName;

		this.accountNumber = accountNumber;
 
		this.pin = pin;
	}


	public String getAccountNumber(){

		return accountNumber;
	}

	public void deposit(double depositAmount){

		if(depositAmount > 0.0){

			this.balance += depositAmount;

		}else System.out.print("Enter a valid amount");

		
	}

	public void withdraw(double withdrawAmount ){

		if(withdrawAmount <= balance){

			balance -= withdrawAmount;

		}else System.out.print("Insufficient Funds");

		
	}

	public void transfer(double amount, String recipient){

		if(this.balance >= amount){
		
			this.balance -= amount;
			recipient.balance += amount;

		}else System.out.print("Insufficient Funds");
		
	
	}

	public String getAccountName(){

	     return lastName + " " + firstName;
	}

	public double getBalance(){

		return balance;
	}

	public String getPin(){

		return pin;
	}

	public String changePin(String newPin){

		this.pin = newPin;

		return pin;
	}

	public void displayAccountInfo(){

		String fullName = lastName + " " + firstName;
		System.out.printf("%n%-23s%20s",fullName, accountNumber);
	}

	public static void displayAccountListInfo(ArrayList<Account> accounts){
		System.out.printf("%s\t\t\t%s", "Account Name","Account Number");
		for(Account account : accounts){
			
			account.displayAccountInfo();

		}

		
	}

}
