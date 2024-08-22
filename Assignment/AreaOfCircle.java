public class AreaOfCircle{
	
	
	public static void main (String [] args){

	double radius = 6.5;
	
	double pie = 3.14159;

	double perimeter = 2 * (radius * pie);

	double area = (radius * radius) * pie;
	
	System.out.printf("The perimeter of a circle is : %.2f%n%n", perimeter);
	System.out.printf("The area a circle is : %.2f%n", area);

      }

}