public class MultiplicationTable{

	public static void main (String... args){

		System.out.print("""
			
						Multiplication Table
					--------------------------------------
						"""
		);
		
		int lineCounter = 0;
		for(int count = 1; count < 10; count++){

			
			for (int counter = 1; counter < 10; counter++){

				
				
				System.out.printf("%d * %d = %d  ", count,counter, count * counter);
				
				lineCounter++;
				if (lineCounter == 9){
					System.out.println();
					lineCounter = 0;
				}
			}
			
		}
		
		
	}


}


	