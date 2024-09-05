import java.util.Scanner;
public class MethodTester{

	public static void main(String... args){
		
		Scanner receiver = new Scanner(System.in);

		System.out.print("Enter number : ");
		String number1 = receiver.nextLine();
		//System.out.print("Enter number : ");
		//int number2 = receiver.nextInt();
		//System.out.print("Enter number : ");
		//int number3 = receiver.nextInt();

		
		//MethodDeclearation.displaySortedNumbers(number1,number2,number3);
		MethodDeclearation.countLetters(number1);

	}
}