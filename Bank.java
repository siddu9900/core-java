public  class Bank{
	private int bankId;
	private String bankName;
	private String founder;
	private String ifscCode;
	private String address;
	private String city;
	private String state;
	
	
	
		public void setBankId(int bankId){
			this.bankId = bankId;
		}
		
		
		public int getBankId(){
			return bankId;
		}
		
		
		
			 public void setBankName(String bankName){
				 this.bankName =bankName;
			 }
			 public String getBankName(){
				 return bankName;
			 }
			 
	public void setFounder(String founder){
		this.founder = founder;
	}
	
	public String getFounder(){
		return founder;
	}
	
			public void setIfscCode(String ifscCode){
				this.ifscCode = ifscCode;
			}
			public String getIfscCode(){
				return ifscCode;
			}
			
			public void setAddress(String adsress){
				this.address = address;
			}
			
			public String getAddress(){
				return address;
			}
			
			
	public void setCity(String city){
		this.city = city;
		
	}
	
	public String getCity(){
		return city;
	}
	
		public void setState(String state){
			this.state =state;
		}
		
		public String getState(){
			return state;
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}