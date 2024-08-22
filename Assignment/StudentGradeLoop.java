import java.util.Scanner;

public class StudentGradeLoop{
	
	public static void main (String... args){

		Scanner input = new Scanner(System.in);
	
		int passed = 0;
		int failed = 0;
		int passMark = 50;

		for ( int count = 1; count <= 10; count++ ){

			System.out.printf("%nEnter student grade : ");
			int studentGrade = input.nextInt();

			if( studentGrade >= 50) {
				System.out.printf("Student Passed%n"); 
				passed++;
			}
			else {
				System.out.printf("Stundent Failed%n"); 
				failed++;
			}
		

		}

		System.out.printf("%nTotal No of Student that passed : %d", passed);
		System.out.printf("%nTotal No of Student that failed : %d", failed);

  	}

}

