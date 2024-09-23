public class BarChartUsingArray{

	public static void main(String... args){

		int[] grades = {87, 68, 65,94, 100, 83, 78, 85, 91, 76, 87};
		
		getGradeCount(grades);

		int[] gradeCount = {0, 0, 0, 0, 0, 0, 2, 2, 4, 2, 1};

		getBarChart(gradeCount);
	
	}

	public static void getGradeCount(int[] array){

		int[] arrayCount = new int [array.length];
		
		for (int count = 0; count < array.length; count++){

			if (array[count] >= 0 && array[count] <= 9) arrayCount[0]++;
			if (array[count] >= 10 && array[count] <= 19) arrayCount[1]++;
			if (array[count] >= 20 && array[count] <= 29) arrayCount[2]++;
			if (array[count] >= 30 && array[count] <= 39) arrayCount[3]++;
			if (array[count] >= 40 && array[count] <= 49) arrayCount[4]++;
			if (array[count] >= 50 && array[count] <= 59) arrayCount[5]++;
			if (array[count] >= 60 && array[count] <= 69) arrayCount[6]++;
			if (array[count] >= 70 && array[count] <= 79) arrayCount[7]++;
			if (array[count] >= 80 && array[count] <= 89) arrayCount[8]++;
			if (array[count] >= 90 && array[count] <= 99) arrayCount[9]++;
			if (array[count] == 100) arrayCount[10]++;
		}
		//return arrayCount;
		
		System.out.printf("Count of each element is : "); 

		for (int value : arrayCount){

			System.out.printf("%d ",value);
		
			
		}
		
		
	}
	
	public static void getBarChart(int[] arrayCount){
		
		System.out.printf("%n%n%s%n%n", "Bar Chart");
		for(int count = 0; count < arrayCount.length; count++){

			if (count == 10) System.out.printf("%d : ", 100);
			else System.out.printf("%02d-%02d:", count * 10, count * 10 + 9 );
			for(int stars = 0; stars < arrayCount[count]; stars++){

				System.out.print("*");
					
			}
			System.out.println();
		}
		
	


	}


}