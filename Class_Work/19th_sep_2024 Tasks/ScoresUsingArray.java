import java.util.Scanner;
public class ScoresUsingArray{

	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);

		System.out.print("How many score you want to enter: ");
		int scoreCounter = receiver.nextInt();
	
		int[] scores = new int[scoreCounter];

		

		
		for(int count = 0; count < scores.length; count++){

			System.out.print("Enter score : ");
			scores[count] = receiver.nextInt();
		}
			
		 System.out.printf("%nThe scores are : ");
	
	 	int counter = 0;
		int max = scores[counter];
		int min = scores[counter];
		int totalScores = 0; 
		for(int number : scores){
			
			System.out.printf("%d ", number);
	
			if (scores[counter] > max) max = scores[counter];
			if (scores[counter] < min ) min = scores[counter];
			totalScores += number;	
			counter++;

		}
		 
		System.out.printf("%n%nThe largest score is : %d ", max);
		System.out.printf("%n%nThe lowest score is : %d ", min);

		double average = (double)totalScores / counter;
		System.out.printf("%n%nThe Average score is : %.2f ", average);
		
		
	}

}