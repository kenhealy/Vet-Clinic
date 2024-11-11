package Clinic;

import java.util.ArrayList;
import java.util.Random;

import animals.*;
import java.util.Scanner;
import staff.StaffMember;
import staff.StaffType;
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

                Scanner myKB = new Scanner(System.in);
                
		VetClinic myClinic = new VetClinic();
		
                
                System.out.println("STAFF LIST\n\n" + myClinic.listAllStaff());
                System.out.println("Press Enter to continue");
                myKB.nextLine();
                System.out.println("PATIENT LIST\n\n\n" + myClinic.listAllPatients() );                
                System.out.println("This clinic currently treats the following types of animal: \n" + myClinic.getPatientTypes() + "\n ***********");
		
              
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
    
    /**
     * Generate a formatted String that contains all patient details
     * @return the formatted string
     */
     public String listAllPatients(){
           
           String list = "";
           
		for( Animal p: patients) {
			
			list = list.concat(p.toString());
		}
		
                return list;
       }

     /**
      * Generates  a formatted string that contains the details of all staff working in the clinic
      * @return the formatted string
      */
     public String listAllStaff(){
           
           String list = "";
           
		for( StaffMember s: staffList) {
			
			list = list.concat(s.toString());
                        
		}
		
                return list;
       }
     /**
      * 
      * @return a formatted String listing all "patients types" (i.e. Types of Animal) treated in this clinic
      */
     public String getPatientTypes(){
         
         return AnimalType.listAnimalTypesAsString();
     }
     
     /**
      * 
      * @return a formatted String listing all staff types working in this clinic
      */
     public String getStaffTypes(){
         
         return StaffType.listStaffTypesAsString();
         
     }
}
