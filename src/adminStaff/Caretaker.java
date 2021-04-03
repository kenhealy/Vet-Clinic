package adminStaff;

import staff.AdminStaff;
import staff.StaffType;

/**
 * Caretakers extend AdminStaff
 * @author Ken
 */
public class Caretaker extends AdminStaff {

	public Caretaker(String firstname, String surname) {
		
		super(firstname, surname,  StaffType.CARETAKER);
		
	}

	@Override
	public String toString() {
			
		return "Caretaker";
	}

}
