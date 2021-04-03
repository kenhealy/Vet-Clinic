package Clinic;

import java.util.ArrayList;
import java.util.Random;

import animals.*;
import staff.StaffMember;

public class VetClinic {

	private ArrayList<Animal> patients;
	private ArrayList<StaffMember> staffList;
	
	
	public VetClinic() {
		
		this.patients = new ArrayList<Animal>();
		admitPatients();
		//this.staffList = new ArrayList<StaffMember>();
		//createStaff();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VetClinic myClinic = new VetClinic();
		
		
	}
	
	private void admitPatients() {
		
		Random r = new Random();
		AnimalFactory myAnimalFactory = new AnimalFactory();
		
		for (int i=0; i<1000; i++) {
			
			Animal someAnimal = myAnimalFactory.getAnimal();
			
			this.patients.add(someAnimal);
				
		}
		
		//INCLUDED FOR TESTING ONLY//
		for( Animal P: patients) {
			
			System.out.println(P.toString());
		}
		////////////////////////////////
		
		System.out.println("This clinic currently treats the following types of animal: \n" + AnimalType.listAnimalTypes() + "\n *********** ");
	}

}
