import java.util.Scanner;

public class RandonNumber {

	public static void main (String... args){

  		Scanner input = new Scanner(System.in);

 		System.out.printf("Application to compare UserInput to generated random numbers%n%n");

  		boolean choice = false;	
  
  		while (!choice){  

  			System.out.print("Enter a number : ");
  			int userInput = input.nextInt();

  			int randomNumber1 = (int)(Math.random() * 101);
  			int randomNumber2 = (int)(Math.random() * 101);
  			int randomNumber3 = (int)(Math.random() * 101);
  			int randomNumber4 = (int)(Math.random() * 101);
  			int randomNumber5 = (int)(Math.random() * 101);

  			int generatedRandomNumber = (randomNumber1 + randomNumber2 + randomNumber3) + (randomNumber4 * randomNumber5)/100;

  			System.out.printf("Generated Random Number = %d%n", generatedRandomNumber);

  			if (userInput > generatedRandomNumber){ System.out.printf("Your guess is too high, try again%n%n");} 
  			if (userInput < generatedRandomNumber){ System.out.printf("Your guess is too low, try again%n%n");} 
  			if (userInput == generatedRandomNumber){ System.out.print("Congratulation, you guessed correctly"); choice = true;} 
		}
	
   	}

}