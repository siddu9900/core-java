

//Encapsulation......

 public class Customer2{

  private int customerId;
  private String customerName;
   private String address;
    private long contactNo;
  private String email;
  private String dob;
  private String gender;
  private String anotherName;
private String anotherEmail;  
 
 
 public Customer2(){
	  
  }
  
  public Customer2(String anotherName, String anotherEmail){
	 this.anotherName = anotherName;
	 this.anotherEmail = anotherEmail;
	 System.out.println(anotherName+" 	"+anotherEmail);
  }
 
 //setter & getter --- are methodss.............
 
 public void setCustomerId(int customerId){
	 this.customerId = customerId;
 }
 public int getCustomerId(){
	 return customerId;
 }
 
 
 public void setCustomerName(String customerName){
	 this.customerName = customerName;
 }
 public String getCustomerName(){
	 return customerName;
 }
 
 
 
 public void setAddress(String address){
	 this.address = address;
 }
 public String getAddress(){
	 return address;
 }
 
 
 
 
 public void setContactNo(long contactNo){
	 this.contactNo =  contactNo;
 }
 public long getContactNo(){
	 return contactNo;
 }
 
 
 
 public void setEmail(String email){
	 this.email = email;
 }
 public String getEmail (){
	 return email;	 
 }
 
 
 
 public void setDob(String dob){
	 this.dob = dob;
 }
 public String getDob(){
	 return dob;
 }
 
 
 
 public void setGender(String gender){
	 this.gender = gender;
 }
 public String getGender(){
	 return gender;
 }
 
 
 
 
 
}