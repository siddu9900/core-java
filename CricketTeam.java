class CricketTeam{

	String players[] = new String [11];
      int index;
	  
			boolean addPlayerNames(String player){
				boolean isAdded = false;
				
				if(player!=null){
					players[index] = player;
					  index++;
				    isAdded = true;
				
				}
				
				return isAdded;
			}
			
			
				public void getPlayer(){
					for(int index =0; index<players.length; index++){
						System.out.println(players[index]);
					}
				}

}