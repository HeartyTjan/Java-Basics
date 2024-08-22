public class NaturalNumber{
	
	public static void main(String... args){
	int number = 0;
	int sum = 0;
	
	System.out.printf("%nFirst 10 natural numbers are : ");


	while ( number < 10){
		
		number = number + 1;
		sum+= number;

		System.out.printf(number + " ");
		
	    }
		System.out.printf("%n%nSum of 10 natural number is : %d",sum);

	}


}