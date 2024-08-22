import java.util.Scanner;

public class DivisibleByThree{

	public static void main (String [] args){

		Scanner input = new Scanner(System.in);

		System.out.printf("App to check if number inputed is divisible by 3%n%n");

		System.out.print("Enter a number : ");
		int userInput = input.nextInt();

		System.out.printf("%n");

		int firstUnit = userInput / 100; 
		int secondUnit = userInput / 10 % 10;
		int thirdUnit = userInput % 10;


		int total = (firstUnit + secondUnit + thirdUnit) % 3;

		if (total == 0){

		System.out.print("The number is divisible by 3");
	
		}

		if (total > 0){

		System.out.print("The number is not divisible by 3");
		}
	}

}

	
