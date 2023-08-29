class FastrackExecuter{

	public static void main(String args []){
	
	//class Name ref = new class name ();
	 Fastrack hand = new Fastrack();
	 hand.brandName = "FastStringBuffer";
	 hand.material = "galss";
	 hand.color = "green";
	 hand.price = 2500;
	 hand.location = "Majestic";
	 hand.function = "Smart Watch";
	 
	 
			System.out.println(hand.brandName);	
			System.out.println(hand.material);
			System.out.println(hand.color);
			System.out.println(hand.price);
			System.out.println(hand.location);
			System.out.println(hand.function);
			
			
			
			hand.takeWatches();
	
	}
}