import java.util.Scanner;
public class FactorsOrPrimeOfNumber {
	
	public static void main (String... args) {
	
		Scanner KeyboardInto = new Scanner(System.in);

		int userChoice;
		displayMainMenu();

		System.out.printf("%nEnter preferred option: ");
		userChoice = KeyboardInto.nextInt();

		switch(userChoice){

			case 1 : System.out.println("Calculate factor of a number");
				 System.out.printf("%nEnter a number: ");
			         int number = KeyboardInto.nextInt();
				 printFactorsOfNumber(number); break;

			case 2 : System.out.println("Check for prime number");
				 System.out.printf("%nEnter a number: ");
			         number = KeyboardInto.nextInt();
				 printPrimeNumber(number); break;

			case 3 : break;

		}
		
	}
		
	public static void displayMainMenu(){

			   System.out.printf("%9sPerform a task%n", " ");
			   System.out.println(".........................................");
			   System.out.println("1 --> To calculate factors of number");
			   System.out.println("2 --> To check for prime number ");
			   System.out.println("3 --> Quit");
			
	}


	public static int calculatefactor(int integer){

		int factors = 0;

		for(int count = 1; count <= integer; count++){

			
			if (integer % count == 0){
				
				factors++;
			}	
			
		}
		return factors;
	}


	public static void printPrimeNumber(int mynumber){

		mynumber = calculatefactor(mynumber);
		
		if (mynumber == 2) 
	
			System.out.printf("This is a prime number");

		else System.out.printf("This is not a prime number");


	}
	
	
	public static void printFactorsOfNumber(int mynumber){

		mynumber = calculatefactor(mynumber);
	
		System.out.printf("This has %d factors%n", mynumber);

	}

}