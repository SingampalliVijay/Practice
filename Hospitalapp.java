package practice;

public class Hospitalapp {
	public static void main(String[] args) {
		Hospital h1=new Hospital();
		h1.Doctors=200;
		h1.Patients=2000;
		h1.HospitalName="Indira Ghandhi";
		h1.Bloodgroup='A';
		System.out.println("In "+h1.HospitalName+" hospital doctors = "+h1.Doctors+" and patients ="+h1.Patients+" with bloodgroup of "+h1.Bloodgroup);
		h1.Checking();
		h1.Injecting();
		h1.Discharging();
		
	}

}
