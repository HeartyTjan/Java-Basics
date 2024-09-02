import java.util.Scanner;

public class LargestNumberAndOccurrence2{

 	public static void main(String... args){
 		Scanner input = new Scanner(System.in);

		System.out.printf("Application to find the largest and number of occurrence%n%n");
	
		int largestNumber = 0;
		int occurrence = 0;
		

		for(int count = 1; count <= 7; count++){
 
			System.out.print("Enter a number: ");
			int userInput= input.nextInt();
 
			if(userInput > largestNumber){

				largestNumber = userInput;
				occurrence = 0;
			}
			if (userInput == largestNumber) occurrence++;
			
		}
			

		System.out.printf("The largest number is %d%n%n", largestNumber);
		System.out.printf("The Occurrence of the largest number is %d", occurrence);

	}

}