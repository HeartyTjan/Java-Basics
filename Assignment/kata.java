import java.util.Scanner;
public class Kata{

	public static Scanner receiver = new Scanner(System.in);
	public static int userInput;

	public static void main (String... args){
	
		displayCalculationMenu();				
	}

	public static void displayCalculationMenu(){

		System.out.print("""

					Calculation Menu
			...............................................

				1 --> To check for even number
				2 --> To check for prime number
				3 --> For subtraction 
				4 --> For division
				5 --> To Check for factors of number
				6 --> To Check for perfect square
				7 --> To Check for palindrome
				8 --> To calculate factorial of Number
				9 --> To calculate square of a number

			.................................................	
			"""
		);
		
		System.out.print("Enter preferred option : ");
		int option = receiver.nextInt();

		switch(option) {

			case 1 :   System.out.print("""
					
				       Check For Even Number
				    ------------------------>
				    Enter a number :  """);
	
				  userInput = receiver.nextInt();
				  calculateEvenNumber(userInput);break;


			case 2 :   System.out.print("""
					
				     Check For prime Number
				   ------------------------>
				   Enter a number :  """);

				  userInput = receiver.nextInt();
				  calculatePrimeNumber(userInput);break;
		
			case 3 :   System.out.print("""
					
				         Subtraction
				    ------------------------>
				    Enter first number :  """);
				 
				  int firstNumber = receiver.nextInt();
				  System.out.print("Enter Second number :");
				  int secondNumber = receiver.nextInt();
				  int result = subtractionCalculation(firstNumber, secondNumber);
				  System.out.print("The result is : " + result);break;
	
			case 4 :   System.out.print("""
					
				           Division
				    ------------------------>
				    Enter first number : """);
				 
				  float numerator = receiver.nextInt();
				  System.out.print("Enter Second number : ");
				  float divider = receiver.nextInt();
				  System.out.print("The result is : " + divisionCalculation(numerator, divider));break;
			
			case 5 :  System.out.print("""
					
				    	Check For Factors of Number
				      ------------------------------>
				      Enter a number :  """);

				  userInput = receiver.nextInt();
				 System.out.print("The result is : " + calculateFactorOfNumber(userInput));break;
	
			case 6 :   System.out.print("""
					
				    	Check For Perfect Square
				      ------------------------------>
				      Enter a number :  """);

				    userInput = receiver.nextInt();
				   findSquareOfNumber(userInput);break;

			case 7 :    System.out.print("""
					
				    	Check For Palindrome
				     ------------------------------>
				     Enter 5 digit number :  """);

				   userInput = receiver.nextInt();
				   findPalindrome(userInput);break;
					
			case 8 :   System.out.print("""
					
				      Calculate Factorial Of Number 
				    --------------------------------->
				     Enter a number :  """);

				   userInput = receiver.nextInt();
				   System.out.print("The result is : " + calculateFactorialOfNumber(userInput));break;

			case 9 :  System.out.print("""
					
				      Calculate Square Of Number 
				    --------------------------------->
				     Enter a number :  """);

				   userInput = receiver.nextInt();
				 System.out.print("The result is : " + calculateSquareOfNumber(userInput)); break;

		}
		
			
	
	}

	public static int calculateEvenNumber(int number){

		if (number % 2 == 0) System.out.printf("Is %d a even number ? : true", number);

		else System.out.printf("Is %d a even number ? : false", number);

		
		return number;
	}

	public static int calculatePrimeNumber(int number){
	
		int factors = 0;

		for(int count = 1; count <= number; count++){

			
			if (number % count == 0){
				
				factors++;
			}	
	
		}

		if (factors == 2) System.out.printf("Is %d a prime number ? : true", number);
		else System.out.printf("Is %d a prime number ? : false", number);

		return factors;
	}

	public static int subtractionCalculation(int number1, int number2){
	
		int subtractionValue = Math.abs(number1 - number2);
	
		return subtractionValue;		
	
	}


	public static float divisionCalculation(float numerator, float divider){
	
		float divisionValue = numerator / divider;
	
		return divisionValue;		
	
	
	}
	
	public static int calculateFactorOfNumber(int number){
		
		int factors = 0;

		for(int count = 1; count <= number; count++){

			if(number % count == 0) factors++;

		}

		return factors;
	}
	
	public static int findSquareOfNumber(int number){

		int squareRoot = (int) Math.sqrt(number);

		if (Math.pow(squareRoot, 2) == number) System.out.print("It is true");
		else System.out.print("It is false");

		return squareRoot;
		
		
	}
	
	public static int findPalindrome(int number){
		
		number = 0;
		int originalNumber = number;

		int reverse = 0;

		while (number != 0){
			
			reverse = reverse * 10 + number % 10;
			number = number / 10;

		}

		if (originalNumber == reverse) System.out.print("This is a palindrome :" + " True");
		else System.out.print("This is not a palindrome :" + " false");

		return originalNumber;
	}

	public static int calculateFactorialOfNumber(int number){

		int factorial = 1;

		for (int count = number;  count >= 1; count-- ){

			factorial = factorial * count;
		}

		return factorial;
	}
	
	public static int calculateSquareOfNumber(int number){

		int numberSquare = number * number;

		return numberSquare;

	}

}