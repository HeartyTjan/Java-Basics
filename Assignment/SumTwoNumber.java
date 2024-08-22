import java.util.Scanner;

public class SumTwoNumber{

	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);

		System.out.printf("Application to request two numbers and sum them till user stops%n%n");
		
		int choice = 0;
	
		do {
			System.out.print("Enter first numbers : ");
			int firstNumber = input.nextInt();

			System.out.printf("Enter second numbers : ");
			int secondNumber = input.nextInt();
		
			int total = firstNumber + secondNumber;
		
			System.out.printf("%nThe sum of two inputed numbers is : %d%n", total);

			System.out.printf("%nEnter 1 to stop and 0 to continue : ");
			choice = input.nextInt();

		}

	 	while (choice == 0);
	
    	}

}
 