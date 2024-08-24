import java.util.Scanner;
public class MortgageCalculator{

	public static void main(String... args){
	
		Scanner receiver = new Scanner(System.in);
	
		System.out.print("""
					Mortgage Calculator
				.................................
				"""
		);

		System.out.printf("%nEnter principal Amount: ");
		double principalAmount = receiver.nextDouble();
	
		System.out.print("Enter annual interest rate : ");
		double annualInterestRate = receiver.nextDouble();
		double convertedAnnualInterestRate = annualInterestRate / 100;
		double monthlyInterestRate = convertedAnnualInterestRate / 12;

		System.out.print("Enter the duration in years : ");
		int durationInYears = receiver.nextInt();
		int durationInMonth = durationInYears * 12;

		double monthlyMortgage1 = principalAmount * monthlyInterestRate * Math.pow((1 + monthlyInterestRate), durationInMonth);
		double monthlyMortgage2 = Math.pow((1 + monthlyInterestRate), durationInMonth)- 1;
		double actualMonthlyMortgage = monthlyMortgage1 / monthlyMortgage2;

		System.out.printf("Monthly payment is : $%,.2f ",actualMonthlyMortgage);
	
		
	}

}