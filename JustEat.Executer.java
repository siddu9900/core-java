class JustEatExecuter{
	public static void main(String args []){
	double priceQuantity = JustEat.search("Fish Kholapuri", 5);
	System.out.println(  "The Price of Fish Kholapuri is "+  priceQuantitys);
	
	priceQuantity = JustEat.search("Panner Masala",2);
	System.out.println( "The Price of Panner Masala  is " + priceQuantity);
	
	priceQuantity = JustEat.search("Jeera Rice",3);
	System.out.println( "The Price of Veg Biriyani is " + priceQuantity);
	
	priceQuantity = JustEat.search("Chicken Biriyani",4);
	System.out.println( "The Price of Chicken Biriyani is " + priceQuantity);
	
	
	}
}