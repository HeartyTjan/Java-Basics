public class ArrayPractice{

	public static void main(String... args){
	
		
		// first question
		int[] r = {1,10,9,7,75,43,6,21,34,54,72};
	
		System.out.println("The tenth element of array r is : " + r[9]);
		System.out.println();

		// second question
		int[] g = {-1,-1,-1,-1,-1,-1};

		System.out.println();

		// third question
		double[] c = new double[200];

		int count=0;
		
		System.out.printf("%s%20s%n", "index", "Float Numbers");
		
		while (true){
	
		
			c[count]= Math.random() * 100;

			System.out.printf("%4d%18.2f%n", count, c[count]);
			
			count++;
			
			if (count == 100){

				double max = c[count];

				for(double a : c){
					if(a > max) max=a;
				}
				System.out.printf("This is maximum floating number of array c: %.2f" , max);break;

		
			}

		}
		
		// fourth question

	
		
	






























		
	}

}