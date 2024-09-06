import java.util.Scanner;
public class ChristmasSong{

	public static void main(String [] args){
	
		Scanner receiver = new Scanner(System.in);

		String mainSong = """
			
				12 Days of Christmas
			=====================================
			 1 --> A patridge in a pear tree
			 2 --> Two Turtle Doves
			 3 --> Three French Hens
			 4 --> Four Calling Birds
			 5 --> Five Golden Rings
			 6 -->  Six Gesse a-Laying
			 7 --> Seven Swans a-Swimming
			 8 --> Eight Maids a-Milking
			 9 --> Nine Ladies Dancing
			 10 --> Ten Lords a-Leaping
			 11 --> 11. Eleven Pipers Piping
			 12 --> Twelve Drummers Drumming
			=====================================
			""";

		System.out.print(mainSong);
		
		System.out.print("Enter prefered option :");
		int user_option = receiver.nextInt();
	
		switch (user_option) {

			case 1 : System.out.print("""
					On the first day of Christmas, my true love gave to me
					A Partridge in a Pear Tree

					"""); break;


			case 2 : System.out.print("""
					On the second day of Christmas, my true love gave to me
					Two turtle doves,
					And a partridge in a pear tree

					"""); break;
			
			case 3 : System.out.print("""
					On the third day of Christmas, my true love gave to me...
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree.

					"""); break;
			case 4 : System.out.print("""
					On the fourth day of Christmas, my true love gave to me...
					Four calling birds,
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree.
				
					"""); break;

			case 5 : System.out.print("""
					On the fifth day of Christmas, my true love gave to me...
					Five golden rings,
					Four calling birds,
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree.

					"""); break;

			case 6:	System.out.print("""
					On the sixth day of Christmas, my true love gave to me...
					Six geese a-laying,
					Five golden rings,
					Four calling birds,
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree.

					"""); break;		
			
			case 7 : System.out.print("""
					On the seventh day of Christmas, my true love gave to me...
					Seven swans a-swimming,
					Six geese a-laying,
					Five golden rings,
					Four calling birds,
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree.

					"""); break;

			case 8 : System.out.print("""
					On the eighth day of Christmas, my true love gave to me...
					Eight maids a-milking,
					Seven swans a-swimming,
					Six geese a-laying,
					Five golden rings,
					Four calling birds,
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree.

					"""); break;

			case 9 : System.out.print("""
					On the ninth day of Christmas, my true love gave to me...
					Nine ladies dancing,
					Eight maids a-milking,
					Seven swans a-swimming,
					Six geese a-laying,
					Five golden rings,
					Four calling birds,
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree

					"""); break;

			case 10 : System.out.print("""
					On the tenth day of Christmas, my true love gave to me...
					Ten lords a-leaping,
					Nine ladies dancing,
					Eight maids a-milking,
					Seven swans a-swimming,
					Six geese a-laying,
					Five golden rings,
					Four calling birds,
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree...

					""");break;

			case 11 : System.out.print("""
					On the eleventh day of Christmas, my true love gave to me...
					Eleven pipers piping,
					Ten lords a-leaping,
					Nine ladies dancing,
					Eight maids a-milking,
					Seven swans a-swimming,
					Six geese a-laying,
					Five golden rings,
					Four calling birds,
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree.

					""");break;
			
			case 12 : System.out.print("""
					On the twelfth day of Christmas, my true love gave to me...
					Twelve drummers drumming,
					Eleven pipers piping,
					Ten lords a-leaping,
					Nine ladies dancing,
					Eight maids a-milking,
					Seven swans a-swimming,
					Six geese a-laying,
					Five golden rings,
					Four calling birds,
					Three French hens,
					Two turtle doves,
					And a partridge in a pear tree.

					""");









		}
	

			 
	}



}