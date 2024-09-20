public class DecreasingSortedNumber{

	public static void main(String... args){


		displaySortedNumber(30,90,60);
	}

	public static void displaySortedNumber(int num1,int num2,int num3){
		
		int sum = num1 + num2 + num3;

		int highest = num1;
		int smallest = num1;
	
		if (num2 > num1) highest = num2;
		if (num3 > highest) highest = num3;
		
		
		if (num2 < num1) smallest = num2;
		if (num3 < smallest) smallest = num3;

		int high = sum - highest - smallest;

		System.out.printf("%d \n%d \n%d",highest, high ,smallest);
		
	}

}