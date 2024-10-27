public class Cart{

	private int pieces;
	private double price;
	private String productName;


	public Cart(String productName, int pieces,double price){

		this.productName = productName;

		this.pieces = pieces;

		this.price = price;

	}

	public int getPieces(){

		return pieces;

	}

	public double getPrice(){

		return price;

	}

	public String getProductName(){

		return productName;
	}


}