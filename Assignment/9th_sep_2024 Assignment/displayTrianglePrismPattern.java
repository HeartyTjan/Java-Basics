public class displayTrianglePrismPattern{

	public static void main(String... args){

		displayPattern(5);

	}
	
	public static void displayPattern(int number){
		
		for(int count =1; count <= number; count++){
		
			for(int space = 1; space <= number - count; space++){

				System.out.print("  ");
			}

			for (int column = 1; column <= count ; column++){
				
				System.out.print(column + " ");
				
			}
			System.out.println();

		}	
	}
	
}