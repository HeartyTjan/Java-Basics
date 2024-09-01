import java.util.Scanner;
public class CommissionCalculator2{
	
	public static void main(String... args){
		
		Scanner receiver = new Scanner(System.in);
	
		System.out.print("""
			
			Commission Calculator
		------------------------------------
		""");
		
		System.out.print("Enter rider collection Rate for the day : ");
		int successfulDelivery = receiver.nextInt();

		calculateCommission(successfulDelivery);

	}
	
	public static int calculateCommission(int collectionRate){
	
		int basePay = 5000;

		if (collectionRate < 50) System.out.printf("Rider payment for the day : %,d ", (collectionRate * 160) + 5000);	
		if (collectionRate >= 50 && collectionRate <= 59 ) System.out.printf("Rider payment for the day : %,d ", (collectionRate * 200) + 5000);
		if (collectionRate >= 60 && collectionRate <= 69 ) System.out.printf("Rider payment for the day : %,d ", (collectionRate * 250) + 5000);
		if (collectionRate >= 70) System.out.printf("Rider payment for the day : %,d ", (collectionRate * 500) + 5000);

		return collectionRate;
	}
}