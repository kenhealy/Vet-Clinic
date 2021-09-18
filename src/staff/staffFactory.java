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
         * Generate a random StaffMemmber from a random department
         * @return the StaffMember generated
         */	
        public StaffMember getStaff(){
            
            Department[] allDepts = Department.values();
            Random r = new Random();
            
            int randomDeptNo = r.nextInt(allDepts.length);
            
            return getStaff(allDepts[randomDeptNo]);
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
		
		/**
                 * Create a STaffMember of a specified type
                 * @param type - the STaffType required
                 * @return the staffMember generated
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

		
		
		/**
                 * Creates a STaffMember based on the type requested
                 * @param typeAsString - the StaffType required, as a STring
                 * @return the StaffMember generated
                 * @throws NoSuchStaffTypeException if there is no type matching the request
                 */
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
