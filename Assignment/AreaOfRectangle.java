public class AreaOfRectangle{
	
	double width = 5.3;
	double height = 8.6;


	public static void main (String [] args){
	
	AreaOfRectangle shapes = new AreaOfRectangle();
	

	double area = shapes.width * shapes.height;
	double perimeter = 2 * (shapes.width + shapes.height);

	System.out.println("The area rectangle is : " + area);
	System.out.printf("The perimeter of rectangle is  : %.2f", perimeter);


    }

}