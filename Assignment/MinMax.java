import java.util.Scanner;

public class MinMax{

	public static void main (String [] args){

		Scanner input = new Scanner(System.in);
	
		System.out.printf("Application to find the largest and smallest number%n%n");


		System.out.print("Enter first number: ");
		int firstNumber = input.nextInt();

		System.out.print("Enter second number: ");
		int secondNumber = input.nextInt();

		System.out.print("Enter third number: ");
		int thirdNumber = input.nextInt();

		System.out.print("Enter fourth number: ");
		int fourthNumber = input.nextInt();

		System.out.print("Enter fifth number: ");
		int fifthNumber = input.nextInt();

		int largest = 0;
	
		if(firstNumber > secondNumber){largest = firstNumber;}

		else {largest = secondNumber;}

		if (thirdNumber > largest){ largest = thirdNumber;}
		if (fourthNumber > largest){largest = fourthNumber;}
	
		if (fifthNumber > largest){largest = fifthNumber;}

		int smallest = 0;

		if(firstNumber < secondNumber){smallest = firstNumber;}
		else {smallest = secondNumber;}

		if (thirdNumber < smallest){ smallest = thirdNumber;}

		if (fourthNumber < smallest){smallest = fourthNumber;}
	
		if (fifthNumber < smallest){smallest = fifthNumber;}

		
		System.out.printf("%nResult of the search%n%n");
		System.out.println("The largest interger is " + largest);
		System.out.println("The smallest interger is " + smallest);
	}

}