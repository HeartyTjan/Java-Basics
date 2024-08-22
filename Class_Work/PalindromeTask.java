import java.util.Scanner;

public class PalindromeTask{

    public static void main(String... tijani){

        Scanner keyboardInto = new Scanner(System.in);
	
	System.out.printf("Application to check if user input is a palindrome%n");

	System.out.printf("%nEnter a three digit number : ");
	int number =  keyboardInto.nextInt();
	int originalNumber = number;

	int reverse = 0;

	while ( number != 0) {
	
	  reverse = reverse * 10 + number % 10;
	  number = number / 10; 
		
	}
		System.out.printf("%nThe reverse of user input : %d%n" , reverse);

		if (originalNumber == reverse) {

			System.out.printf("%nThe number is a Palindrome");		
		}
		else {
			
			System.out.printf("%nThe number is not a Palindrome");
	
		}
    
    }

}