import java.util.Scanner;

public class StudentGradeApp{

	static Scanner receiver = new Scanner(System.in);

	public void displayStudentScores(int numberOfStudent, int numberOfSubject){

		int[][] studentGrades = collectStudentScore(numberOfStudent, numberOfSubject);
		
		int[] totalOfEachStudent = getTotalForEachStudent(studentGrades);

		int[] sortedTotal = sortTotal(totalOfEachStudent);

		double [] averageofEachStudent =  getAverageforEachStudent(totalOfEachStudent,studentGrades);
		
		System.out.printf("%n=========================================================================");

		System.out.printf("%nSTUDENT%8s", " ");
		for(int count = 0; count < numberOfSubject; count++){
	
			System.out.printf("SUB%d\t", count+1);
		}

		System.out.printf("%s\t%s\t%s", "TOT","AVG","POS");
		System.out.printf("%n=========================================================================");

		int pos = 0;
		for(int student = 0; student <studentGrades.length; student++){

			System.out.printf("%nStudent %d", student+1);


			for(int subjects = 0; subjects < studentGrades[student].length; subjects++){

				System.out.printf("%9d", studentGrades[student][subjects]);

			}

			System.out.printf("%7d",totalOfEachStudent[student]);
			System.out.printf("%9.2f",averageofEachStudent[student]);
				
			//int pos = 0;
			for(int count = 1; count < totalOfEachStudent.length; count++){

				if(totalOfEachStudent[student] > totalOfEachStudent[count]) {
					
					pos = student + 1; 	
				}
			}
			System.out.printf("%10d", pos);
			System.out.println(" ");
			
			
		}

		System.out.printf("%n=========================================================================");
		System.out.printf("%n=========================================================================");


		System.out.printf("%nSUBJECT SUMMARY%n");
		
		int[] highestAndLowest = new int [2];
		int[][] passAndFail = new int[numberOfSubject][2];
		for (int subject = 0 ; subject < studentGrades[0].length; subject++){

			int largest = studentGrades[0][subject];
			int smallest =  studentGrades[0][subject];
			int totalPerSubject = 0;
			double averagePerSubject = 0;
			int pass = 0;
			int fail = 0;
			System.out.printf("%nSubject %d%n", subject+1);
			
			for(int count = 0 ; count < studentGrades.length; count++){

				totalPerSubject += studentGrades[count][subject];
				
				if (studentGrades[count][subject] > 50 && studentGrades[count][subject] <= 100) pass++;
				else if (studentGrades[count][subject] < 50 && studentGrades[count][subject] >=0 ) fail++; 

				if (studentGrades[count][subject] > largest) largest = studentGrades[count][subject];
				if (studentGrades[count][subject] < smallest)smallest = studentGrades[count][subject];
			}

			  passAndFail[subject][0] = pass;
			  passAndFail[subject][1] = fail;
			  
			  

			  averagePerSubject = (double)totalPerSubject / studentGrades.length;

			  System.out.printf("%nHighest scoring student is : %d%n", largest);
			  System.out.printf("%nLowest scoring student is : %d%n", smallest);
			  System.out.printf("%nTotal score  is  : %d%n", totalPerSubject);
			  System.out.printf("%nAverage score  is  : %.2f%n", averagePerSubject);
			  System.out.printf("%nNumber of pass is  : %d%n", pass);
			  System.out.printf("%nNumber of fail  is  : %d%n", fail);
			
		}

		System.out.printf("%n=========================================================================");
		System.out.printf("%n=========================================================================");

		int highestFail =  passAndFail[0][1];
		int highestPass = passAndFail[0][0];

		for(int subject = 0; subject <passAndFail[0].length; subject++){


			if(passAndFail[subject][0] > highestPass) highestPass = passAndFail[subject][0];

			if(passAndFail[subject][1] > highestFail) highestFail = passAndFail[subject][1];

		}
		for (int count  = 0; count < passAndFail[0].length; count++){

		    if(passAndFail[count][1] == highestFail)System.out.printf("%nThe hardest Subject is Subject %d with %d failures", count+1, passAndFail[count][1]);
		    if(passAndFail[count][0] == highestPass)System.out.printf("%nThe easiest Subject is Subject %d with %d passes", count+1, passAndFail[count][0]);

		}
		  

		int highest = studentGrades[0][0];
		int lowest = studentGrades[0][0];
		
		for(int student = 0; student < studentGrades.length; student++){



			for(int subject = 0; subject < studentGrades[0].length; subject++){


					if(studentGrades[student][subject] > highest)highest = studentGrades[student][subject];
					if (studentGrades[student][subject] < lowest) lowest = studentGrades[student][subject];

					
			}
			highestAndLowest[0]= highest;
			highestAndLowest[1]= lowest;
			
		}

		for(int student = 0; student < studentGrades.length; student++){

			for(int subject = 0; subject < studentGrades[0].length; subject++){

		        	if (studentGrades[student][subject] == highestAndLowest[0]){
					System.out.printf("%nThe overall Highest score is scored by Student %d in Subject %d scoring %d ", 
							student+1,subject+1,highestAndLowest[0]);
	
				}

				else if (studentGrades[student][subject] == highestAndLowest[1]) 
					System.out.printf("%nThe overall Lowest score is scored by Student %d in Subject %d scoring %d ", 
						student+1,subject+1,highestAndLowest[1]);
						 				
			}
						
		}
		System.out.printf("%n=========================================================================");

			System.out.printf("%nCLASS SUMMARY%n");
		
		System.out.printf("%n=========================================================================%n");
			
			for(int student = 0; student < studentGrades.length; student++){

				int totalPerSubject = 0;

				for(int subject = 0; subject < studentGrades[0].length; subject++){

					totalPerSubject += studentGrades[student][subject];

				}
			
				if(totalPerSubject == sortedTotal[0])System.out.printf("%nBest Graduating Student is : Student %d Scoring %d%n", student+1, totalPerSubject);
				
				
			}
		 
		System.out.printf("%n=========================================================================%n%n");
	
		System.out.printf("%n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!%n%n");

			for(int student = 0; student < studentGrades.length; student++){

				int totalPerSubject = 0;

				for(int subject = 0; subject < studentGrades[0].length; subject++){

					totalPerSubject += studentGrades[student][subject];

				}
			
				if(totalPerSubject == sortedTotal[studentGrades.length-1])System.out.printf("%nWorst Graduating Student is : Student %d Scoring %d%n", 
					student+1, totalPerSubject);
			
			}	
				
		System.out.printf("%n!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!%n%n");


		System.out.printf("%n=========================================================================%n%n");

			int classTotal = 0;
			double average = 0;
			for(int total : sortedTotal){

				classTotal  += total;

			}

			average = (double)classTotal / studentGrades.length;

			System.out.printf("Class Total is : %d%n", classTotal);
			System.out.printf("%nClass Average is : %.2f%n", average);

		System.out.printf("%n=========================================================================%n%n");
	}


	public int[][] collectStudentScore(int numberOfStudent, int numberOfSubject){

		int [] [] studentGrades = new int [numberOfStudent][numberOfSubject];
		int score = 0;

		try{	
			for(int student = 0; student < studentGrades.length; student++){
				for(int subject = 0; subject < studentGrades[student].length; subject++){
				
				
				
					do{
						
					   
					     System.out.printf("%nEntering score for student %d%n", student + 1);
					     System.out.printf("Enter score for subject %d : ", subject + 1);
				             score = receiver.nextInt();
					     
	
						if (score < 0 || score > 100) System.out.printf("Enter a valid score%n");
		
					} while(score < 0 || score > 100);

				
					if (score >= 0 && score <=100)studentGrades[student][subject] = score;
				}

			}
		} catch(ArrayIndexOutOfBoundsException e){
	
			System.out.print("Out of bound");
		}

		return studentGrades;

		
	}


	public int[] getTotalForEachStudent(int[][] studentGrades){

		int [] totals = new int [studentGrades.length];
		int count = 0;
		for(int[] scores : studentGrades){

			for(int score : scores){
	
				totals[count] += score;


			}

			count++;
		}
		return totals;
	
	}

	public double[] getAverageforEachStudent(int[] totals,int [][] studentGrades){

		double [] averages = new double [totals.length];
	
		int count = 0;
		for(int total : totals){

			averages[count] = (double)total / studentGrades[count].length;
				
			count++;

		 }
		return averages;

	}
	
	
	public static int [] sortTotal(int [] totals){

	  
		for(int index = 0; index < totals.length; index++){

			for(int count = 0; count < totals.length; count++){

				if (totals[count] < totals[index]){

					int temp = totals[count];
					totals[count] = totals[index];	
					totals[index] = temp;
				
				}
			}

		}
  		return totals;
	 }
}






