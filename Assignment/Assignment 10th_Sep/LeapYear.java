
public class LeapYear{


	public static int leapYearMethod(int year){


		if(year % 4 == 0 || year % 400 == 0) System.out.print("Specified year is a leap year");
		else System.out.print("Specified year is not a leap year");
		
		return year;
	
	}




}