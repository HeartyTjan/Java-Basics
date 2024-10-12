public class CapitalizedSentences{

	public static void main(String... args){


		System.out.print(convertToTittle("stupid is as stupid does"));


	}

	public static String convertToTittle(String sentence){

		
		String [] token = sentence.split(" ");

		int size = token.length;

		String modifiedToken = "";

		String word =" ";
		char letter;

		for(int index = 0; index < size; index++){

			word = token[index];
			letter = word.charAt(0);

			if(!Character.isUpperCase(letter)){

				char convertedLetter = Character.toUpperCase(letter);
		
				token[index] = word.replace(letter,convertedLetter);
			}
		
			modifiedToken += token[index] + " ";
		}
		
		return modifiedToken;
	}

}