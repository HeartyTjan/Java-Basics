public class TicTakToe{

	public static void main(String... args){

		char[] [] tictaktoe = new char[3] [3];

		int count = 0;
		int counter = 0;

		for(count = 0; count < tictaktoe.length; count++){
			

			for(counter = 0; counter < tictaktoe.length; counter++){


				tictaktoe[count] [counter] = 'x';

				if(counter == 1) tictaktoe[count] [counter] = 'o';
				if(count == 1 && counter < 3) tictaktoe[count] [counter] = 'o';
	
			}
		}

		for(count = 0; count < tictaktoe.length; count++){
			
			for(counter = 0; counter < tictaktoe.length; counter++){
				System.out.print(tictaktoe[count][counter]);
				if (count == 0 && counter == 2 ) System.out.println();
				if (count == 1 && counter == 2 ) System.out.println();
				 
			}
		
		}

	}


}