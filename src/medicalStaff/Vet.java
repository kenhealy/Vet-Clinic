package medicalStaff;

import staff.MedicalStaff;
import staff.StaffType;

public class Vet extends MedicalStaff {

	public Vet(String firstname, String surname) {
		
		super(firstname, surname, StaffType.VET);
		
	}

}
