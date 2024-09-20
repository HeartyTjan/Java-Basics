public class PalindromicPrime{


	public static int isPalindromicPrime(int numberOfPalindromicPrime){

		int count = 0;
		int number = 2;
	
		while(number <= numberOfPalindromicPrime ){
			if (isPalindrome(number)) {
				
				if(isPrime(number)){

					System.out.printf("%d  ", number);
					count++;
				
					if (count == 10)System.out.println();
				}
			}
		
			number++;
		}

		return number++;
	}
	
	public static boolean isPalindrome(int number){

		int original_number = number;

		int reverse = 0;

		while(number != 0){

			reverse = reverse * 10 + number % 10;
			number = number / 10;
		}

		return original_number == reverse ? true : false;	
	}

	public static int printPrimeBetweenNumber(int numberOfPrime){

		int counter =0;
		int number = 2;

		for(int count =1; count < numberOfPrime; count++){ 

			if (isPrime(number)) {

				counter++;
				System.out.printf("%d  ", number);
			}
			number++;

		}
		return number;	
	}

	public static int printPrimeNumber(int numberOfPrime){

		int count =0;
		int number = 2;

		while(count <= numberOfPrime){

			if (isPrime(number)) {

				count++;
				System.out.printf("%d  ", number);
			}

			number++;

		}

		return number;	
	}

	public static boolean isPrime(int number){
		
		int factor = 0;
		int count = 0;
		for (count = 1; count <= number; count++){

			if(number % count ==0)factor++;

		}

		if(factor != 2) return false;
		else return true;	
	}
}