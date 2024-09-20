public class SquareAsterisks{

	public static void main(String... args){

		displaySquareAsterisks(4);
	
	}
	public static void displaySquareAsterisks(int size){
		
		for(int count = 1; count <= size; count++ ){
			
			for(int counter = 1; counter <= size; counter++){
					
				System.out.print('*');
			
			}
			System.out.println();
		}
		

	}

}