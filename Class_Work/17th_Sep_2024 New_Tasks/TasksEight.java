import java.util.Scanner;
public class TasksEight{

	public static void main(String... eniola){

		Scanner receiver = new Scanner(System.in);
		
		int totalScores = 0;
		int scoreCount = 0;

		while(true){

			System.out.print("Enter Score : ");
			int scores = receiver.nextInt(); 
		
			if (scores > 0 && scores < 100){
				totalScores += scores;
				scoreCount++;

				if(scoreCount == 10) break;
			}		
		}
		 
	       System.out.printf("Total sum of even scores : %d%n", totalScores);				
		
	}



}