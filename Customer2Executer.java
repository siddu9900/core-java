 public class Customer2Executer{

public static void main(String args []){
	
	Customer2 customer = new Customer2();
	Customer2 customer1 = new Customer2("Chetan", "ChetnaAmit@ gmail.cg");
	//System.out.println(customer1.anotherName+ " " + customer1.anotherEmail);
	
		customer.setCustomerId(1);
		customer.setCustomerName("Siddu");
		customer.setAddress("Belagavi");
		customer.setContactNo(9900644178l);
		customer.setEmail("sidduchannannavar4@gmail.com");
		customer.setDob("15/07/1999");
		customer.setGender("Male");
		
		
		System.out.println("The Customer  Id is " + customer.getCustomerId());
		System.out.println("The Customer Name is " + customer.getCustomerName());
		System.out.println("The Address of Customer is " + customer.getAddress());
		System.out.println("The no ---------------" + customer.getContactNo());
		System.out.println("The Email of Customer is " +  customer.getEmail());
		System.out.println("The Date of  Birth " + customer.getDob());
		System.out.println("The Gender of Customer " + customer.getGender());
}
}