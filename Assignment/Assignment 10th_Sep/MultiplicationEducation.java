import java.security.SecureRandom;
public class MultiplicationEducation{

		
	public static void getQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		SecureRandom random = new SecureRandom();

		int firstRandomValue = random.nextInt(10);
		int secondRandomValue = random.nextInt(10);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					Multiplication Education
		  	   Multiply the follow numbers below until you are correct
				"""
		);
			

		while (studentAnswer != result){

			System.out.print("Calculate " + firstRandomValue + " * " + secondRandomValue + "= : " );
			studentAnswer = receiver.nextInt();
			result = firstRandomValue * secondRandomValue;
		
			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}

		
		}
		
	}
	
	
}