import java.util.Scanner;

public class CountPositiveAndNegative{

 	public static void main(String... args){
	Scanner input = new Scanner(System.in);
 
	System.out.printf("Application To Count Number of Positive, Negative and Zero.%n%n");
	
	int positive = 0;
 	int negative = 0;
 	int zero = 0;
 	int Choice = 0;

	while (Choice == 0) {
		System.out.print("Enter number : ");
 		int userInput = input.nextInt();

		if (userInput > 0) {positive+= 1;} 
		if (userInput < 0) {negative+= 1;} 
		if (userInput == 0) {zero = zero + 1;} 
	
		System.out.printf("%nEnter 1 to stop or 0 to continue : ");
		Choice = input.nextInt();} 

		System.out.printf("%nPositive count = %d%n", positive);
  		System.out.printf("%nNegative count = %d%n", negative);
  		System.out.printf("%nZero count = %d", zero);

    }	


}
