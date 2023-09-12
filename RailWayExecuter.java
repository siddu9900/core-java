public class RailWayExecuter{

	public static void main(String args []){
	
	 RailWay train = new RailWay();
	  train.setRailWayId(2);
	  train.setName("Channamma Express");
	  train.setLocation("Banglore");
	  train.setNoOfPlatForm(60);
	  train.setDestination("Bagalakot");
	  
	  
		System.out.println("The RailWay Id is " + train.getRailWayId());
		System.out.println("The trian Name is " + train.getName());
		System.out.println("The Location is " + train.getLocation());
		System.out.println("The No Of Location is " + train.getNoOfPlatForm());
		System.out.println("The Destination is " + train.getDestination());
	  
	}

}