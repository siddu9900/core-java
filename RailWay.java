public class RailWay{

 private int railWayId;
 private String name;
 private String location;
 private int noOfPlatForm;
 private String destination;
 
 
	public void setRailWayId(int railWayId){
		this.railWayId =railWayId;
	}
	
		public int getRailWayId(){
			return railWayId;
		}
		
				public void setName(String name){
					this.name =name;
				}
				
				public String getName(){
					return name;
				}
				
		public void setLocation(String location){
			this.location =location;
			
		}
		
		public String getLocation(){
			return location;
		}
		
		
				public void setNoOfPlatForm(int noOfPlatForm){
					this.noOfPlatForm = noOfPlatForm;
				}
				
				public int getNoOfPlatForm(){
					return noOfPlatForm;
				}
				
				
		public void setDestination(String destination){
			this.destination = destination;
		}
		
		public String getDestination(){
			return destination;
		}
		
		
}