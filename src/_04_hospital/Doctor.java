package _04_hospital;

import java.util.ArrayList;

public class Doctor {
ArrayList <Patient> patientss = new ArrayList <Patient>();
	public Object performsSurgery() {
		// TODO Auto-generated method stub
		return false;
	}

	public Object makesHouseCalls() {
		// TODO Auto-generated method stub
		return false;
	}

	public void assignPatient(Patient patient) {
		// TODO Auto-generated method stub
		patientss.add(patient);
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patientss;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		
	}



}
