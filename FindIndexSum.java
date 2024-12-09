import java.util.Arrays;
import java.util.ArrayList;
public class FindIndexSum{

	public static void main(String... args){
	
		int [] numbers = {3,4,1,9,6};
		int sum = 10;

		ArrayList <Integer> result = getSumIndex(numbers, sum);
		System.out.print(result);
		
		//int [] output = getSumIndex1(numbers, sum);
		//System.out.print(Arrays.toString(output));
			
		}

		public static int[] getSumIndex1(int [] arrayNumber, int sum){

			int size =  arrayNumber.length;
			int [] result = new int [2];
			for(int index = 0; index < size; index++){

				for(int count = 0 ; count < size; count++){

					if(arrayNumber[index] + arrayNumber[count] == sum){

						result[0] = count;
						result[1] = index;
						
						
					}
		
				}

			}

			return result;

		}
		
	public static ArrayList getSumIndex(int [] arrayNumber, int sum){
		int size =  arrayNumber.length;
		ArrayList <Integer> result = new ArrayList<>();

		int counter = 0;
		for(int index = 0; index < size; index++){

			for(int count = 0; count < size; count++){

				if(arrayNumber[index] + arrayNumber[count] == sum){

					result.add(counter,count);			
					result.add(counter,index);
				}
						
				

			}

			

		}
		
		return result;


	}	
	




}