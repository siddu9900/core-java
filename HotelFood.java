class HotelFood{
 String menus[]=new String[10];
  int index;
  
  
	public boolean addMenu(String menu){
	 boolean isAdded = false;
	 
	    if(menu!=null){
			menus[index] = menu;
			index++;
			isAdded = true;
			
		}
		
		return isAdded;
	}
	
	
		public void getMenu(){
			for(int index =0; index<menus.length; index++){
				System.out.println(menus[index]);
			}
		}


}