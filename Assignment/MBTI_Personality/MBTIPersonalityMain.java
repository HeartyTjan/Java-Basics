import java.util.Scanner;
public class MBTIPersonalityMain{


	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);
		System.out.print("Please input your name : ");
		String name = receiver.nextLine();
		
		MBTIPersonalityTrait tester = new MBTIPersonalityTrait();
		
		tester.displayQuestion(name);
		
	}

}