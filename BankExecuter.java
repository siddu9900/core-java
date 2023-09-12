public class  BankExecuter{

	
	public static void main (String args []){
	
	 Bank money = new Bank();
	 money.setBankId(2);
	 money.setBankName("State Bank Of India (SBI)");
	 money.setFounder("Bank of Calcutta ");
	 money.setIfscCode("SBIN0000813");
	 money.setAddress("Post Bg No. 5310, State Bank Road, Banglore 560001");
	 money.setCity("Banglore Urban");
	 money.setState("Karnataka");
	 
		System.out.println("The Bank Id is " + money.getBankId());
		
		System.out.println("The Bank Name is " + money.getBankName());
		
		System.out.println("The Bank Founder  is " + money.getFounder());
		
		System.out.println("The Bank Ifsc  Code is " + money.getIfscCode());
		
		System.out.println("The Bank Address is " + money.getAddress());
		
		System.out.println("The Bank City  is " + money.getCity());
		
		System.out.println("The Bank State  is " + money.getState());
		
	
	}



}