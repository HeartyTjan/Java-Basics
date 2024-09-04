public class MultiplicationTable{

	public static void main (String... args){

		System.out.print("""
			
						Multiplication Table
					--------------------------------------
						"""
		);
		

		for(int count = 1; count < 10; count++){

			
			for (int counter = 1; counter < 10; counter++){

				
				
				System.out.printf("%d * %d = %d \t ", counter,count, count * counter);
				
				
			}
			System.out.println();
		}
		
		
	}


}


	