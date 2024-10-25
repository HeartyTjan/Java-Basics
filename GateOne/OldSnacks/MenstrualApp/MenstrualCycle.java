import java.util.Scanner;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.time.DateTimeException;

public class MenstrualCycle{
 	
	private String startDate;
	private int lengthOfCycle;

	private Scanner receiver = new Scanner(System.in); 

	public void displayInfo(){

		System.out.print("""

			     Menstrual Cycle App
			==============================
		""");
	
		System.out.print("Enter your name : ");
		String name = receiver.nextLine();

		System.out.print("""

			     Menstrual Cycle Menu
			==================================

			1 --> To check your next start date 
			2 --> To check your Ovulation day
			3 --> To check safe period
			4 --> To check fertile window
			0 --> Quit
			===================================
		""");
	
		int option = 1; 
	
		
		try{ 
			
			do{

				System.out.print("Enter your preferred choice : ");
				option = receiver.nextInt();

	
		   		switch(option){

			     	case 1 : 	System.out.print("""

								Check your start date
								========================
	 
							 """);

							try{
								 System.out.print("Enter ther first Day of Your Last Period(yyyy-mm-dd): ");
								 startDate = receiver.next();
					
								 System.out.print("Enter average length of cycle : ");
								 lengthOfCycle = receiver.nextInt();

								 LocalDate nextStartDate =  calculateMenstrualCycle(startDate,lengthOfCycle);
							
								 System.out.printf("Hello %s your next cycle start date is : %tF ", name, nextStartDate);break;

							}catch(InputMismatchException e){
								
								System.out.print("Expected a digit. Please enter a number");break;

							}catch(Exception e){
								System.out.print("Enter date in the right format(yyyy-mm-dd)");break;
							}
				
					case 2 :  System.out.print("""

							 Check your Ovulation Day
							===========================

							""");

							try{
								
								System.out.print("Enter ther first Day of Your Last Period(yyyy-mm-dd): ");
								startDate = receiver.next();

								System.out.print("Enter average length of cycle : ");
								lengthOfCycle = receiver.nextInt();
	
								if (lengthOfCycle < 21 || lengthOfCycle > 35)System.out.printf("if cycle is below 21 and above 35, please visit a doctor%n");
									
								LocalDate ovulationDay =  getOvulationDate(startDate,lengthOfCycle);
					
								LocalDate ovulationPeriod = ovulationDay.plusDays(4);
							
								System.out.printf("Hello %s your Ovulation day is from : %tF to %tF ", name, ovulationDay, ovulationPeriod);break;

							}catch(InputMismatchException e){
								
								System.out.print("Expected a digit. Please enter a number");break;

							}catch(Exception e){
								System.out.print("Enter date in the right format(yyyy-mm-dd)");break;
							}

					
					case 3: System.out.print("""

							   Calculate Safe Period
							===========================

							""");

							try{ 
								 System.out.print("Enter ther first Day of Your Last Period(yyyy-mm-dd): ");
								 startDate = receiver.next();

								 System.out.print("Enter average length of cycle : ");
								 lengthOfCycle = receiver.nextInt();

										
								 LocalDate safePeriodStartDate =  calculateSafePeriodDate(startDate,lengthOfCycle);
						
								 LocalDate safePeriod = safePeriodStartDate.plusDays(3);
								
								 System.out.printf("Hello %s your Safe period date is from : %tF to %tF%n%n", name, safePeriodStartDate, safePeriod);

								 System.out.print("Having unprotected sex during this period reduces odds of pregnancy\nThe closer you get to having your next period the lower the chances of getting pregnant");break;

							}catch(InputMismatchException e){
								
								System.out.print("Expected a digit. Please enter a number");break;

							}catch(Exception e){
								System.out.print("Enter date in the right format(yyyy-mm-dd)");break;
							}



					case 4 : System.out.print("""

							 Check your Fertile Window
							===========================

							""");

							try{
								
								System.out.print("Enter ther first Day of Your Last Period(yyyy-mm-dd):");
								startDate = receiver.next();
							
								System.out.print("Enter average length of cycle : ");
								lengthOfCycle = receiver.nextInt();

								
								LocalDate fertileStartDate =  calculateFertileDate(startDate,lengthOfCycle);
				
								LocalDate fertileWindow = fertileStartDate.plusDays(4);
						
								System.out.printf("Hello %s your fertile window days starts from : %tF to %tF "
									, name, fertileStartDate, fertileWindow);break;
									
							}catch(InputMismatchException e){
								
								System.out.print("Expected a digit. Please enter a number");break;

							}catch(Exception e){
								System.out.print("Enter date in the right format(yyyy-mm-dd)");break;
							}

							
						 
					case 0 : break;

					default : System.out.printf("Enter a valid option%n%n");
					
					
				}

			}while(option >= 1 && option <= 4 != true);

		}catch(Exception e){
			
			System.out.print("Illegal type, expected int value");
		}

	}
	
	public LocalDate calculateMenstrualCycle(String date,int lengthOfCycle){

		if (date.isEmpty())throw  new IllegalArgumentException("Date cannot be empty");	

		LocalDate nextCycleStartDate = LocalDate.now();		

		try{
			LocalDate startDate = LocalDate.parse(date);

			nextCycleStartDate = startDate.plusDays(lengthOfCycle);

			
		}catch(DateTimeException e){

			System.out.print("Date exceeds the supported date range");
		
		}

		return nextCycleStartDate;
		
	
	}

	public LocalDate getOvulationDate(String date,int lengthOfCycle){

		if (date.isEmpty())throw  new IllegalArgumentException("Date cannot be empty");	
		
		LocalDate startDate = LocalDate.parse(date);
	
	    try{
		if (lengthOfCycle >= 21 && lengthOfCycle <= 24){

			LocalDate startDatePlusCycle = startDate.plusDays(lengthOfCycle);
	
			LocalDate ovulationDay = startDatePlusCycle.minusDays(7);

			return ovulationDay;	

		}
	
		else if (lengthOfCycle >= 25 && lengthOfCycle <= 29){

			LocalDate startDatePlusCycle = startDate.plusDays(lengthOfCycle);
	
			LocalDate ovulationDay = startDatePlusCycle.minusDays(14);

			return ovulationDay;	

		}

		else if (lengthOfCycle >= 30 && lengthOfCycle <= 35){

			LocalDate startDatePlusCycle = startDate.plusDays(lengthOfCycle);
	
			LocalDate ovulationDay = startDatePlusCycle.minusDays(16);

			return ovulationDay;	

		}
 	
	   }catch(DateTimeException e){

			System.out.print("Date exceeds the supported date range");

		}

		throw new IllegalArgumentException("if cycle is below 21 and above 35, please visit a doctor");
		
	}

	public LocalDate calculateSafePeriodDate(String date, int lengthOfCycle){

		if (date.isEmpty())throw  new IllegalArgumentException("Date cannot be empty");	
		
		LocalDate safePeriod = LocalDate.now();

		try{
	
			LocalDate ovulationDay = getOvulationDate(date,lengthOfCycle);

			safePeriod = ovulationDay.plusDays(3);

		}catch(DateTimeException e){

			System.out.print("Date exceeds the supported date range");

		}

		return safePeriod;

	}

	
	public LocalDate calculateFertileDate(String date, int lengthOfCycle){

		if (date.isEmpty())throw  new IllegalArgumentException("Date cannot be empty");	
		
		LocalDate fertileStartDate = LocalDate.now();
		
		try{	
	
			LocalDate ovulationDay = getOvulationDate(date,lengthOfCycle);

			fertileStartDate = ovulationDay.minusDays(5);

		}catch(DateTimeException e){

			System.out.print("Date exceeds the supported date range");

		}

		return fertileStartDate;

	}


}