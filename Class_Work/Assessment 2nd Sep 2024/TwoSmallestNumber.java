import java.util.Scanner;
public class TwoSmallestNumber{

	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);
		
		int smallest = Integer.MAX_VALUE;
		int small = Integer.MAX_VALUE;
		
		for(int count =1; count <= 3; count++){
			
			System.out.print("Enter a number : ");
			int number = receiver.nextInt();

			if(number < smallest){
				smallest = small;
				small = number;
			}
			else if (number > smallest) small = number;	

		}
		System.out.println("Smallest is : " + smallest);
		System.out.println("small is : " + small);

	}


}