import java.util.Scanner; 
import java.security.SecureRandom;

public class ArithmeticEducation{

	static SecureRandom random = new SecureRandom();
	static Scanner receiver = new Scanner(System.in);
		
	public static void levelOneMultiplicationQuestion(){
	
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
	public static void levelOneAdditionQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		int firstRandomValue = random.nextInt(10);
		int secondRandomValue = random.nextInt(10);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					   Addition Education
		  	   			Level 1
				==========================================
				
		""");
			

		while (studentAnswer != result){

			System.out.print("What is " + firstRandomValue + " + " + secondRandomValue + "= : " );
			studentAnswer = receiver.nextInt();
			result = firstRandomValue + secondRandomValue;
		
			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}

		
		}
		
	}
	
	public static void levelOneSubtractionQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		int firstRandomValue = random.nextInt(10);
		int secondRandomValue = random.nextInt(10);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					   Subtraction Education
		  	   			Level 1
				==========================================
				
		""");
			

		while (studentAnswer != result){

			if(firstRandomValue < secondRandomValue) {

				System.out.printf("What is %d - %d = " , secondRandomValue, firstRandomValue); 
				studentAnswer = receiver.nextInt();
				result = secondRandomValue - firstRandomValue;
			}
			else{
				System.out.printf("What is %d - %d = " , firstRandomValue, secondRandomValue);
				studentAnswer = receiver.nextInt();
				result = firstRandomValue - secondRandomValue;
			}

			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}

		
		}
		
	}

	public static void levelOneDivisionQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		double firstRandomValue = random.nextInt(10);
		double secondRandomValue = random.nextInt(10);
		
		double result = 0;
		double studentAnswer = 1;

		System.out.print("""
			
					   Division Education
		  	   			Level 1
				==========================================
				
		""");
			

		while (studentAnswer != result){

			if(firstRandomValue < secondRandomValue) {

				System.out.printf("What is %.0f / %.0f = " , secondRandomValue, firstRandomValue); 
				studentAnswer = receiver.nextDouble();
				result = secondRandomValue / firstRandomValue;
			}
			else{
				System.out.printf("What is %.0f / %.0f = " , firstRandomValue, secondRandomValue);
				studentAnswer = receiver.nextDouble();
				result = firstRandomValue / secondRandomValue;
			}
			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}
		
		}
		
	}


	public static void levelTwoMultiplicationQuestion(){
	
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
	public static void levelTwoAdditionQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		int firstRandomValue = random.nextInt(10,25);
		int secondRandomValue = random.nextInt(10,25);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					    Addition Education
		  	   			Level 2
				==========================================
				
		""");
			

		while (studentAnswer != result){

			System.out.print("What is " + firstRandomValue + " + " + secondRandomValue + "= : " );
			studentAnswer = receiver.nextInt();
			result = firstRandomValue + secondRandomValue;
		
			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}

		
		}
	}

	public static void levelTwoSubtractionQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		int firstRandomValue = random.nextInt(10,25);
		int secondRandomValue = random.nextInt(10,25);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					   Subtraction Education
		  	   			Level 2
				==========================================
				
		""");
			

		while (studentAnswer != result){

			if(firstRandomValue < secondRandomValue) {

				System.out.printf("What is %d - %d = " , secondRandomValue, firstRandomValue); 
				studentAnswer = receiver.nextInt();
				result = secondRandomValue - firstRandomValue;
			}
			else{
				System.out.printf("What is %d - %d = " , firstRandomValue, secondRandomValue);
				studentAnswer = receiver.nextInt();
				result = firstRandomValue - secondRandomValue;
			}

			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}
		}
	}

	public static void levelTwoDivisionQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		double firstRandomValue = random.nextInt(10,25);
		double secondRandomValue = random.nextInt(10,25);
		
		double result = 0;
		double studentAnswer = 1;

		System.out.print("""
			
					   Division Education
		  	   			Level 2
				==========================================
				
		""");
			

		while (studentAnswer != result){

			if(firstRandomValue < secondRandomValue) {

				System.out.printf("What is %.0f / %.0f = " , secondRandomValue, firstRandomValue); 
				studentAnswer = receiver.nextDouble();
				result = secondRandomValue / firstRandomValue;
			}
			else{
				System.out.printf("What is %.0f / %.0f = " , firstRandomValue, secondRandomValue);
				studentAnswer = receiver.nextDouble();
				result = firstRandomValue / secondRandomValue;
			}
			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}


		
		}
	}

	public static void levelThreeMultiplicationQuestion(){
	
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
	
	public static void levelThreeAdditionQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		int firstRandomValue = random.nextInt(111,125);
		int secondRandomValue = random.nextInt(111,125);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					   Addition Education
		  	   			Level 3
				==========================================
				
		""");
			

		while (studentAnswer != result){

			System.out.print("What is " + firstRandomValue + " + " + secondRandomValue + "= : " );
			studentAnswer = receiver.nextInt();
			result = firstRandomValue + secondRandomValue;
		
			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}

		
		}
	}	 	 
		
	public static void levelThreeSubtractionQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		int firstRandomValue = random.nextInt(110,199);
		int secondRandomValue = random.nextInt(110,199);
		
		int result = 0;
		int studentAnswer = 1;

		System.out.print("""
			
					    Subtraction Education
		  	   			Level 3
				==========================================
				
		""");
			
		while (studentAnswer != result){

			if(firstRandomValue < secondRandomValue) {

				System.out.printf("What is %d - %d = " , secondRandomValue, firstRandomValue); 
				studentAnswer = receiver.nextInt();
				result = secondRandomValue - firstRandomValue;
			}
			else{
				System.out.printf("What is %d - %d = " , firstRandomValue, secondRandomValue);
				studentAnswer = receiver.nextInt();
				result = firstRandomValue - secondRandomValue;
			}

			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}
		
		}
	}

	public static void levelThreeDivisionQuestion(){
	
		java.util.Scanner receiver = new java.util.Scanner(System.in);
		

		double firstRandomValue = random.nextInt(111,125);
		double secondRandomValue = random.nextInt(111,125);
		
		double result = 0;
		double studentAnswer = 1;

		System.out.print("""
			
					   Division Education
		  	   			Level 3
				==========================================
				
		""");
			

		while (studentAnswer != result){

			if(firstRandomValue < secondRandomValue) {

				System.out.printf("What is %.0f / %.0f = " , secondRandomValue, firstRandomValue); 
				studentAnswer = receiver.nextDouble();
				result = secondRandomValue / firstRandomValue;
			}
			else{
				System.out.printf("What is %.0f / %.0f = " , firstRandomValue, secondRandomValue);
				studentAnswer = receiver.nextDouble();
				result = firstRandomValue / secondRandomValue;
			}

			if(studentAnswer == result) System.out.print("Very good");
	
			else {
				System.out.printf("No please try again%n");
				System.out.println();
			}

		
		}
	}	 	
		 	 	
	 public static void displayMultiplicationDifficultyMenu(){

		int option = 1;
		
		while (option != 0){
			System.out.print("""


					Multiplication Education
					    Difficulty Level
					==========================
					1 --> Level 1
					2 --> Level 2
					3 --> Level 3
					0 --> Main menu
					==========================
			""");
		
			System.out.print("Enter option : ");
			option = receiver.nextInt();
			
			int choice = 0;
			
			switch (option){

				case 1 : levelOneMultiplicationQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
				  

				case 2:  levelTwoMultiplicationQuestion(); 
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
			
				case 3 : levelThreeMultiplicationQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
					  
			}
				
		
		}

	}
	public static void displayAdditionDifficultyMenu(){

		int option = 1;
		
		while (option != 0){
			System.out.print("""


					   Addition Education
					    Difficulty Level
					==========================
					1 --> Level 1
					2 --> Level 2
					3 --> Level 3
					0 --> Main menu
					==========================
			""");
		
			System.out.print("Enter option : ");
			option = receiver.nextInt();
			
			int choice = 0;

			switch (option){

				case 1 : levelOneAdditionQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
				  

				case 2:  levelTwoAdditionQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
			
				case 3 : levelThreeAdditionQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
					  
			}
				
		
		}

	}
	
	public static void displaySubtractionDifficultyMenu(){

		int option = 1;
		
		while (option != 0){
			System.out.print("""


					  Subtraction Education
					    Difficulty Level
					==========================
					1 --> Level 1
					2 --> Level 2
					3 --> Level 3
					0 --> Main menu
					==========================
			""");
		
			System.out.print("Enter option : ");
			option = receiver.nextInt();
			
			int choice = 0;

			switch (option){

				case 1 : levelOneSubtractionQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
				  

				case 2:  levelTwoSubtractionQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
			
				case 3 : levelThreeSubtractionQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
					  
			}
				
		
		}

	}	

	public static void displayDivisionDifficultyMenu(){

		int option = 1;
		
		while (option != 0){
			System.out.print("""


					  Division Education
					    Difficulty Level
					==========================
					1 --> Level 1
					2 --> Level 2
					3 --> Level 3
					0 --> Main menu
					==========================
			""");
		
			System.out.print("Enter option : ");
			option = receiver.nextInt();
			
			int choice = 0;

			switch (option){

				case 1 : levelOneDivisionQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
				  

				case 2:  levelTwoDivisionQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
			
				case 3 : levelThreeDivisionQuestion();
					 displayPrompt();
					 choice = receiver.nextInt();
					 break;
					  
			}
				
		
		}

	}	
	public static void displayPrompt(){

		System.out.printf("%nEnter option 1 to continue :  ");
			

	}

	public static void displayArithmeticMenu(){

		int choice = 1;
		while(choice != 0){

			System.out.print("""


					     Arithmetic Menu
					==========================
					1 --> Multiplication
					2 --> Addition
					3 --> Subtraction
					4 --> Division
					0 --> Quit
					==========================
			""");
			
			System.out.print("Enter option : ");
			choice = receiver.nextInt();
			
			switch(choice){
			
				case 1 : displayMultiplicationDifficultyMenu();break;
			
				case 2 : displayAdditionDifficultyMenu(); break;

				case 3: displaySubtractionDifficultyMenu(); break;
				
				case 4: displayDivisionDifficultyMenu(); break;

			}
		
		}
	}


}