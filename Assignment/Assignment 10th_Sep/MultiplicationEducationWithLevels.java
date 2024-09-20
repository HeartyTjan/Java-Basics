import java.util.Scanner; 
import java.security.SecureRandom;
public class MultiplicationEducationWithLevels{

	static SecureRandom random = new SecureRandom();
	static Scanner receiver = new Scanner(System.in);
		
	public static void levelOneGetQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		int firstRandomValue = random.nextInt(10);
		int secondRandomValue = random.nextInt(10);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					Multiplication Education
		  	   			Level 1
				==========================================
				
		""");
			

		while (studentAnswer != result){

			System.out.print("What is " + firstRandomValue + " * " + secondRandomValue + "= : " );
			studentAnswer = receiver.nextInt();
			result = firstRandomValue * secondRandomValue;
		
			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}

		
		}
		
	}

	public static void levelTwoGetQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		int firstRandomValue = random.nextInt(10,25);
		int secondRandomValue = random.nextInt(10,25);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					Multiplication Education
		  	   			Level 2
				==========================================
				
		""");
			

		while (studentAnswer != result){

			System.out.print("What is " + firstRandomValue + " * " + secondRandomValue + "= : " );
			studentAnswer = receiver.nextInt();
			result = firstRandomValue * secondRandomValue;
		
			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}

		
		}
	}	
	public static void displayDifficultyLevelMenu(){

		int option = 1;
		
		while (option != 0){
			System.out.print("""


					Multiplication Education
					    Difficulty Level
					==========================
					1 --> Level 1
					2 --> Level 2
					3 --> Level 3
					0 --> Quit
					==========================
			""");
		
			System.out.print("Enter option : ");
			option = receiver.nextInt();
			
			int choice = 1;
			
			switch (option){

				case 1 : levelOneGetQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
				  

				case 2:  levelTwoGetQuestion(); 
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
			
				case 3 : levelThreeGetQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
					  
			}
				
		
		}

	}
		
	public static void displayPrompt(){

		System.out.printf("%nEnter option 1 to continue or 0 for menu : ");
			

	}

	public static void levelThreeGetQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		int firstRandomValue = random.nextInt(111,125);
		int secondRandomValue = random.nextInt(111,125);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					Multiplication Education
		  	   			Level 3
				==========================================
				
		""");
			

		while (studentAnswer != result){

			System.out.print("What is " + firstRandomValue + " * " + secondRandomValue + "= : " );
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