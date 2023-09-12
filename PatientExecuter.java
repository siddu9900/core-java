public class PatientExecuter{

		public static void main(String args []){
		
		 Patient patient = new Patient();
		 patient.setPatientId(1);
		 patient.setName("Siddu");
		 patient.setAttenderName("Veeresh");
		 patient.setAge(24);
		 patient.setDiseseName("Corona");
		 patient.setWardNo(12);
		 patient.setAdmmiteDate("22/8/2023");
		 patient.setHospitalName("Sai Clinic");
		 patient.setAddress("A/P - BELAGAVI");
		 patient.setGender("Male");
		 patient.setConsultantDoctor("Dr.Siddu");
	
	
				System.out.println("The Patient Id is  -----------" + patient.getPatientId());
				System.out.println("The name  of Patient is -----------" + patient.getPatientName());
				System.out.println("The Attender name is  -----------" + patient.getAttenderName());
				System.out.println("The  Age of Patient is  -----------" + patient.getAge());
				System.out.println("The DiseseName is ----------- -----------" +patient. getDiseseName());
				System.out.println("The Ward Number is -----------" + patient.getWardNo());
				System.out.println("The Admmite Date is  -----------" + patient.getAdmmiteDate());
				System.out.println("The Hospital Name is  -----------" +patient. getHospitalName());
				System.out.println("The  Address taken----------" +patient. getAddress());
				System.out.println("The  Gender is ----------" + patient.getGender());
				System.out.println("The Consultant Dr ----------" + patient.getConsultantDoctor());
				
		
		
		
		}
	
		



}