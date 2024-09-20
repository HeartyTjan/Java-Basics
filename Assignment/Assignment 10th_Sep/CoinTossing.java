import java.util.Random;
public class CoinTossing{

	static int headCount = 0;
	static int tailCount = 0;
	//public static void main(String... args){

		//flipCoin();
	
		

	//}

	public static void flipCoin(){

		Random guess = new Random();
		
		

		int coin = guess.nextInt(2);

		if(coin == 1){

			 System.out.println("Count toss : Head");
			 headCount++;
			 System.out.println();
		}
		else {

			 System.out.println("Count toss : Tail");
			 tailCount++;
			  System.out.println();
		}
		
	}

	public static void displayTossCoinMenu(){

	  java.util.Scanner receiver = new java.util.Scanner(System.in);
		System.out.print("""

				Toss Menu
			===========================
		
			   1 --> Toss coin
			 
			===========================
			"""
		);	
		System.out.print("Pick a preffered option : ");
		int coinFlip = receiver.nextInt();
		
			switch (coinFlip) {

				case 1 : flipCoin();break;

				
		
			}
		
	}	
	
	public static void numberOfTimesToFlipCoin(int userInput){

		for(int count = 1; count <= userInput; count++){
	
			displayTossCoinMenu();
			
		}
	
		System.out.printf("%nHead count is %d\nTail count is %d ", headCount,tailCount);

		
	}
	
}