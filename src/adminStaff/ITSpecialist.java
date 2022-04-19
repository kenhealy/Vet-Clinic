package adminStaff;

import staff.AdminStaff;
import staff.StaffType;

/**
 * ITSpecialist extends AdminStaff
 * 
 * @author Ken
 */
public class ITSpecialist extends AdminStaff {

	public ITSpecialist(String firstname, String surname) {
		
		super(firstname, surname, StaffType.ITSPECIALIST);
		
	}

	

}
