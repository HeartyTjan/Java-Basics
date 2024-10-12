import java.util.Scanner;
public class MultiDimentionalArray{


	public static void main(String... args){


		Scanner receiver = new Scanner(System.in);

		System.out.print("Enter row : ");
		int row = receiver.nextInt();
		System.out.print("Enter column : ");
		int column = receiver.nextInt();

		int [][] numbers = new int [row][column];
		
		for(int rows = 0; rows < numbers.length; rows++){

			for(int columns = 0; columns < numbers[rows].length; columns++){

				System.out.print("Enter a value: ");

				numbers[rows][columns] = receiver.nextInt();
			
			}


		}

		for(int rows = 0; rows < numbers.length; rows++){

			for(int columns = 0; columns < numbers[rows].length; columns++){

				System.out.print(numbers[rows][columns] + " ");


			
			}


		}


	}



}