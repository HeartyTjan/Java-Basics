import java.util.Scanner;
import java.util.Arrays;
public class FibonacciSeries{


	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);

		System.out.print("Enter the nth term : ");
		int size = receiver.nextInt();
		
		
		FibonacciSeries read = new FibonacciSeries();

		 int numbers [] = read.getFibonnaciNumbers(size);
		 double numbers2 [] = read.getFibonnaciNumbers2(size);
	
		  printArray(numbers);
		  System.out.print("Fibonacci nunbers" + Arrays.toString(numbers2));
		 System.out.printf("%nLargest is : %d ", getLargest(numbers));

	}

	public int[] getFibonnaciNumbers(int nth){

		int firstNumber = 0;
		int secondNumber = 1;
		int nextNumber = 0;
		int result [] = new int [nth];

		for(int count = 0; count < nth; count++){
			
			if(count > 1){

				nextNumber = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = nextNumber;
				result[count] = secondNumber;
			}
			else result[count] = count;			

		}

		return result;
	}

	public double[] getFibonnaciNumbers2(int nth){

		double firstNumber = 0;
		double secondNumber = 1;
		double nextNumber = 0;
		double result [] = new double [nth];

		for(int count = 0; count < nth; count++){
			
			if(count > 1){

				nextNumber = firstNumber + secondNumber;
				firstNumber = secondNumber;
				secondNumber = nextNumber;
				result[count] = secondNumber;
			}
			else result[count] = count;			

		}

		return result;
	}


	public static int getLargest(int [] array){

		int largest = array[0];

		for (int number : array){

			if(number > largest)largest = number;
		}
		return largest;

	}
	
	public static void printArray(int[] array){

		int size = array.length;
		
		int count = 0;
		for(int number : array){

			System.out.print(number + " ");
			count++;
			if (count % 10 == 0) System.out.println();
			
		}
	}
}