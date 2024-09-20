import java.util.Scanner;
public class TasksFive{

	public static void main(String... eniola){

		Scanner receiver = new Scanner(System.in);
		
		int totalScores = 0;
		int scoreCount = 0;
		
		for(int count = 1; count <= 10; count++){
			System.out.print("Enter Score : ");
			int scores = receiver.nextInt(); 
		
			if (scores % 2 ==0)totalScores += scores;
			
			
		}
		 

		System.out.printf("Total sum of even scores : %d%n", totalScores);
		
	}



}