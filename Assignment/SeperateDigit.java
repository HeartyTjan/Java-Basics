import java.util.Scanner;

public class DisplaySeperateDigit{

	public static void main (String [] args){
		
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a number consisting of five digit : ");
		int num = input.nextInt();

	
		int first = num / 10000 % 10;
		int second = num / 1000 % 10;			
		int third = num / 100 % 10;
		int fourth = num / 10 % 10; 
		int fifth = num % 10;

		System.out.print( first + "    ");
		System.out.print( second + "    ");
		System.out.print( third + "    ");
		System.out.print( fourth + "    ");
		System.out.print( fifth + "    ");
	
	}

}

