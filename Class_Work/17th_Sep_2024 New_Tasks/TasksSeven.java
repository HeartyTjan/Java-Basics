import java.util.Scanner;
public class TasksSeven{

	public static void main(String... eniola){

		Scanner receiver = new Scanner(System.in);
		
		int totalScores = 0;
		int scoreCount = 0;
		
		for(int count = 1; count <= 10; count++){
			System.out.print("Enter Score : ");
			int scores = receiver.nextInt(); 
		
			if (scores % 2 ==0){
				totalScores += scores;
				scoreCount++;
			}
			
		}
		 
		double average = (double)totalScores / scoreCount;
		
		System.out.printf("Total sum of even scores : %d%n", totalScores);
		System.out.printf("Average of scores is : %.2f", average);
		
	}



}