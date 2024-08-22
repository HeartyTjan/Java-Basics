import java.util.Scanner;

public class TaxCalculator{

	public static void main(String... tijani){

		Scanner into = new Scanner(System.in);

		System.out.print( """
				
				Develop a Java application that determines the total tax for each of three
				citizens. The tax rate is 15% for earnings up to or below 30,000 USD earned by each citizen and 20% for all
				earnings in excess of that ceiling.
		
				"""
			);

		for (int count = 0; count < 3; count++){
	
			System.out.print("Enter citizen name : ");
			String name = into.nextLine();

			System.out.printf("%nEnter citizen earning: ");
			int earning = into.nextInt();

			if ( earning <= 30000) {
	
				System.out.printf( "Total tax for year ending : %.0f%n%n" , earning * 0.15);
		  	}
			
			else  if (earning > 30000){
		
				System.out.printf("Total tax for year ending : %.0f%n%n" , earning * 0.20);	
		   	}

			into.nextLine();	

	  	 }


      	}

}