import java.util.Scanner;
public class RightAngleTriangle{


	public static void main(String... args){
	
		Scanner receiver = new Scanner(System.in);
		System.out.print("Enter your triangle size: ");
		int size = receiver.nextInt();
		
		printNumberOfTriangleSize(size);
		

	
	}

	public static void printNumberOfTriangleSize(int number){

		for (int count =1; count < number; count++){

			
			for (int secondCount = 1; secondCount <= count; secondCount++){
			
				System.out.print("*");	
		
			}
			System.out.println();	
		}
	}

}