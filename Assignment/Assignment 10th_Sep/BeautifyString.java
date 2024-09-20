public class BeautifyString{

	
	public static void main(String... args){

		beautifyingString("maleeknery");

	}

	public static void beautifyingString(String letter){

		

		checkForUpperCase(letter);
		
		checkForAndReplaceFullStop(letter);

	}

	public static void checkForUpperCase(String letter){

		StringBuilder convert = new StringBuilder(letter);

		char word = letter.charAt(0);

		if(Character.isLowerCase(word)){
			
			convert.setCharAt(0,Character.toUpperCase(word));
			System.out.print(convert);

		}
		else System.out.print(letter);
		


	}

	public static void checkForAndReplaceFullStop(String letter){

		if (letter.contains(".")){}

		else {

			System.out.print('.');
	
		}
	

	}
}