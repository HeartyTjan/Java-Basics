import java.util.Scanner;

public class NumberToWord{
 	 
	public static void main (String [] args){

		Scanner input  = new Scanner(System.in);

	 	System.out.print("Enter a number between 1 and 10 : ");
	  	int value = input.nextInt();
	
	  	if ( value == 1) System.out.println("Number in word : ONE");
		
  	  	if ( value == 2) System.out.println("Number in word : TWO");

  	  	if ( value == 3) System.out.println("Number in word : THREE");

  	  	if ( value == 4) System.out.println("Number in word : FOUR");

	  	if ( value == 5) System.out.println("Number in word : FIVE");

	 	 if ( value == 6) System.out.println("Number in word : SIX");

	  	if ( value == 7) System.out.println("Number in word : SEVEN");
		
	  	if ( value == 8) System.out.println("Number in word : EIGHT");

	  	if ( value == 9) System.out.println("Number in word : NINE");
	 
	  	if ( value == 10) System.out.println("Number in word : TEN");

  		
   	}


}