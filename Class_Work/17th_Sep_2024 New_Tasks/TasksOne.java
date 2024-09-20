import java.util.Scanner;
public class TaskOne{

	public static void main(String... eniola){

		Scanner receiver = new Scanner(System.in);
		
		int totalScores = 0;
		
		for(int count = 1; count <= 10; count++){
			System.out.print("Enter Score : ");
			int scores = receiver.nextInt(); 
			
			totalScores += scores;
		}

		System.out.printf("Total sum of scores is : %d", totalScores);

	}



}