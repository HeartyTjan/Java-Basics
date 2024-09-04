import java.util.Scanner;
public class Encryption{

	public static void main(String... args){
	
		Scanner receiver = new Scanner(System.in);

		System.out.print("Enter four digit integer : ");
		int number = receiver.nextInt();
		
		

		int firstNumber = number / 1000;
		int secondNumber = number/ 100 % 10;
		int thirdNumber = number / 10 % 10;
		int fourthNumber = number % 10;

		int encryptFirstNumber = (firstNumber + 7) % 10;
		int encryptSecondNumber = (secondNumber + 7) % 10;
		int encryptThirdNumber = (thirdNumber + 7) % 10;
		int encryptFourthNumber = (fourthNumber + 7) % 10;

		int encryptedFirstNumber = encryptThirdNumber * 1000;
		int encryptedSecondNumber = encryptFourthNumber * 100;
		int encryptedThirdNumber = encryptFirstNumber * 10;
		int encryptedFourthNumber =  encryptSecondNumber;
	
		int encrytedDigit = encryptedFirstNumber + encryptedSecondNumber + encryptedThirdNumber + encryptedFourthNumber;	
		
		System.out.println(encrytedDigit);


	}


}