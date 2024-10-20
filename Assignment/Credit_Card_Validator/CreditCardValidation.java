public class CreditCardValidation{


	

	public void displayInfo(String number){

		String creditCardNumber = number.replace(" ", "");

	
		System.out.printf("%n***********************************************************%n");
			
		System.out.printf("%n Credit Card Type : %s ", getCreditCardType(creditCardNumber));

		System.out.printf("%n%n Credit Card Number : %s " , number);
		
		System.out.printf("%n%n Credit Card Digit Length : %d " , creditCardNumber.length());

		System.out.printf("%n%n Credit Card Validity Status :  %s " , confirmValidity(creditCardNumber));
			
		System.out.printf("%n%n***********************************************************");


	}

	public String getCreditCardType(String creditCardNumber){

		if (creditCardNumber.startsWith("4"))return "Visa Card";
		if (creditCardNumber.startsWith("5"))return "Master Card";
		if (creditCardNumber.startsWith("37"))return "Visa American Express Cards";
		if (creditCardNumber.startsWith("6"))return "Discover Card";

		return "invalid card";
	}

	public String confirmValidity(String creditCardNumber){

		boolean status = checkCreditCardValidation(creditCardNumber);

		if(status)return "Valid";
		else return "Invalid";

	}
	
	public boolean checkCreditCardValidation(String creditCardNumber){

		for (int count = 0; count < len(creditCardNumber); count++){

			if float(creditCardNumber.charAt(count)) throw  new IllegalArgumentException("invalid  input");
		
		}
	
		int size = creditCardNumber.length();
		int [] convertedCardNumber = new int [size];
		int total = 0;

		for(int count = 0; count < size; count++){

			convertedCardNumber[count] = Character.getNumericValue(creditCardNumber.charAt(count));
		}

		for(int count = size - 2; count >= 0; count -=2){

			
			int secondDigitValue = convertedCardNumber[count] * 2;		
			
			if(secondDigitValue > 9){ 
				
				int firstNumber = secondDigitValue / 10 % 10;
				int secondNumber = secondDigitValue % 10;
			
				int sum = firstNumber + secondNumber;
				

				convertedCardNumber[count] =  sum;		
	
			}

			else convertedCardNumber[count] = secondDigitValue;

			total += convertedCardNumber[count];
		}
		
		for(int count = size - 1; count >= 0; count -=2){
			
			total += convertedCardNumber[count];
			
		}

		if(total % 10 == 0) return true;
		else return false;
	}

}