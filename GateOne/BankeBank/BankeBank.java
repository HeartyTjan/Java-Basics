import java.util.UUID;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class BankeBank{

	private static ArrayList<Account> accounts = new ArrayList<Account>();
	static Scanner receiver = new Scanner(System.in);
	static int choice = 1;

	public static void main(String...args){

		BankeBank bank = new BankeBank();

		bank.displayMenu();		

	}

	public void displayMenu(){

	   try{

		while(choice != 0){

			
			System.out.print("""

			         Banke Bank Menu
			===============================

			1 --> Open account 
			2 --> Deposit money
			3 --> Withdraw Money
			4 --> Check account balance
			5 --> Transfer 
			6 --> Pin Modification
			7 --> Close account
			8 --> display
		       ==================================
		""");
		
		
			System.out.printf("%nEnter preferred option: ");
			int option = receiver.nextInt();

		

			switch (option){

				case 1 : createAccount();break;
				
				case 2 : deposit();break;
				
				case 3 : withdraw();break;
			
				case 4 : checkBalance();break;
				
				case 5: transfer() ;break;

				//case 6: findContactByPhoneNumber();break;
				
				case 7 :  Account.displayAccountListInfo(accounts);
					  System.out.printf("%nEnter 1 for mainMenu or 0 to quit :");
					  choice = receiver.nextInt();break;

				default : System.out.print("Enter a valid option");break;
				
			
			}
		}
	     }catch(InputMismatchException e){
			
			System.out.printf("%nInteger Value Expected");
			
	     }
	}

	public void createAccount(){

		System.out.print("""

			    Open Account
			======================
		  """);


	
            try{		
		   System.out.print("Enter your first name: ");
		   String firstName= receiver.next();

		   System.out.print("Enter your last name: ");
		   String lastName = receiver.next();

		   System.out.print("Enter your preferred pin(must be four digit): ");
		   String pin = receiver.next(); 

		   if(pin.length() == 4){
					
			SecureRandom random = new SecureRandom();
		
			String prefix = "BB";
			String accountNumber = prefix + Integer.toString(random.nextInt(100000000));
		
			Account account = new Account(firstName,lastName,accountNumber, pin);

			accounts.add(account);

			displaySavePrompt();

		   }else System.out.print("Pin must be four digit");
	
		   System.out.printf("%n%nEnter 1 for mainMenu or 0 to quit :");
		   choice = receiver.nextInt();

	     }catch(InputMismatchException e){
			
		 System.out.print("Integer Value Expected");
			
	     }
	}

	public void deposit(){
			
		System.out.print("""

			      Deposit Menu
				Login
			======================
		  """);
		
	        try{
		
		      System.out.print("Enter account number : ");
		      String accountNumber = receiver.next();

		      System.out.print("Enter your pin :");
		      String pin = receiver.next();
	
		      for(Account account : accounts){

			   if(account.getAccountNumber().equals(accountNumber)){

				if(account.getPin().equals(pin)){

					System.out.printf("%n%n%10s %s", "Welcome", account.getAccountName());
					System.out.printf("%n===================================%n");

					System.out.print("Enter amount to deposit: ");
					double amount = receiver.nextDouble();

					account.deposit(amount);

					displaySavePrompt();

				}else System.out.print("Incorrect account or pin");		
		
			   }else System.out.print("Incorrect account or pin");

		       }		
			    System.out.printf("%n%nEnter 1 for mainMenu or 0 to quit :");
		            choice = receiver.nextInt();
		
	          }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		  }catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		  }

	}
	
	public void withdraw(){
    
               System.out.print("""

			    Withdrawal Menu
				Login
			======================
		  """);
		
	        try{
		
		      System.out.print("Enter account number : ");
		      String accountNumber = receiver.next();

		      System.out.print("Enter your pin :");
		      String pin = receiver.next();
	
		      for(Account account : accounts){

			   if(account.getAccountNumber().equals(accountNumber)){

				if(account.getPin().equals(pin)){

					System.out.printf("%n%n%10s %s", "Welcome", account.getAccountName());
					System.out.printf("%n===================================%n");

					System.out.print("Enter amount to withdraw: ");
					double amount = receiver.nextDouble();

					account.withdraw(amount);

					displaySavePrompt();

				}else System.out.print("Incorrect account or pin");		
		
			   }else System.out.print("Incorrect account or pin");

		       }		
			    System.out.printf("%n%nEnter 1 for mainMenu or 0 to quit :");
		            choice = receiver.nextInt();
		
	          }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		  }catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		  }

	

	}



	public void checkBalance(){
		
			System.out.print("""

			      Balance Menu
				 Login
			======================
		      """);

		try{

		      System.out.print("Enter account number : ");
		      String accountNumber = receiver.next();

		      System.out.print("Enter your pin :");
		      String pin = receiver.next();
	
		      for(Account account : accounts){

			   if(account.getAccountNumber().equals(accountNumber)){

				if(account.getPin().equals(pin)){

					System.out.printf("%n%n%10s %s", "Welcome", account.getAccountName());
					System.out.printf("%n===================================%n");

					System.out.printf("Your balance is : %,.2f", account.getBalance());
					
				}else System.out.print("Incorrect account or pin");		
		
			   }else System.out.print("Incorrect account or pin");

		       }		
			    System.out.printf("%n%nEnter 1 for mainMenu or 0 to quit :");
		            choice = receiver.nextInt();
			
	       }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		}



	}

	public void transfer(){
    
               System.out.print("""

			    Transfer Menu
				Login
			======================
		  """);
		
	        try{
		
		     if(accounts.size() > 2){

		           System.out.print("Enter account number : ");
		           String accountNumber = receiver.next();

		           System.out.print("Enter your pin :");
		           String pin = receiver.next();
	
		           for(Account account : accounts){

			        if(account.getAccountNumber().equals(accountNumber)){

				     if(account.getPin().equals(pin)){

					  System.out.printf("%n%n%10s %s", "Welcome", account.getAccountName());
					  System.out.printf("%n===================================%n");

					  System.out.print("Enter recipient account: ");
					  String recipientAccount = receiver.next();

					  System.out.print("Enter amount to transfer: ");
					  double amount = receiver.nextDouble();

					  account.withdraw(amount);

					  if(account.getAccountNumber().equals(recipientAccount)){

						account.deposit(amount);
					  }
				     
				  
					    displaySavePrompt();

				      }else System.out.print("Incorrect account or pin");		
		
			        }else System.out.print("Incorrect account or pin");

		            }		
			    System.out.printf("%n%nEnter 1 for mainMenu or 0 to quit :");
		            choice = receiver.nextInt();

			}else System.out.print("Cannot make Transfer");

	          }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		  }catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		  }	

	}

	public void changeUserPin(){
	
              System.out.print("""

			    Pin Modification 
			    Change Pin Login
			 ======================
		      """);

		try{

		       System.out.print("Enter account number : ");
		       String accountNumber = receiver.next();

		       System.out.print("Enter your pin :");
		       String pin = receiver.next();
	
		       for(Account account : accounts){

			   if(account.getAccountNumber().equals(accountNumber)){

				if(account.getPin().equals(pin)){

					System.out.printf("%n%n%10s %s", "Welcome", account.getAccountName());
					System.out.printf("%n===================================%n");

					System.out.print("Enter a new four digit pin");
					String newPin = receiver.next();

					account.changePin(newPin); 
					
					displaySavePrompt();

				}else System.out.print("Incorrect account or pin");		
		
			   }else System.out.print("Incorrect account or pin");

		       }		
			    System.out.printf("%n%nEnter 1 for mainMenu or 0 to quit :");
		            choice = receiver.nextInt();
			
	        }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		}	

	}

	public void  checkPin(){

		 System.out.print("""

			    Pin modification 
			    Check Pin Login
			  ======================
		      """);

		try{

		       System.out.print("Enter account number : ");
		       String accountNumber = receiver.next();

		       System.out.print("Enter your pin :");
		       String pin = receiver.next();
	
		       for(Account account : accounts){

			   if(account.getAccountNumber().equals(accountNumber)){

				if(account.getPin().equals(pin)){

					System.out.printf("%n%n%10s %s", "Welcome", account.getAccountName());
					System.out.printf("%n===================================%n");

					System.out.printf("Your new Pin is : %s", account.getPin());

				}else System.out.print("Incorrect account or pin");		
		
			   }else System.out.print("Incorrect account or pin");

		       }		
			    System.out.printf("%n%nEnter 1 for mainMenu or 0 to quit :");
		            choice = receiver.nextInt();
			
	        }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		}	

	}



	



	public void displaySavePrompt(){
		
			System.out.printf("%nprocessing >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>%n");

			System.out.printf("%nsuccessfull%n");	
			
	} 


}