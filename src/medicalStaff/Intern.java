package medicalStaff;

import staff.MedicalStaff;
import staff.StaffType;

public class Intern extends MedicalStaff {

	public Intern(String firstname, String surname) {
		
		super(firstname, surname, StaffType.INTERN);
		
	}

}
