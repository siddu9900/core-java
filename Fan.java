class Fan{
	static boolean isConnected;
	static int minVolume = 5;
	static int currentVolume;
	static int maxVolume ;
	
		public static boolean onOrOff(){
		   System.out.println("The Fan Start onORoff");
			   if(isConnected == false){
				   isConnected = true;
				   System.out.println("THe Fan is get ready to turn............");
			   }
			   
			   else if(isConnected == true){
				        isConnected = false;
						  System.out.println("The Fan is turn off..........");
			   }
			   
			   
		System.out.println("End onOrOff");
			   
			 return isConnected;
		}	

		
		
		public static int increased(){
			if(isConnected == true){
				if(currentVolume < maxVolume){
					currentVolume = currentVolume  + 1;
						System.out.println("The Volume of fan is increased " + currentVolume);
				}
				
				else{
					System.out.println("The Fan speed is maximum Number,.....................");
				}
			}
				
				else{
					System.out.println("Please Turn on your System.................");
				}
			
			
			System.out.println("The End of The increaseing ..........................");
			return currentVolume;
			
		}
		
		         public static int  decreased(){
				    System.out.println(" The start of fan DecresingS...........");
					
							if(isConnected == true){
								if(currentVolume > minVolume){
									   currentVolume = currentVolume -1;
									   System.out.println("The fan is decreased." +currentVolume);
								}
					


else{
	System.out.println("The speed of fan is ");
}
}

else{
	System.out.println("The please turn on your fan...............");
	
}

    System.out.println("The End of Decr..............");
return currentVolume;


					
						
							}
		
		
		
		
}