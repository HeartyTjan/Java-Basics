import java.util.Scanner;

public class CheckEvenOrOdd {

    public static void main (String... tijani) {

        Scanner input = new Scanner(System.in);
	
	System.out.printf("Application to check for Even or Odd number.%n%n");

	System.out.print("Enter an integer : ");
	int number = input.nextInt();
	int originalNumber = number;

	if ( number % 2 == 0){

		System.out.printf("%n%d is an Even number", number);
        }
	else { 
		System.out.printf("%n%d is an Odd number", number);
	}

    }

}