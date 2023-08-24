class Microwave{

   static  boolean isConnected;
   static int maxVolume=7;
   static int currentVolume;
   static int minVolume;
   
   
  public static boolean onOroff(){
	  
  System.out.println("Start of onOroff");
  
  if(isConnected==false){
	  isConnected=true;
	  System.out.println("System Turned On.....");
                                     }
									 
  else if(isConnected==true){
	  isConnected=false;
	  System.out.println("System Turned Off......");
                                          }
										  
  System.out.println("End of onOroff");
  return isConnected;
     }
															   
								public static int increaseVolume(){
									
								System.out.println("Start Of Increasing Temperature..............");
									
									if(isConnected==true){
										
										if(currentVolume<maxVolume){
											currentVolume=currentVolume+1;
											System.out.println("Your System Temperature is Increased To  " + currentVolume);
										        }
										else{
											System.out.println("You Are Reached Maximum Temperature.............");
										       }
										                              }
								      else{
										  System.out.println("Please Turned On Your Device");
									        }	
											
                                 System.out.println("End Of Increasing Temperature............");		
                                 return currentVolume;							 
								                                                }							   
															   
															   public static int decreaseVolume(){
																   
																   System.out.println("Start Of Decreasing Temperature........");	
																   
																   if(isConnected==true){
																	   
																	   if(currentVolume>minVolume){
																		   currentVolume = currentVolume-1;
																		   System.out.println("Temperature is Decreased To  " + currentVolume);	
																	                                               }
																		else{
																			System.out.println("You Are Reached Minimum Temperature.............");	
																		       }
																             }
																									
																	else{
																	System.out.println("Please Turned On Your Microwave.........");
																		}
																   	   
																   System.out.println("End Of Decreasing Temperature...........");	
																   return currentVolume;
															                                                    }							   

}