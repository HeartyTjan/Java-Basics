import java.util.Scanner;
public class MethodDeclaration{


	public static int reverse(int number){

		int reverse = 0;

		while(number != 0){

			reverse = reverse * 10 + number % 10;
			number = number / 10;

		}
		
		System.out.println("The reverse is : " + reverse);
		return number;

	}
	
	public static boolean isPalindrome(int number){

		int original_number = number;

		int reverse = 0;

		while(number != 0){

			reverse = reverse * 10 + number % 10;
			number = number / 10;

		}

		return original_number == reverse ? true : false;	
	}
	public static void displaySortedNumber1(int num1,int num2,int num3){
		int sum = num1 + num2 + num3;

		int highest = Math.max(num1,Math.max(num2,num3));
		int small = Math.min(num1, Math.min(num2,num3));
		int high = sum - highest - small;

		System.out.println("Number in decreasing order");
		System.out.printf("%d \n%d \n%d",highest, high ,small);
	}
	
	public static void displaySortedNumber(int num1,int num2,int num3){
		
		int sum = num1 + num2 + num3;

		int highest = num1;
		int smallest = num1;
	
		if (num2 > num1) highest = num2;
		if (num3 > highest) highest = num3;
		
		
		if (num2 < num1) smallest = num2;
		if (num3 < smallest) smallest = num3;

		int high = sum - highest - smallest;

		System.out.printf("%d \n%d \n%d",highest, high ,smallest);
		

	}

	public static void isReverse(int number){

		int reverse = 0;

		while(number != 0){

			reverse = reverse * 10 + number % 10;
			number = number / 10;

		}
		
		System.out.println("The reverse is : " + reverse);

	}

	public static double mileToKilometer(double mile){
		
		mile = mile * 1.609;
		
		System.out.print(mile);

		return mile;
	}

	public static double kiloMeterToMile(double kiloMeter){
		
		kiloMeter = kiloMeter / 1.609;
		
		System.out.printf("%.3f" ,kiloMeter);

		return kiloMeter;
	}

	public static void displayPattern(int number){
		
		for(int count =1; count <= number; count++){
		
			for(int space = 1; space <= 3 - count; space++){

				System.out.print("  ");
			}

			for (int column = 1; column <= count; column++){
				
				System.out.print(column + " ");
				
			}
			System.out.println();

		}	
	}

	public static int isPrime(int number){
		
		int factor = 0;
		int count = 0;
		for (count = 1; count <= number; count++){

			if(number % count ==0)factor++;

		}

		if(factor != 2)System.out.print("Not a prime number");
		else System.out.print("It is a prime number");

		return number;
	}

	public static int countLetters(String letters){

		int length = letters.length();
		System.out.print("The total count is : " + length);
		
		return length;
	}
	
}