import java.util.Scanner;
public class PizzaSales{
	
	static Scanner receiver = new Scanner(System.in);
	static int numberOfPeople;
	public static void main (String... args){

		
		displayPizzaTypeMenu();
		
	
	}
	
	public static void displayPizzaTypeMenu(){

		System.out.print("""

					  Pizza type Menu and Prices
		  -----------------------------------------------------------
		  | S/N |Pizza Type 	| Number of Slices | Price per box  |
		  |-----|--------------	|------------------|----------------|
		  |  1  |Sapa size	| 4  		   |  2,000	    |
		  |-----|--------------	|------------------|----------------|
		  |  2  |Small Money	| 6		   |  2,400	    |
		  |-----|--------------	|------------------|----------------|
		  |  3  |Big boys   	| 8		   |  3,000         |
		  |-----|--------------	|------------------|----------------|
		  |  4  |Odogwu	    	| 12               |  4,200         |
		  -----------------------------------------------------------
			"""
		);
		
		System.out.print("Enter preferred option: "); 
		int pizzaTypeMenu = receiver.nextInt();
		
		switch (pizzaTypeMenu) {
		
			case 1: System.out.printf("%nYour preferred pizza type : Sapa size\nEnter Number of people : "); 
				numberOfPeople = receiver.nextInt();
				calculateSapaSize(numberOfPeople);break;
			
			case 2: System.out.printf("%nYour preferred pizza type : Small money\nEnter Number of people : "); 
				numberOfPeople = receiver.nextInt();
				calculateSmallMoney(numberOfPeople);break;

			case 3 : System.out.printf("%nYour preferred pizza type : Big boys\nEnter Number of people : "); 
				 numberOfPeople = receiver.nextInt();
				 calculateBigBoys(numberOfPeople);break;

			case 4 : System.out.printf("%nYour preferred pizza type : Odogwu\nEnter Number of people : "); 
				 numberOfPeople = receiver.nextInt();
				 calculateOdogwu(numberOfPeople);break;

			default: System.out.printf("%nInvalid option. Enter option again : "); 
				 displayPizzaTypeMenu();break;

		}
		
	}

	public static int calculateSapaSize(int numberOfPeople){
		
		int sapaSize = 4;
	
		int numberOfBoxes = numberOfPeople / sapaSize;
		int reminder = numberOfPeople % sapaSize;
		if (reminder == 0){
			
			System.out.printf("%nNumber of boxes of pizza to buy = %d boxes" , numberOfBoxes);
			System.out.printf("%nPrice = %,d" , numberOfBoxes * 2000);
		}
		else{	
			int accurateNumberOfBoxes = numberOfBoxes + 1;
			int pizzaSliceReminder = (accurateNumberOfBoxes * sapaSize) - numberOfPeople;

			System.out.printf("%nNumber of boxes of pizza to buy = %d boxes" , accurateNumberOfBoxes);
			System.out.printf("%nNumber left over slice after serving = %d slices" , pizzaSliceReminder);
			System.out.printf("%nPrice = %,d" , accurateNumberOfBoxes * 2000);
		}
		System.out.printf("%n%nThank you for patronizing Iya Afeez Pizza Joint");
		return numberOfPeople;
		
	}
	
	public static int calculateSmallMoney(int numberOfPeople){

		int smallMoney = 6;

		int numberOfBoxes = numberOfPeople / smallMoney;
		int reminder = numberOfPeople % smallMoney;
		if (reminder == 0){

			System.out.printf("%nNumber of boxes of pizza to buy = %d" , numberOfBoxes);
			System.out.printf("%nPrice = %,d" , numberOfBoxes * 2400);
		}
		else {
			int accurateNumberOfBoxes = numberOfBoxes + 1;
			int pizzaSliceReminder = (accurateNumberOfBoxes * smallMoney) - numberOfPeople;

			System.out.printf("%nNumber of boxes of pizza to buy = %d boxes" , accurateNumberOfBoxes);
			System.out.printf("%nNumber left over slice after serving = %d slices" , pizzaSliceReminder);
			System.out.printf("%nPrice = %,d" , accurateNumberOfBoxes * 2400);
		}
		System.out.printf("%n%nThank you for patronizing Iya Afeez Pizza Joint");
		return numberOfBoxes;
		
	}
	
	public static int calculateBigBoys(int numberOfPeople){

		int bigBoys = 8;

		int numberOfBoxes = numberOfPeople / bigBoys;
		int reminder = numberOfPeople % bigBoys;
		if (reminder == 0){
			
			System.out.printf("%nNumber of boxes of pizza to buy = %d boxes" , numberOfBoxes);
			System.out.printf("%nPrice = %,d" , numberOfBoxes * 3000);
		}
		else{
			int accurateNumberOfBoxes = numberOfBoxes + 1;
			int pizzaSliceReminder = (accurateNumberOfBoxes * bigBoys) - numberOfPeople;

			System.out.printf("%nNumber of boxes of pizza to buy = %d boxes" ,accurateNumberOfBoxes);
			System.out.printf("%nNumber left over slice after serving = %d slices" , pizzaSliceReminder);
			System.out.printf("%nPrice = %,d" , accurateNumberOfBoxes * 3000);	
		}
		System.out.printf("%n%nThank you for patronizing Iya Afeez Pizza Joint");
		return numberOfBoxes;
		
	}

	public static int calculateOdogwu(int numberOfPeople){

		int odogwu = 12;

		int numberOfBoxes = numberOfPeople / odogwu;
		int reminder = numberOfPeople % odogwu;
		if (reminder == 0){
			
			System.out.printf("%nNumber of boxes of pizza to buy = %d boxes" , numberOfBoxes);
			System.out.printf("%nPrice = %,d" , numberOfBoxes * 4200);

		}
		else{
			int accurateNumberOfBoxes = numberOfBoxes + 1;
			int pizzaSliceReminder = (accurateNumberOfBoxes * odogwu) - numberOfPeople;

			System.out.printf("%nNumber of boxes of pizza to buy = %d boxes" , accurateNumberOfBoxes);
			System.out.printf("%nNumber left over slice after serving = %d slices" , pizzaSliceReminder);
			System.out.printf("%nPrice = %,d" , accurateNumberOfBoxes * 4200);
		}
		System.out.printf("%n%nThank you for patronizing Iya Afeez Pizza Joint");
		return numberOfBoxes;
		
	}
}

