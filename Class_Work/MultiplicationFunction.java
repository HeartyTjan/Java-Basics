public class MultiplicationFunction{

	
	public static void main(String... args){


		System.out.print(getProduct(7,0));
	
	}

	public static int getProduct(int number, int secondNumber){

		if (secondNumber <= 0 ){

			int temp = secondNumber;
			secondNumber = number;
			number = temp;
		}

		if (number < 0 && secondNumber < 0 ){
			
			secondNumber = -secondNumber;
			number = -number;	
		}
		
		int product = 0;
		
		for(int count = 1; count <= secondNumber; count++){

			product += number;
	
		}

		return product;
	}
}