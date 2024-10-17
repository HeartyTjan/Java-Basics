public class BinarySearch{
	
	public static void main(String... args){
			
		int [] numbers = {1,4,5,6,7,19,35,40,45};
		int find = 40;

		long startTime = System.nanoTime();
		int output = binarySearch(numbers,find);
		long endTime  = System.nanoTime();
		System.out.println((endTime - startTime)/1000);
	
		if (output != -1) System.out.printf("Index is %d and value is: %d",output, numbers[output]);
		else System.out.print("Element not found");
	}

	
	public static int binarySearch(int [] array, int lookForValue){

		int start = 0;
		int end = array.length -1;

		while(start <= end){

			int mid = (start + end) / 2;
			int guess = array[mid];

			if (guess == lookForValue) return mid;

			if (guess > lookForValue){

				end = mid - 1;
			}	
			else start = mid + 1;

		}

		return -1;		
	}




}