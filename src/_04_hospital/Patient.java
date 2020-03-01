package _04_hospital;

public class Patient {
boolean caredFor = false;
boolean Max = false;
boolean Macky = false;

	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		return caredFor;
		
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		caredFor = true;
	}
	
	public void doMedicine() {
		// TODO Auto-generated method stub
		Max = true;
		Macky = true;
	}


}
