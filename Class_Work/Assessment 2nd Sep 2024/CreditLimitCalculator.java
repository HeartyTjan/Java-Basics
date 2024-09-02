import java.util.Scanner;
public class CreditLimitCalculator{

	public static void main (String [] args){

		Scanner receiver = new Scanner(System.in);

		System.out.print("""
			
				Credit Limit Calculator
			--------------------------------------
			"""
		);
	
		System.out.print("Enter customer account no: ");
		int accountNumber = receiver.nextInt();

		System.out.print("Enter customer beginning balance of the month: ");
		int beginningBalance = receiver.nextInt();

		System.out.print("Enter customer total charges for the month: ");
		int totalCharges = receiver.nextInt();

		System.out.print("Enter customer total credit allowed for the month: ");
		int totalCredit = receiver.nextInt();

		System.out.print("Enter customer allowed credit limit: ");
		int allowedCredit = receiver.nextInt();
		System.out.println();cl
		
		/*int accountNumber = 210567161;
		int beginningBalance = 5000;
		int totalCharges = 7000;
		int totalCredit = 6000;
		*/

		int newBalance = beginningBalance + totalCharges - totalCredit;

		if (newBalance >= allowedCredit){
			System.out.println("Customer account No : " + accountNumber);
			System.out.print("Credit Limit exceeded");
		}
		else {
			System.out.println("Customer account No : " + accountNumber);
			System.out.print("Credit limit not exceeded");
		}
	}


}