class FoodPandaExecuter{
	public static void main(String args []){
		
	double priceQuantity = FoodPanda.search("Kaju Kurma",5);
	System.out.println(  "The Price of Kaju Kurma is  "+  priceQuantity);
	
	priceQuantity = FoodPanda.search(" Fish Tava Fry",4);
	System.out.println( "The Price of Fish Tava fry " + priceQuantity);
	
	priceQuantity = FoodPanda.search(" Veg Biriyani",6);
	System.out.println( "The Price of Veg Biriyani is " + priceQuantity);
		}
}