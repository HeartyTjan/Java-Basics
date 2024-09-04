import java.util.Scanner;
public class BinaryNumber{

	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);

		System.out.print("Enter integer containing only 0s and 1s : " );
		int userInput = receiver.nextInt();

		int digit1 = userInput % 10;
		int digit2 = userInput / 10 % 10;
		int digit3 = userInput / 100 % 10; 
		int digit4 = userInput / 1000 % 10;	


		int binary = digit1 * 1 + digit2 * 2 + digit3 * 4 + digit4 * 8;
		
		System.out.printf("The decimal equivalent of binary %d : %d " , userInput, binary);


	}

}