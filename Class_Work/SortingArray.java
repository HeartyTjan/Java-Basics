import java.util.Arrays; 
public class SortingArray{

	public static void main(String... args){

		int [] numbers = {5,9,1,6,18,7,2,87,20,37,12,45};
		
		SortingArray array = new SortingArray();

		 array.sorting(numbers);
		
		System.out.print(Arrays.toString(numbers);

	}

	public void sorting( int [] array){
						 
		int pos;
		int temp;
		int size = array.length;
		for (int count = 0; count < size; count++){
		
			pos = count;
			for (int counter = count + 1; counter < size; counter++){
				
				if(array[counter] < array[pos]){

					pos = counter;
				}	
			}
			temp = array[pos];
			array[pos] = array[count];
			array[count] = temp;
		
		}	
	}
}
 