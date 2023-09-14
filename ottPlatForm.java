class ottPlatForm{
	String movieNames[] = new String [4];
	 int index;
	 
	 
  // creat / add / save
	public boolean addMovieName(String movieName){
				boolean isAdded = false;
				
		 if(movieName!= null){
			 movieNames[index] = movieName;
			 index++;
			 isAdded = true;
		 }
		 
		 return isAdded;
	}
	
	
	//Read 
	
			public void getMovies(){
				for(int index = 0; index < movieNames.length; index++){
					System.out.println(movieNames[index]);
					
				}
				
			}


}





























