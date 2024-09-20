import java.util.Random;
import java.util.Scanner;

public class RandomGuessesVersion1{
	
	static Scanner KeyboardInto = new Scanner(System.in);
	static Random guess = new Random();

	public static int generateRandomNumber(){

		int randomNumber = guess.nextInt(1000);
		System.out.printf("%nI am generating random number for you");	
		return randomNumber;
	}

	public static void game(){

		int randomNumber = generateRandomNumber();
		int userGuess = 0;
		int userChoice = 1;

		do {
			System.out.printf("%n%nGuess a number : ");
			userGuess = KeyboardInto.nextInt();
			
			//To display Random number during testing
			//System.out.print(randomNumber);	
			
			if (userGuess > randomNumber) System.out.print("Try again, this is too high");
			if (userGuess < randomNumber) System.out.print("Try again, this is too low");

			if (userGuess == randomNumber) {
					
					System.out.println("Congratulations. You guessed the number");

					System.out.printf("%nEnter 1 to play again or 0 to quit :");
					userChoice = KeyboardInto.nextInt();
					
					if(userChoice == 1) randomNumber = generateRandomNumber();
					else System.out.printf("%nThank you for playing");

			}

		
			

		} while (userChoice != 0);	

	}	


}