import java.util.Scanner;

public class CommissionCalculator{
	
  	 public static void main (String... args){
    	 	Scanner into = new Scanner(System.in);

     		double wages = 200;
     		char choice = 'y';
     		double sumTotalWages = 0;

     		while (choice == 'y' ) {
	
			System.out.printf("%nEnter merchandize value : ");
        		double merchAmount = into.nextDouble();
	
			double totalWages = (merchAmount * 0.09) + wages;
	
			sumTotalWages+= totalWages;

			System.out.printf("Total Wages is : %.2f ", totalWages);

			System.out.printf("%nEnter y to continue and N to stop : ");
			choice = into.next().charAt(0);
     
      		}
		
    		System.out.printf("%nSum of total Wages is : %.2f ", sumTotalWages);
   	}

}