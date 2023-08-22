class SuperMarket{
	
     static	String chocolates[] = {"Park", "Snakers", "Five Star", "Bournville", "Mars", 
				                    
									"Milky Way", "Kinder Chocolate", "Copico", "Center Fresh", "Center Fruite", "Chew Chew", "kit kat", "Choco Bud", "Lindit", "choco Bar"};
		
		
	 static String perfumes[] = {"Park Avenu", "Villion", "DJOKR", "VILLAIN", "DOLCE GABBANA", "Cool Water", "Afnan 9pm", "ck", "Nautica voyage", "Danver",
									"Black Opium", "Vanderbilt", "RawVenues", "Sweet Opal", "JustBeyou"};
									
	static  String soaps [] = {"Dove", "Pears", "Lifebouy", "LUX", "Himalaya", "Hamam", "Medimix", "Dettol", "Cinthol", "Pathanjali",
		                            "Santoor", "Nivea", "Guiding Light", "Vivel", "Marseille soap"}; 
									
	static String snacks [] = {"Samosa", "popcorn", "potato chips", "pretzels", "Trai Mix", "cookies", "panipuri", "spiced chickpeas", "papri chaat",
	                               "chatts", "crackers", " Masala peanut", "nuts", "Vadapava", "Mandakki"};			
									
									
	static String vegitables [] = {"Carrot", "Cauliflower", "Asparagus", "Corn", "Cucumber", "Green Papper", "Bell Papper", "Red pepper", "Tomato", "Onion", "Peas", "Zucchini", "Radish", "sweet potato", "Artichoke", "Leek", "Celery", "Chilli"}; 				
									
									
	static String fruits [] = {"Apple", "Banana", "Orange", "Grapes", "Lemon", "Pinapple", "Plum", "pear", "BlackBerry", "Coconut", "Mango", "Myrtilles", "Dattes", "Guava", "arbuts"};
		
		
		
   static String iceCreams[] = {"Hard Icecream", "French iceCreams", "Light iceCreams", "Cone ", "Stick iceCreams", "Amul", "Vadilal", "Kwality walls", "cearm Bell", "cream and Fudge", "Venila iceCreams", "Butter ", "cookies", "pizza", "tiger tail"};
		
		
	static String softDrinks[]= {"Cococola", "Mango juice", "Maja", "Appe", "String", "sprite", "panda", "jeera", "7up", "Tumsup","smooth", "Limbka", "pinacolado", "pespsi", "Mirinda"};
		
		
		
		public static void main(String args[]){
	       getChocolates();
		   getChocolatesReverse();
		   getPurfumes();
		   getPurfumesReverse();
		   getSoaps();
		   getSoapsReverse();
		   getSnacks();
		   getSnacksReverse();
		   getVegitables();
		   getVegitablesReverse();
		   getFruits();
		   getFruitsReverse();
		   getIceCreams();
		   getIceCreamsReverse();
		   getSoftDrinks();
		   getSoftDrinksReverse();
	
	}
	
	
		public static void getChocolates(){
			for(int index = 0; index < chocolates.length; index++){
				System.out.println(chocolates[index]);
			}
			
	System.out.println("----------------------------------------------------------");
		}
		
		
		public static void getChocolatesReverse(){
			for(int index = chocolates.length-1;index >=0; index--){
				System.out.println(chocolates[index]);
			}
			
	System.out.println("----------------------------------------------------------");
		}
		
		
		


	
		
			public static void getPurfumes(){
				for(int index = 0; index < perfumes.length; index ++){
					System.out.println(perfumes[index]);
				}
				
	System.out.println("----------------------------------------------------------");
				
			}
			
			
		
			public static void getPurfumesReverse(){
				for(int index = perfumes.length-1;index >=0;index --){
					System.out.println(perfumes[index]);
				}
				
	System.out.println("----------------------------------------------------------");
				
			}






 
		
			
				public static void getSoaps(){
					for(int index =0; index < soaps.length; index++){
						System.out.println(soaps[index]);
					}
				
				System.out.println("----------------------------------------------------------");
				
				}
				
				
				
			
				public static void getSoapsReverse(){
					for(int index =soaps.length-1;index >=0; index--){
						System.out.println(soaps[index]);
					}
				
				System.out.println("----------------------------------------------------------");
				
				}
				
				
				
				
				
				




		 
			
				public static void getSnacks (){
					for(int index = 0; index < snacks.length;  index++){
						System.out.println(snacks[index]);
					}
					
			System.out.println("----------------------------------------------------------");
				}

				
				public static void getSnacksReverse (){
					for(int index = snacks.length-1;index >=0;  index--){
						System.out.println(snacks[index]);
					}
					
			System.out.println("----------------------------------------------------------");
				}







		
		
			public static void getVegitables(){
				for(int index =0 ; index <vegitables.length; index ++){
					System.out.println(vegitables[index]);
				}
				
		System.out.println("----------------------------------------------------------");
			}


			
			public static void getVegitablesReverse(){
				for(int index = vegitables.length-1;index>=0; index --){
					System.out.println(vegitables[index]);
				}
				
		System.out.println("----------------------------------------------------------");
			}







		
			public static void getFruits (){
				for(int index =0; index < fruits.length; index++){
					System.out.println(fruits[index]);
				}
				
				
		System.out.println("----------------------------------------------------------");
			
			}
			
			
			
		
			public static void getFruitsReverse (){
				for(int index = fruits.length-1;index >=0;index--){
					System.out.println(fruits[index]);
				}
				
				
		System.out.println("----------------------------------------------------------");
			
			}
	
	
				
				
			public static void getIceCreams (){
						for(int index = 0; index < iceCreams.length; index++){
							System.out.println(iceCreams[index]);
						}
						
				System.out.println("----------------------------------------------------------");
						
					}
					
					
					
			public static void getIceCreamsReverse (){
						for(int index = iceCreams.length-1;index >=0; index--){
							System.out.println(iceCreams[index]);
						}
						
				System.out.println("----------------------------------------------------------");
						
					}
	
	
	
	
	
			public static void getSoftDrinks(){
				for(int index = 0; index < softDrinks.length; index ++){
					System.out.println(softDrinks[index]);
				}
				
				
		System.out.println("----------------------------------------------------------");
				
			}
			
			
			
			public static void getSoftDrinksReverse(){
				for(int index = softDrinks.length-1;index >=0; index --){
					System.out.println(softDrinks[index]);
				}
				
				
		System.out.println("----------------------------------------------------------");
				
			}
			
			

			
		}
	
	
	
	
	
	
	
	
	
	
	
