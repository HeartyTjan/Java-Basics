public class CreditLimitCalculator{

	public static void main (String [] args){
		
		int accountNumber = 210567161;
		int beginningBalance = 1000;
		int totalCharges = 7000;
		int totalCredit = 6000;
		int allowedCredit = 1000;

		int newBalance = beginningBalance + totalCharges - totalCredit;

		if (newBalance >= allowedCredit){

			System.out.print("Credit Limit exceeded");
		}
	}


}