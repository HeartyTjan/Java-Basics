function displayInfo(number){

		let creditCardNumber = number.replaceAll(" ", "")

	
		console.log("***********************************************************");
			
		console.log(`Credit Card Type : ${getCreditCardType(creditCardNumber)}`);

		console.log(`Credit Card Number : ${number}`);
		
		console.log(`Credit Card Digit Length : ${creditCardNumber.length}`);

		console.log(`Credit Card Validity Status : ${confirmValidity(creditCardNumber)}`);
			
		console.log("***********************************************************");


}


function getCreditCardType(creditCardNumber){

		if (creditCardNumber.startsWith("4"))return "Visa Card";
		if (creditCardNumber.startsWith("5"))return "Master Card";
		if (creditCardNumber.startsWith("37"))return "Visa American Express Cards";
		if (creditCardNumber.startsWith("6"))return "Discover Card";

		return "invalid card";
}

function confirmValidity(creditCardNumber){

		let status = checkCreditCardValidation(creditCardNumber);

		if(status)return "Valid";
		else return "Invalid";
}


function checkCreditCardValidation(creditCardNumber){
	
		let size = creditCardNumber.length;
		const convertedCardNumber = [];
		let total = 0;

		if (size < 13 || size > 16)return false;

		for(let count = 0; count < size; count++){

			convertedCardNumber[count] = Number(creditCardNumber.charAt(count));
		}

		for(let count = size - 2; count >= 0; count -=2){

			
			let secondDigitValue = convertedCardNumber[count] * 2;		
			
			if(secondDigitValue > 9){ 
				
				let firstNumber = Math.trunc(secondDigitValue / 10 % 10);
				let secondNumber = Math.trunc(secondDigitValue % 10);
			
				let sum = firstNumber + secondNumber;
				

				convertedCardNumber[count] =  sum;		
	
			}

			else convertedCardNumber[count] = secondDigitValue;

			total += convertedCardNumber[count];
		}
		
		for(let count = size - 1; count >= 0; count -=2){
			
			total += convertedCardNumber[count];
			
		}

		if(total % 10 == 0) return true;
		else return false;
}

const prompt = require("prompt-sync")();
cardNumber = Number(prompt("Enter card details : ")); 

displayInfo(cardNumber);