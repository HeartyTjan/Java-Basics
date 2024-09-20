import java.util.Scanner;
public class CoinTossingCounter{

	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);


		System.out.print("How many times to flip the coin: ");
		int flipTimes = receiver.nextInt();

		CoinTossing.numberOfTimesToFlipCoin(flipTimes);
	
		

	}












}