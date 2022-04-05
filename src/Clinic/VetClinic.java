package Clinic;

import java.util.ArrayList;
import java.util.Random;

import animals.*;
import staff.StaffMember;
import staff.staffFactory;

public class VetClinic {

	private ArrayList<Animal> patients;
	private ArrayList<StaffMember> staffList;
	
	
	public VetClinic() {
		
		this.patients = new ArrayList<Animal>();
		admitPatients(1000);
		this.staffList = new ArrayList<StaffMember>();
		createStaff(50);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		VetClinic myClinic = new VetClinic();
		
		
	}
	
        /**
         * Generate a number of random animals that are the patients of the clinic and populate patientList
         * @param numPatients - the number of patients wanted
         */
	private void admitPatients(int numPatients) {
		
		AnimalFactory myAnimalFactory = new AnimalFactory();
		
		for (int i=0; i<numPatients; i++) {
			
			Animal someAnimal = myAnimalFactory.getAnimal();
			
			this.patients.add(someAnimal);
				
                        System.out.println("****");
                        System.out.println(someAnimal);
                          System.out.println("****");      
                                
                          System.out.println("This clinic currently treats the following types of animal: \n" + AnimalType.listAnimalTypes() + "\n ***********");
		}
		
		
		
		 
	}

        /**
         * Generate a number of random staff members and populate staffList
         * @param numStaff - the number of StaffMembers wanted
         */
    private void createStaff(int numStaff) {
        
       staffFactory myStaffFactory = new staffFactory();
       
       for (int i=0; i<numStaff; i++) {
			
           StaffMember newStaff = myStaffFactory.getStaff();
           
           this.staffList.add(newStaff);
				
	}
       
      
    }
    
     public String listAllPatients(){
           
           String list = "";
           
		for( Animal P: patients) {
			
			list = list.concat(P.toString());
		}
		
                return list;
       }

}
