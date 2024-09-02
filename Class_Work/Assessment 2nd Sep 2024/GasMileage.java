import java.util.Scanner;
public class GasMileage{

	public static void main(String... tijani){

		System.out.print("""

				Gas Mileage record
			--------------------------------
			"""
		);

		Scanner receiver = new Scanner(System.in);

		double totalMilesPerGallon = 0;
		int choice = 1;
	
		while(choice != 0){
		
		System.out.print("Enter miles driven :");
		int milesDriven = receiver.nextInt();

		System.out.print("Enter gallon used:");
		int gallonUsed = receiver.nextInt();

		double milesPerGallon = (double) milesDriven / gallonUsed;

		System.out.printf("Miles per gallon for the trip : %.2f" , milesPerGallon);

		System.out.printf("%n%nEnter 1 to continue or enter 0 to stop : ");
		choice = receiver.nextInt();

		totalMilesPerGallon = totalMilesPerGallon + milesPerGallon;

		}
	
		System.out.printf("Total miles per gallon for trips recorded : %.2f", totalMilesPerGallon); 
	}
}