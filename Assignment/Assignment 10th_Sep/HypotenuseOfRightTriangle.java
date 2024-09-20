import java.util.Scanner;
public class HypotenuseOfRightTriangle{

	public static void main(String... args){

		Scanner receiver = new Scanner(System.in);

		System.out.print("Enter side1 : ");
		double side1 = receiver.nextDouble();

		System.out.print("Enter side2 : ");
		double side2 = receiver.nextDouble();

		calculateHypotenuse(side1, side2);
	}


	public static double calculateHypotenuse(double side1, double side2){
		
		double hypotenus = 0;
		
		if(side1 <= 0 || side2 <= 0){
		
			System.out.print("Invalid side");
		}
		else{
	
			double step1 = Math.pow(side1,2) + Math.pow(side2,2);
			hypotenus = Math.sqrt(step1);
			System.out.printf("The hypotenus is : %.1f", hypotenus);
		}
		 return hypotenus;

	}



	
}