class   Spotify{
 String songNames [] = new String [11];
 int index;
 
 
  boolean addSongs(String songs){
    boolean isAdded = false;
	  if(songs!=null){
		  songNames[index] = songs;
		  index++;
		  isAdded =  true;
		  
	  }
	  
	  return isAdded;
  
  
  }
  
  
	public void getSongs (){
		for(int index=0; index < songNames.length; index++){
			System.out.println(songNames[index]);
			
		}
	}

}