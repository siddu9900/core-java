class CricketTeams{

	static String cricketTeams [] = {"India", "Australia", "Pakistan", "Bangladesh", "England", "Sri Lanka", "South Africa", "New Zwaland" , "Wst Indies", "Afghanistan"};
	static int num [] = {1,2,3,4,5,6,7,8,9,10};
	
		public static void main (String args []){
		
		
		/*System.out.println(cricketTeams[0]);
		System.out.println(cricketTeams[1]);
		System.out.println(cricketTeams[2]);
		System.out.println(cricketTeams[3]);
		System.out.println(cricketTeams[4]);
		System.out.println(cricketTeams[5]);
		System.out.println(cricketTeams[6]);
		System.out.println(cricketTeams[7]);
		System.out.println(cricketTeams[8]);
		System.out.println(cricketTeams[9]);*/
		
		
		
		
		
			for(int index=0; index < cricketTeams.length; index++){
				System.out.println( num[index]  +  "      " +  cricketTeams[index] );
			
			}
			
				for(int index =cricketTeams.length - 1; index>=0; index--){
					System.out.println( num[index] + "  " + cricketTeams[index]);
				
				
			}
		
		
		
		
		
		
		
		}





}