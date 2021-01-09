package staff;

import java.util.ArrayList;
import java.util.Random;

import Exceptions.NoSuchStaffTypeException;

public class staffFactory {

	
	private static StaffType[] allStaffTypes;
	
	public staffFactory() {
		
		this.allStaffTypes = StaffType.values();
		
	}
		
	/**
         * 
         * @param dept the department specified
         * @return a random staff member from department @param dept
         */
		public StaffMember getStaff(Department dept) {
			
			ArrayList<StaffType> someTypes = new ArrayList<StaffType>();
		    Random r = new Random();
			
			someTypes = dept.listAllTypes();
			
			return someTypes.get(r.nextInt(someTypes.size())).getStaff();
		}
		
		/* @param type is the staff type required
		 * @return an object of the required type
		 */
		private StaffMember getStaff(StaffType type) {
			
			return type.getStaff();
		}
	
		/**
                 * 
                 * @return a formatted list of all available departments
                 */
		public String listDepartments() {
			
			String depts="";
			int counter = 1;
			
			for (Department d: Department.values()) {
				
				depts = depts.concat(counter + ": " + d.toString() + "\n");
                                counter++;
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
