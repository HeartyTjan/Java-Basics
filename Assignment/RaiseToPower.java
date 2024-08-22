import java.util.Scanner;

public class RaiseToPower {

	public static void main (String [] args) {

		Scanner input = new Scanner(System.in);

		System.out.printf("Application to calculate the value of first number raised to power of second number%n%n");

		System.out.print("Enter first numbers : ");
		int baseNumber= input.nextInt();

		System.out.printf("Enter second numbers : ");
		int powerNumber = input.nextInt();

		int raisePowerValue = 1;

		while (powerNumber != 0){

			raisePowerValue = raisePowerValue * baseNumber;
			powerNumber--; 
		
		}
	
		System.out.printf("%nThe result is %d", raisePowerValue);
	
	  }

}