public class FunctionListWithArray{


	public static void main(String... args){

		int[] scores = {10,12,14};//{10,15,100,30,70,12,32,71,17,70};

		int[] scores2 = {5,4,2};//{19,89,54,21,45,90,87};
		
		String[] names = {"Madam", "racecaR","float","baba"};
		String[] names2 = {"ope","tope"};

		//System.out.println("The largest is : " + getLargestArray(scores));

		//getReverseArray(scores);
		//System.out.printf("%nCan inputed number be found in the array : " + checkForElement(scores, 30));
		//System.out.println();
		//printElementofOddPosition(scores);
		//printElementofEvenPosition(scores);
		//System.out.printf("%nRunning Total is : %d", computeRunningTotal(scores));
		//testStringIsPalindrome(names);

		//System.out.print(getSumUsingDoWhileLoop(scores));
		//concatenateIntArray(scores,scores2);
		//concatenateStringArray(names, names2);
		concatenateArrayalternatively(scores,scores2);
	}
	
	public static int getLargestArray(int[] array){

		int largest = array[0];

		for(int number : array){
		
			if (number > largest) largest = number;

		}
	
		return largest;
	}

	public static void getReverseArray(int[] array){

		System.out.print("The reverse array is : ");

		for (int reverse = array.length - 1 ; reverse >= 0 ; reverse--){
			
			System.out.print(array[reverse] + " ");
		}
						
	}

	public static boolean checkForElement(int[] array, int number){

		int count = 0;

		for(int check : array){

			if (number == check ) return true;

			else  {
				count++;
				if (count == array.length)return false;
			}
			
		}
		return true || false;	
	}

	public static void printElementofOddPosition(int[] array){

		System.out.printf("Element of Odd position in array : ");

		for(int count = 0; count < array.length; count++){

			if (count % 2 == 1) System.out.print(array[count] + " ");
		}
		
	}

	public static void printElementofEvenPosition(int[] array){

		System.out.printf("%nElement of even position in array : ");

		for(int count = 0; count < array.length; count++){

			if (count % 2 == 0) System.out.print(array[count] + " ");
		}
		
	}
	public static int computeRunningTotal(int[] array){
		
		int sum = 0;

		for(int number : array){

			sum += number;
		}
		return sum;
	}
	
	public static void testStringIsPalindrome(String[] array ){
	
		
		System.out.printf("%nString is palindrome :");
		for(String check : array){

			check = check.toLowerCase();

			StringBuilder tester = new StringBuilder(check);
			tester.reverse();
			
			if (check.equals(tester.toString())) System.out.printf("%s%17s%n", check, "is a palindrome");

			else System.out.printf("%s%17s%n", check," Not a palindrome");

		}

	}

	public static int getSumUsingForLoop(int[] array){
	
		int sum = 0;

		for(int count = 0; count < array.length; count++){
		
			sum += array[count];

		}
		return sum;
	}

	public static int getSumUsingWhileLoop(int[] array){
	
		int sum = 0;
		int count = 0;

		while (count != array.length){
		
			sum += array[count];
			count++;
		}
		return sum;
	}
	
	public static int getSumUsingDoWhileLoop(int[] array){
	
		int sum = 0;
		int count = 0;


		do{

			sum += array[count];
			count++;

		} while (count != array.length);
		
		return sum;
	}
	public static void concatenateIntArray(int[] array1, int[] array2){
		
		System.out.print("Concatenated int array elements : ");
		int[] concat = new int[ array1.length + array2.length];

		for(int count = 0; count < array1.length; count++){

			concat[count] = array1[count];
			System.out.print(concat[count]);
			if(count < array1.length) System.out.print(", ");

			
		}
		int count = 0;
		for(int counter = array1.length; counter < concat.length; counter++){

			concat[counter] = array2[count];
			count++;
			System.out.print(concat[counter]);
			if(counter < concat.length -1) System.out.print(", ");

		}
			
	}
	public static void concatenateStringArray(String[] array1, String[] array2){
		
		System.out.printf("%nConcatenated String array elements : ");
		String[] concat = new String [ array1.length + array2.length];

		for(int count = 0; count < array1.length; count++){

			concat[count] = array1[count];
			System.out.print(concat[count]);
			if(count < array1.length) System.out.print(", ");

			
		}

		int count = 0;
		for(int counter = array1.length; counter < concat.length; counter++){

			concat[counter] = array2[count];
			count++;
			System.out.print(concat[counter]);
			if(counter < concat.length -1) System.out.print(", ");

		}
	}

	public static void concatenateArrayalternatively(int[] array1, int[] array2){
		
		System.out.print("Concatenated String array elements : ");
		int[] concat = new int [ array1.length + array2.length];

		
		for(int count = 0 ; count < concat.length; count = count + 2){

			int arrayCount = 0;
			concat[count] = array1[arrayCount];
			System.out.print(concat[count]);
			if(count < array1.length) System.out.print(", ");
			arrayCount++;
			System.out.printf("%narrycounter" + arrayCount);
			System.out.println();

				
		}                                    
		
		/*
		for(int counter =uCounter * 2 + 1 ; counter <= count+1; counter++){
				
				int b = 0;
			
				concat[counter] = array2[b];
				b++;
				System.out.print(concat[counter]);
				if(counter < concat.length -1) System.out.print(", ");
			
				System.out.print("counter" + counter);
				
		}
		*/
		
		

	}
}