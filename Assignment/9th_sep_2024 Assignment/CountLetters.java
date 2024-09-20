public class CountLetters{

	public static void main(String... args){
		
		countLetters("tijani");


	}

	public static int countLetters(String letters){

		int length = letters.length();
		System.out.print("The total count is : " + length);
		
		return length;
	}


}