public class PostOffice{

	private int id;
	private String name;
	private String timingOfOpening;
	private int price;
	private String location;
	
	
		public void setId(int id){
			this.id = id;
		}
		
		public int getId(){
			return id;
		}
		
				public void setName(String name){
					this.name =name;
				}
				public String getName(){
					return name;
				}
				
	public void setTimingOfOpening(String timingOfOpening){
		this.timingOfOpening = timingOfOpening;
	}
	
	
	public String getTimingOfOpening(){
		return timingOfOpening;
	}
	
	public void setPrice(int price){
		this.price = price;
	}
	
			public int getPrice(){
				return price;
			}
			
	public void setLocation(String location){
		this.location = location;
	}
	
	public String getLocation(){
		return location;
	}
}