def check_card_validity(credit_card_number):

	try:
		credit_card_number = credit_card_number.replace(" ", "")

		convertedCardNumber = []

		total = 0

		for index in range(0,len(credit_card_number)):
	
			num = int(credit_card_number[index])
			convertedCardNumber.append(num)

		for count in range(len(convertedCardNumber)-2,-1,-2):
	
			second_digit_value = convertedCardNumber[count] * 2
		

			if second_digit_value > 9:
			
				first_number = second_digit_value // 10 % 10
			
				second_number = second_digit_value % 10
			
				summation = first_number + second_number

				convertedCardNumber[count] = summation

			else :
				convertedCardNumber[count] = second_digit_value
			
		for number in convertedCardNumber:
		
			total += number
	
		if total % 10 == 0:
			return "Valid"
		
		else:
			return "Invalid"
	
	except:
		
		raise ValueError

		
def get_credtit_card_type(credit_card_number):
	
	if credit_card_number.startswith("4"):

		return "Visa Card"

	elif credit_card_number.startswith("5"):

		return "Master Card"

	elif credit_card_number.startswith("37"):

		return "Visa American Express Card"

	elif credit_card_number.startswith("6"):

		return "Discover Card";
		
	else : 
		return "Invalid Card Number"

def display_info(card_number):
	
	credit_card_number = card_number.replace(" ", "")

	print("""
		  Credit Card Information 
=================================================================
	""")
	print(f"Credit Card Type : {get_credtit_card_type(credit_card_number)}")
	print()
	print(f"Credit Card Number : {card_number}")
	print()
	print(f"Credit Card Digit Length : {len(credit_card_number)}")
	print()
	print(f"Credit Card Validity Status : {check_card_validity(credit_card_number)}")
	
	print("================================================================")






