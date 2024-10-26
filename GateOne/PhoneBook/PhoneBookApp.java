public class PhoneBookApp{


	private String firstName;

	private String lastName;

	private String phoneNumber;	

	public PhoneBookApp(String firstName, String lastName, String phoneNumber){

		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNumber = phoneNumber;
		
	}

	public String getFirstName(){

		return firstName;
	}

	public String getPhoneNumber(){

		return phoneNumber;

	}

	public String getLastName(){

		return lastName;
	}

	public String getFullName(){

		return lastName + firstName;
	}
 
	public String editFirstName(String firstName){

		return this.firstName = firstName;

		
	}

	public String editLastName(String lastName){

		return this.lastName = lastName;

		
	}
	
	public void printContact(){
		
		
		System.out.printf("Full Name :    %-14s%n", lastName + " " + firstName);
		System.out.printf("Phone Number : %7s" , phoneNumber);
	}

	public void getContactDetails(){
	
		
		System.out.printf("%n%-26s", lastName + " " + firstName);
		System.out.printf("%26s", phoneNumber);		
	}


	public static void displayContactList(ArrayList<PhoneBookApp> contacts){
		
		System.out.printf("%10s\t\t\t\t%s", "Full Name","Phone Number");

		for (PhoneBookApp contact : contacts){

			contact.getContactDetails();

		}

	}

}