import java.util.Scanner;
public class TranslateStringToNumber{

	public static void main(String... args){
		
		Scanner receiver = new Scanner(System.in);

		System.out.print("Enter phone number :");
		String phoneNumber  = receiver.nextLine();
	
		System.out.print("Converted Number : ");
	
		for (int count = 0; count <= phoneNumber.length()-1; count++){

			char word = phoneNumber.charAt(count);
			
			System.out.printf("%d ", displayCorrespondingNumber(word)); 
		} 


	}
	
	public static int displayCorrespondingNumber(char letter){

		char word = Character.toLowerCase(letter);

		
		int number = 0;

		if(word == '0') number = 0;
		if(word == '1') number = 1;
		else if(word >= 'a' && word < 'd' || word =='2') number = 2;
		else if(word >= 'd' && word < 'g' || word =='3') number = 3;
		else if(word >= 'g' && word < 'j' || word =='4' ) number = 4;
		else if(word >= 'j' && word < 'm' || word =='5') number = 5;
		else if(word >= 'm' && word < 'p' || word =='6') number = 6;
		else if(word >= 'p' && word < 't' || word =='7') number = 7;
		else if(word >= 't' && word < 'w' || word =='8') number = 8;
		else if(word >= 'w'|| word =='9') number = 9;
		
		
		return number;
	}

}