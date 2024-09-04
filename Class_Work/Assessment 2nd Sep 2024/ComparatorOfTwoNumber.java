import java.util.Scanner;
public class ComparatorOfTwoNumber{

	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);

		System.out.print("Enter an number: ");
		int firstNumber = receiver.nextInt();
		
		System.out.print("Enter an number: ");
		int secondNumber = receiver.nextInt();

		if(firstNumber == secondNumber) System.out.print(0);
		else if (firstNumber > secondNumber) System.out.print(1);
		else if (firstNumber < secondNumber) System.out.print(-1);


	}


}		