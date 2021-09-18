package staff;

import java.util.ArrayList;
import java.util.Random;

import Queue.Queue;
import animals.Animal;

public abstract class MedicalStaff extends StaffMember {

	private Queue patientList;
	private final int MAXPATIENTS;
	
	public MedicalStaff(String firstname, String surname,  StaffType role) {
		
		super(firstname, surname, Department.MEDICAL, role);
		this.MAXPATIENTS = 20;
		this.patientList = new Queue();
	}

	public void allocateRandomPatients(ArrayList<Animal> thesePatients) {
		
		int counter =0;
		Random r = new Random();
		
		do {
			
			patientList.add(thesePatients.get(r.nextInt(thesePatients.size())));
			
		} while (counter < this.MAXPATIENTS);
	}
	
        

}
