import java.util.Scanner;
public class LeapYearTester{

	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);
	
		System.out.print("Enter Year : ");
		int year = receiver.nextInt();

		LeapYear.leapYearMethod(year);

	}	


}