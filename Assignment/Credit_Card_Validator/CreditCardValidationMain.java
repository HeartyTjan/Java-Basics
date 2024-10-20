import java.util.Scanner;
public class CreditCardValidationMain{

	
	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);
	
		System.out.print("Hello, Kindly Enter Card details to verify\nEnter details : ");
		String creditCardNumbers = receiver.nextLine();
		
		CreditCardValidation tester = new CreditCardValidation();
		
		tester.displayInfo(creditCardNumbers);
		
		
	}

}