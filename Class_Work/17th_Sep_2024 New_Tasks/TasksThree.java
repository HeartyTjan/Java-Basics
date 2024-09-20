import java.util.Scanner;
public class TasksThree{

	public static void main(String... eniola){

		Scanner receiver = new Scanner(System.in);
		
		int totalScores = 0;
		int scoreCount = 0;
		
		for(int count = 1; count <= 10; count++){
			System.out.print("Enter Score : ");
			int scores = receiver.nextInt(); 
			
			totalScores += scores;
			scoreCount++;
		}

		double average = totalScores / scoreCount;
		System.out.printf("Total scores is : %d%n", totalScores);
		System.out.printf("Average of scores is : %.2f", average);

	}



}