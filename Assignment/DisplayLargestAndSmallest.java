import java.util.Scanner;

public class DisplayLargestAndSmallest{

 	public static void main(String... args){
 		Scanner input = new Scanner(System.in);

		System.out.printf("Application to find the largest and smallest number%n%n");
	
		int largestNumber = 0;
		int smallestNumber = Integer.MAX_VALUE;
		int choice = 0;

		while( choice == 0){
 
			System.out.print("Enter a number: ");
			int userInput= input.nextInt();
 
			if(userInput > largestNumber){

				largestNumber = userInput;
			}

			if(userInput < smallestNumber){

				smallestNumber = userInput;
			}

		System.out.printf("%nEnter 1 to stop or 0 to continue : ");
		choice = input.nextInt();

		}
			
		System.out.printf("%nResult of the search%n%n");

		System.out.printf("The largest number is %d%n%n", largestNumber);

		System.out.println("The smallest number is " + smallestNumber);

	}

}