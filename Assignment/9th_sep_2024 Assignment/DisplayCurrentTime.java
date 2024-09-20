public class DisplayCurrentTime{

	public static void main(String... args){

		getCurrentTime();	

	}
	public static void getCurrentTime(){

		long milliSeconds = System.currentTimeMillis();
		
		long totalSeconds =  milliSeconds / 1000;
	
		long currentSeconds = totalSeconds % 60;
	
		long totalMinutes = totalSeconds / 60;

		long currentMinutes = totalMinutes % 60;

		long totalHours = totalMinutes / 60;

		long currentHour = totalHours % 24;
		

		System.out.print("The is current time is " +  currentHour + " :" + currentMinutes + " :" + currentSeconds);


	}

}