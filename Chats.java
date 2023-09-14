class Chats{
	String chatsNames[] = new String [10];
	int index;
	
	
	
		public boolean addChatsNames(String chatsName){
			boolean isAdded = false;
			
			if(chatsName!=null){
				chatsNames[index] = chatsName;
				index++;
				isAdded = true;
				
			}
			
			return isAdded;
			
		}
		
		
			public void getChatsNames(){
				for(int index =0; index<chatsNames.length; index++){
					System.out.println(chatsNames[index]);
				}
				
			}

}