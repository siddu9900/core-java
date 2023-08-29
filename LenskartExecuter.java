class LenskartExecuter{

	public static void main(String args []){
		Lenskart siddu = new Lenskart();
		siddu.shape = "Triangle";
		siddu.state = "Karnatak";
		siddu.color = "Black";
		siddu.price = 1200;
		siddu.location = "Electronic City";
		siddu.Id = 1;
		siddu.material = "Plastic";
		
			System.out.println("The shape  " + siddu.shape);
			System.out.println("The shape  " + siddu.state);
			System.out.println("The color of Lenskart is ............... " + siddu.color);
			System.out.println("The price------------- " + siddu.price);
			System.out.println("The location of Lenskart is ............ " +siddu.location);
			System.out.println("The Price of Lenskart is ------------ " + siddu.Id);
			System.out.println("The Material as used in lenskart is ----------- " + siddu.material);
			
			siddu.producedProduct();
	
	
	
	
	
	
	
	}
}