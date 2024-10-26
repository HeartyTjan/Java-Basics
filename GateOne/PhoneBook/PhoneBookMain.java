import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
public class PhoneBookMain{

	private static final ArrayList<PhoneBookApp> contacts = new ArrayList <PhoneBookApp>();
	Scanner receiver = new Scanner(System.in);
	private static int counter = 0;
	int choice = 1;

	public static void main(String...args){
	
		PhoneBookMain tester = new PhoneBookMain();
		tester.displayMenu();
		
	 }

	public void displayMenu(){

	   try{

		while(choice != 0){

			
			System.out.print("""

			         PhoneBook Menu
			===============================

			1 --> Create new contact
			2 --> Edit contact
			3 --> Remove contact
			4 --> Find contact by first name
			5 --> Find contact by last name
			6 --> Find contact by phone number
			7 --> display contacts
		       ==================================
		""");
		
		
			System.out.printf("%nEnter preferred option: ");
			int option = receiver.nextInt();

		

			switch (option){

				case 1 : addName();break;

				case 2 : editContact();break;

				case 3 : removeContact();break;
			
				case 4 : findContactByFirstName();break;
				
				case 5: findContactByLastName();break;

				case 6: findContactByPhoneNumber();break;

				case 7 :  PhoneBookApp.displayContactList(contacts);
					  System.out.printf("%nEnter 1 for mainMenu or 0 to quit :");
					  choice = receiver.nextInt();break;

				default : System.out.print("Enter a valid option");break;

			
			}
		}
	     }catch(InputMismatchException e){
			
			System.out.printf("%nInteger Value Expected");
			
	     }
	}
	
	
	public void addName(){
	
	  try{	
		System.out.print("""

			Add new name
			======================
		""");


		System.out.print("Enter first name: ");
		String firstName = receiver.next();

		System.out.print("Enter last name: ");
		String lastName = receiver.next();

		System.out.print("Enter Phone number: ");
		String phoneNumber = receiver.next();

		if(phoneNumber.length() == 11){
		
			if(phoneNumber.startsWith("080")||phoneNumber.startsWith("081")||phoneNumber.startsWith("091")
				||phoneNumber.startsWith("070")||phoneNumber.startsWith("090")){

				PhoneBookApp contact = new PhoneBookApp(firstName,lastName,phoneNumber);
	
				contacts.add(contact);
				displaySavePrompt();
				counter++;

			}else System.out.print("Invalid Phone Number");
			
		}
		else System.out.print("Phone Number must be 11 digit");
		
		System.out.printf("%n%nEnter 1 for mainMenu or 0 to quit :");
		choice = receiver.nextInt();

	   }catch(InputMismatchException e){
			
		System.out.print("Integer Value Expected");
			
	   }
		
	}

	public void editContact(){

             try{
	 	   System.out.print("""

			Edit contact
			======================
		  """);

		
		        for(int count = 0; count < counter; count++){
				
				System.out.printf("%n%nContact %d : %n ", count+1);
				contacts.get(count).printContact();
				
			}
			
			System.out.printf("%nEnter number you want to edit(eg 1 for contact 1): ");
			int userOption = receiver.nextInt();

			System.out.print("Enter first name: ");
			String firstName = receiver.next();

			System.out.print("Enter last name: ");
			String lastName = receiver.next();

			System.out.print("Enter Phone number: ");
			String phoneNumber = receiver.next();

			if(phoneNumber.length() == 11){
		
				if(phoneNumber.startsWith("080")||phoneNumber.startsWith("081")||phoneNumber.startsWith("091")
					||phoneNumber.startsWith("070")||phoneNumber.startsWith("090")){

					PhoneBookApp editedContact = new PhoneBookApp(firstName,lastName,phoneNumber);

					contacts.set(userOption-1, editedContact);
					displaySavePrompt();
				}else System.out.print("Invalid Phone Number");
			
			}
			else System.out.print("Phone Number must be 11 digit");


			System.out.printf("%nEnter 1 for mainMenu or 0 to quit :");
			choice = receiver.nextInt();
		
		}catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		}
						

	}
	
	public void removeContact(){
		
		try{
		     System.out.print("""

					Remove contact
				======================
			""");
			
			for(int count = 0; count < counter; count++){
			
				System.out.printf("%n%nContact %d : %n ", count+1);
				contacts.get(count).printContact();
			
			}
			System.out.printf("%nEnter number you want to edit(eg 1 for contact 1): ");
			int userOption = receiver.nextInt();

			contacts.remove(userOption-1);
			
			displaySavePrompt();	
			
			System.out.printf("%nEnter 1 for mainMenu or 0 to quit :");
			choice = receiver.nextInt();	
			
	       }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		}

	}

	public void findContactByFirstName(){

	    try{
		   System.out.print("""

				     Find Contact By First Name
				==================================
			""");
		   System.out.print("Enter first name: ");
		   String firstName = receiver.next();
		   System.out.println();
		
		   for (PhoneBookApp contact : contacts){

			
			if(contact.getFirstName().equals(firstName)){
					
				contact.printContact();			
			}
		   }

		   System.out.printf("%nEnter 1 for mainMenu or 0 to quit :");
		   choice = receiver.nextInt();
		}catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			Syst1em.out.print("Out of Bound");
		}

	}

	public void findContactByLastName(){

	    try{
		   System.out.print("""

				     Find Contact By Last Name
				==================================
			""");
		   System.out.print("Enter first name: ");
		   String lastName = receiver.next();
		   System.out.println();
		
		   for (PhoneBookApp contact : contacts){

			
			if(contact.getLastName().equals(lastName)){
					
				contact.printContact();			
			}
		   }

		   System.out.printf("%nEnter 1 for mainMenu or 0 to quit :");
		   choice = receiver.nextInt();
		}catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		}

	}

	public void findContactByPhoneNumber(){

	    try{
		   System.out.print("""

				     Find Contact By Phone Number
				=====================================
			""");
		   System.out.print("Enter first name: ");
		   String phoneNumber = receiver.next();
		   System.out.println();
		
		   for (PhoneBookApp contact : contacts){

			
			if(contact.getPhoneNumber().equals(phoneNumber)){
					
				contact.printContact();			
			}
		   }

		   System.out.printf("%nEnter 1 for mainMenu or 0 to quit :");
		   choice = receiver.nextInt();
		}catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		}

	}



	public void displaySavePrompt(){
		
			System.out.printf("%nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>%n");

			System.out.printf("%nSaved successfuly%n");	
			
	} 

}





