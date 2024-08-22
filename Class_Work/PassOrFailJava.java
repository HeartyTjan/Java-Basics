import java.util.Scanner;

public class PassOrFailJava{

    public static void main (String... args){
	
	Scanner into = new Scanner(System.in);
	
	System.out.print("Enter your Java Score:");
	int score = into.nextInt();
	
	int passScore = 60;

	while (score != -1) {
	
		if (score > passScore) { 

			System.out.print("You pass the exam");

		}
		else {
	
			System.out.print("You failed the exam");
		}

			System.out.printf("%n%nEnter your Java Score or -1 to stop:");
			score = into.nextInt();
			
	}


    }

}