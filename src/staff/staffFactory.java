package staff;

import java.util.ArrayList;
import java.util.Random;

import Exceptions.NoSuchStaffTypeException;

public class staffFactory {

	
	private static StaffType[] allStaffTypes;
	
	public staffFactory() {
		
		allStaffTypes = StaffType.values();
		
	}
		
	//@ param a specific department
	//@ return a random new staff member belonging to dept
		public StaffMember getStaff(Department dept) {
			
			ArrayList<StaffType> someTypes = new ArrayList<StaffType>();
		    Random r = new Random();
			
			if (dept == Department.ADMIN) {
				
				someTypes =  StaffType.listAdmins();
				
			}
			else if (dept == Department.MEDICAL) {
				
				someTypes = StaffType.listMedical();
			}
			else {
				
			}
			
			return someTypes.get(r.nextInt(someTypes.size())).getStaff();
		}
		
		/* @param type is the staff type required
		 * @return an object of the required type
		 */
		private StaffMember getStaff(StaffType type) {
			
			return type.getStaff();
		}
	
		//@return a formatted string listing all available departments
		public String listDepartments() {
			
			String depts="";
			int counter = 1;
			
			for (Department d: Department.values()) {
				
				depts = depts.concat(counter + ": " + d.toString() + "\n");
			}
			
			return depts;
		}

		
		
		/*@returns a new STaffMember object based on the type specified @param typeAsString
		* @throws a NoSuchStaffTypeException if @param typeAsString does not correspond
		* to an available Staff Type */
		public StaffMember getStaff(String typeAsString) throws NoSuchStaffTypeException {
			
			int counter = 0;
			
			while ((counter < allStaffTypes.length) && (!typeAsString.equalsIgnoreCase(allStaffTypes[counter].toString()))){
				
				counter++;
			}
			
			if (typeAsString.equalsIgnoreCase(allStaffTypes[counter].toString())){
				
				return getStaff(allStaffTypes[counter]);
			}
			else {
				
				throw new NoSuchStaffTypeException();
			}
		}
		
		
}
