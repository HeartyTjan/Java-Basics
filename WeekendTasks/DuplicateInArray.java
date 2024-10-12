import java.util.Arrays;
public class DuplicateInArray{
	
	public static void main(String... args){

		int [] numbers = {1,2,3,1,4,5,2,7};
		DuplicateInArray finder = new DuplicateInArray();

		finder.findDuplicate(numbers);
	
	}

	public void findDuplicate(int [] array){

		int size = array.length;

		int duplicate [] = new int [size];

		int j = 0;
				
		for(int count = 0; count < size; count++){

			for(int index = count + 1; index < size; index++){
			
				if (array[count] == array[index])System.out.print(array[index]);
		
			}
			
			
		}
		
		
	}
	





}