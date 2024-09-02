public class DivisibleByThreeAndFour{
	
	public static void main (String... tijani){

		int lineCounter = 0;

		for (int count = 100; count <= 200; count++){

			if(count % 3 == 0 || count % 4 ==0){

				System.out.print(count + " ");
				lineCounter++;
				
			}
			
			if (lineCounter == 10){

				System.out.println();
				lineCounter = 0;
			}
		}

	}

}