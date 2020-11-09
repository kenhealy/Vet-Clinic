package staff;

public abstract class AdminStaff extends StaffMember {

	public AdminStaff(String firstname, String surname,  StaffType role) {
		
		super(firstname, surname, Department.ADMIN, role);
	
	}

	

}
