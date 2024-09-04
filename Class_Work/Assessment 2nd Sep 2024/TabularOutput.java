public class TabularOutput{

	public static void main(String... args){

		System.out.println("N	N2	N3	N4");
		
		for(int count = 1; count <= 5; count++){
			
			int square =  count * count;
			int cube = count * count *  count;
			int exponentFour = count * count * count * count;
			

			System.out.printf("%d	%d	%d	%d ",count, square,cube,exponentFour);
			
			System.out.println();
			
			

		}

	}


}