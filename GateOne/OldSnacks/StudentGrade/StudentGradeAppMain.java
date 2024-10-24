import java.util.Scanner;
import java.util.InputMismatchException;
public class StudentGradeAppMain{
 
	public static void main (String... args){

		Scanner receiver = new Scanner(System.in);

	        StudentGradeApp tester = new StudentGradeApp();

		int numbeberOfStudent = 0;
		int numbeberOfSubject = 0;
	  	 try{
			System.out.printf("How many student do you have? : ");
			numbeberOfStudent = receiver.nextInt();
		
			System.out.printf("%n%nHow many subject do they offer? : ");
			numbeberOfSubject = receiver.nextInt();
		}catch(InputMismatchException e){

			System.out.print(e);

		}
		System.out.printf("%nSaving >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>%n");

		System.out.printf("%nSaved successfuly%n");

		try{
			 tester.displayStudentScores(numbeberOfStudent,numbeberOfSubject);
		 }catch(Exception e){

			System.out.print(e);
		}

	}
}
