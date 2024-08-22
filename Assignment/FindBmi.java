import java.util.Scanner;

public class FindBmi {

	public static void main (String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter Weight in Pounds: ");
		double weight = input.nextDouble();
		double oneKg = 0.45359237;
	
		System.out.print("Enter Height in inches: ");
		double height = input.nextDouble();
		double oneMeter = 0.0254;

		double convertedWeight = weight * oneKg;
		double convertedHeight = height * oneMeter; 
		double bmi = convertedWeight/convertedHeight * convertedHeight;

		System.out.printf("%nBMI is %.2f", bmi);

	}

}