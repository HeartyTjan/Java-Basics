import java.util.Random;
import java.util.Scanner;

public class RandomGuessesSecondVersion{
	
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
		int counter = 0;

		do {
			System.out.printf("%n%nGuess a number : ");
			userGuess = KeyboardInto.nextInt();
			counter++;
	
			//To display Random number during testing
			//System.out.print(randomNumber);
			
			if (userGuess > randomNumber) System.out.print("Try again, this is too high");
			if (userGuess < randomNumber) System.out.print("Try again, this is too low");

			if (userGuess == randomNumber) {

					if(counter < 10 && userGuess == randomNumber){
					
						System.out.println("Congratulations\nEither you know the secret or you got lucky");				
					}
		
					if (counter == 10 && userGuess == randomNumber){

						System.out.println("Congratulations\nAha ! You know the secret");
					}
					
					System.out.printf("%nEnter 1 to play again or 0 to quit :");
					userChoice = KeyboardInto.nextInt();
					
					if(userChoice == 1) randomNumber = generateRandomNumber();
					else System.out.printf("%nThank you for playing");

			}

			if (counter % 10 == 0){

				System.out.printf("%nYou should do better ! Why should it take you no more than 10 guess ");
			}
			

		} while (userChoice != 0);	

	}	


}