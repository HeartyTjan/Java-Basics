import java.util.Scanner;
public class TwoLargestNumber{

	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);
		
		int largest = 0;
		int large = 0;
		
		for(int count =1; count <= 2; count++){
			
			System.out.print("Enter a number : ");
			int number = receiver.nextInt();

			if(number > largest){
				large = largest;
				largest = number;
			}
			else if (number > large) large = number;	

		}
		System.out.println("largest is : " + largest);
		System.out.println("large is : " + large);
		



	}


}