public class TicTakToeV2{

	public static void main(String... args){

		char[] [] tictaktoe = {{'x','o','x'},{'o','o','o'},{'x','o','x'}};

	
		for(int count = 0; count < tictaktoe.length; count++){
			
			for(int counter = 0; counter < tictaktoe.length; counter++){
				System.out.print(tictaktoe[count][counter]);
				
				 
			}
			System.out.println();
		}



	}


}