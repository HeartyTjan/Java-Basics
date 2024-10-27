import unittest
import creditcardvalidator


class TestCreditCardValidator(unittest.TestCase):

	def test_if_check_card_validity_function_exist(self):
		creditcardvalidator.check_card_validity("5126271818282")

	def test_check_card_validity_function_return_expected_output(self):	
		value = "Valid"
		self.assertTrue(value,creditcardvalidator.check_card_validity("5199110824684028")) 

	def test_check_card_validity_raises_error_for_float_value(self):
		self.assertRaises(ValueError,creditcardvalidator.check_card_validity,("51991108.02468402.18"))

	def test_check_card_validity_raises_error_for_String_with_space(self):
		value = "Valid"
		self.assertTrue(value,creditcardvalidator.check_card_validity("5199 1108 2468 4028")) 

	def test_if_get_credtit_card_type_function_exist(self):
		creditcardvalidator.get_credtit_card_type("5199 1108 2468 4028")
		
	def test_get_credtit_card_type_function_return_expected_result(self):
		self.assertEqual(creditcardvalidator.get_credtit_card_type("5199 1108 2468 4028"), "Master Card")
		self.assertEqual(creditcardvalidator.get_credtit_card_type("37199 1108 2468 4028"), "Visa American Express Card")
		self.assertEqual(creditcardvalidator.get_credtit_card_type("8199 1108 2468 4028"), "Invalid Card Number")
		self.assertEqual(creditcardvalidator.get_credtit_card_type("S199 1108 2468 4028"), "Invalid Card Number")

	
	


	


	