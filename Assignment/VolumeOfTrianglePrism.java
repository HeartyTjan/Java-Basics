import java.util.Scanner;

public class VolumeOfTrianglePrism{

	public static void main (String [] args){

		Scanner input = new Scanner(System.in);

		System.out.print("Enter length of sides: ");
		double length = input.nextDouble();

		System.out.print("Enter value for height : ");
		double height = input.nextDouble();

		double lengthSquare = length * length;

		double area = 1.73 * (lengthSquare / 4);

		double volume = area * height;

		System.out.printf("The area is : %.2f%n", area);

		System.out.printf("The volume of triangle prism is : %.2f", volume);


	}

}