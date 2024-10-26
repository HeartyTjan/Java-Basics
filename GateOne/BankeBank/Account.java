import java.util.ArrayList;
public class Account{


	private String firstName;
	
	private String lastName;

	private String accountName;

	private String accountNumber;
		
	private double balance;

	private String pin;

	private boolean accountStatus;

	public Account(String firstName,String lastName,String accountNumber,String pin){

		this.firstName = firstName;
	
		this.lastName = lastName;

		this.accountNumber = accountNumber;
 
		this.pin = pin;
		
		accountStatus = true;
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

	public String getAccountName(){

	     return lastName + " " + firstName;
	}

	public String getLastName(){

	     return lastName;
	}

	public double getBalance(){

		return balance;
	}

	public String getPin(){

		return pin;
	}

	public void changePin(String newPin){

		this.pin = newPin;

	}

	public boolean checkAccountStatus(){

		return accountStatus;
	}

	public boolean closeAccount(){

		if(this.balance <= 0 && this.accountStatus == true){

			accountStatus = false;
		}

		return accountStatus;

	}



	public void displayAccountInfo(){

		String status = "";
		if(accountStatus){

		    status = "Open";

		}else status = "Closed";

		String fullName = lastName + " " + firstName;
		System.out.printf("%n%-23s%12s%11s",fullName, accountNumber, status);
	}

	public static void displayAccountListInfo(ArrayList<Account> accounts){

		System.out.printf("%s\t\t%s\t%s", "Account Name","Account Number", "Status");
		for(Account account : accounts){
			
			account.displayAccountInfo();

		}

		
	}

}
