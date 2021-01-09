package staff;

import task.Task;

public abstract class StaffMember {

	/*
	 * All staff members have a staff ID as well as basic personal details
	 * 
	 * They are all assigned to a Dept and have a role (i.e. the function they perform)
	 * 
	 * All STaff members perform a task, but this task is different depending on the staff member
	 * 
	 * All staff members can be identified by asking them their name
	 * 
	 */
	
	private String firstname;
	private String surname;
	private int staff_ID;
	private Department dept; //the department they work in
	private StaffType role;  //specific role (or job title)
	private Task myTask; // current task being performed
	
	private static int currentStaffNumber = 1000;	//Start the staff ID badges at 1000
	
	
	
	//To hire a new staff member you need their name, the department where they will work, and their job title (role)
	public StaffMember(String firstname, String surname, Department dept, StaffType role) {
		
		this.firstname = firstname;
		this.surname =  surname;
		this.staff_ID = generateIDBadge();	//when a new staff member is hired, they get a ID number.
		this.dept = dept;
		this.role = role;
		
	}
	
	private int generateIDBadge() {
		
		//Note -- A more complex ID creation method could be performed here.
		this.currentStaffNumber++;
		return this.currentStaffNumber;
		
	}

	@Override
	//return the staff member's name in full
	public String toString() {
		
		return this.firstname + " " + this.surname;
	}
	
	public  String performTask() {
		
		return this.toString() + " the " +  this.role.toString() + " says that they are: " + this.myTask.perform();
	}

	public void assignTask(Task someTask) {
		
		this.myTask = someTask;
	}
	
	public StaffType getRole() {
		
		return this.role;
	}
	
	public String getfirstName() {
		
		return this.firstname;
	}
	
	public String getSurname() {
		
		return this.surname;
	}
}
