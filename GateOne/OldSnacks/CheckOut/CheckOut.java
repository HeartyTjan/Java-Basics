import java.util.ArrayList;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.InputMismatchException;

public class CheckOut{

	private static ArrayList<Cart> carts = new ArrayList<>();
	private static String customerName;
	private static String cashierName;
	boolean status;

	static Scanner receiver = new Scanner(System.in);

	public static void main(String...args){
	
		System.out.print("What is the customer name? :");
		customerName = receiver.nextLine();

		CheckOut checkOut = new CheckOut();
		checkOut.displayInfo();

	}
	
	public void displayInfo(){

		shoppingCart();
	
		if(status){

			displayLine();

			displayCompanyDetails();

			displayLine();

			paymentDetailsOfficialCopy();
		
			paymentDetailsCustomerCopy();
		
		}

	}
	public void shoppingCart(){

		status = true;
		
		try{

			String response = "yes";

			while(response.equals("no") == false){

				System.out.printf("%nWhat did the user buy? : ");
				String productName = receiver.next();

				System.out.printf("%nHow many pieces? : ");
				int pieces = receiver.nextInt();
		
				System.out.printf("%nHow much per unit? : ");
				double amount = receiver.nextDouble();
	
				Cart item = new Cart(productName,pieces,amount);

				carts.add(item);
			
				System.out.printf("%nAdd more item? : ");
				response = receiver.next().toLowerCase();
			
	
			}
			receiver.nextLine();

			System.out.printf("%nWhat is your name? :");
			cashierName = receiver.nextLine();

		 }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			status = false;
		}

	}

	public void paymentDetailsCustomerCopy(){

	  	try{

			System.out.printf("%nHow much did the customer give to you? : ");
			double customerPayment = receiver.nextDouble();

			System.out.printf("%16s%15s%15s%15s", "ITEM","QTY","PRICE","TOTAL(NGN)");

			System.out.printf("%n%n-----------------------------------------------------------------%n%n");

		 	double subTotal = 0;
			double total = 0;
			for(Cart product : carts){

		      	total = product.getPieces() * product.getPrice();
		      	subTotal += total;
		      	System.out.printf("%n%16s%15d%,15.2f%,15.2f", product.getProductName(),
				product.getPieces(),product.getPrice(),total);

			}

			System.out.printf("%n%n-----------------------------------------------------------------%n%n");

			double discount = subTotal * 0.08;
			double valueAddedTax = subTotal * 0.175;
			System.out.printf("%35s : %,13.2f", "Sub Total", subTotal);
			System.out.printf("%n%n%35s : %,13.2f", "Discount",discount);
			System.out.printf("%n%n%35s : %,13.2f", "VAT @ 17,50%", valueAddedTax);

			displayLine();
	
			double billTotal = subTotal - discount + valueAddedTax;
			System.out.printf("%35s : %,13.2f", "Bill Total", billTotal);
			System.out.printf("%n%n%35s : %,13.2f", "Amount Paid", customerPayment);
			System.out.printf("%n%n%35s : %,13.2f", "Balance", customerPayment - billTotal);

			displayLine();

			System.out.printf("%15s", "THANK YOU FOR YOUR PATRONAGE");

			displayLine();

		 }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		}

		
	}
	public void paymentDetailsOfficialCopy(){
	
		try{

			System.out.printf("%16s%15s%15s%15s", "ITEM","QTY","PRICE","TOTAL(NGN)");

			System.out.printf("%n%n-----------------------------------------------------------------%n%n");

		 	double subTotal = 0;

			double total = 0;
			
			for(Cart product : carts){

		      		total = product.getPieces() * product.getPrice();
		      		subTotal += total;

		      		System.out.printf("%n%16s%15d%,15.2f%,15.2f", product.getProductName(),
						product.getPieces(),product.getPrice(),total);

			}

			System.out.printf("%n%n-----------------------------------------------------------------%n%n");

			double discount = subTotal * 0.08;
			double valueAddedTax = subTotal * 0.175;
			System.out.printf("%35s : %,13.2f", "Sub Total", subTotal);
			System.out.printf("%n%n%35s : %,13.2f", "Discount",discount);
			System.out.printf("%n%n%35s : %,13.2f", "VAT @ 17,50%", valueAddedTax);

			displayLine();
	
			double billTotal = subTotal - discount + valueAddedTax;
			System.out.printf("%35s : %,13.2f", "Bill Total", billTotal);

			displayLine();

			System.out.printf("THIS IS NOT AN RECEIPT KINDLY PAY %,.2f", billTotal);

			displayLine();

		 }catch(InputMismatchException e){
			
			System.out.print("Integer Value Expected");
			
		}catch(ArrayIndexOutOfBoundsException e){
			
			System.out.print("Out of Bound");
		}


	}

	public void displayCompanyDetails(){

		System.out.print("""
			
			SEMICOLON STORES
			
			MAIN BRANCH

			LOCATION: 312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
	
			TEL: 03293828343

		""");
		
		java.util.Date dateAndTime = new java.util.Date();
		System.out.println("        Date :" + dateAndTime);
		System.out.printf("%n%15s : %s" , "Cashier", cashierName);
		System.out.printf("%n%n%21s : %s" , "Customer Name", customerName);	
	

	}


	public void displayLine(){

		System.out.printf("%n%n===============================================================%n%n");

	}
	
}