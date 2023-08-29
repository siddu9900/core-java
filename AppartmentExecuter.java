class AppartmentExecuter{
	
	public static void main (String args []){
		
	//class Name . reference = new className();
	Appartment appartment = new Appartment();
	appartment.appartmentName = "Pristige";
	appartment.appartmentId = 1;
	appartment.location = "WhiteFeild";
	appartment.noOfFloor = 45;
	appartment.noOfTwoBhk = 180;
	appartment.noOfThreeBhk = 160;

	
		System.out.println("The appartment have name is "+appartment.appartmentName);
		System.out.println("The appartment Id is " + appartment.appartmentId);
		System.out.println("The appartment location is "+appartment.location);
		System.out.println("The No .of Floor in Appartment is " + appartment.noOfFloor);
		System.out.println("The No. of Two BHK are......,,,,,,  " + appartment.noOfTwoBhk);
		System.out.println("The No. of Three BHK are,,,........ "+appartment.noOfThreeBhk);
		
			appartment.provideAccomadation();
	}
	

}