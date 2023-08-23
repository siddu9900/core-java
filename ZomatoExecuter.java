class ZomatoExecuter{
	public static void main(String args []){
		
	double priceQuantity = Zomato.search("Kushka",4);
	System.out.println(  "The Price of Kushka"+  priceQuantity);
	
	priceQuantity = Zomato.search("pizza");
	System.out.println( "The Price of pizza" + priceQuantity);
	
	}
}