import java.util.Scanner;
public class ReadingNumbers{

	public static void main(String... args){

		int sum = 0;
	
		Scanner receiver = new Scanner(System.in);

		System.out.print("Enter an target value : ");
		int targetedValue = receiver.nextInt();

		while(sum < targetedValue){
		
			System.out.print("Enter an integer: ");
			int integerValue = receiver.nextInt();
			
			sum+= integerValue;
	
		}

		System.out.print("Sum of value read is : " + sum);


	}


}