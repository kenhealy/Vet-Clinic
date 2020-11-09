package staff;

import java.util.ArrayList;

import Exceptions.SearchException;

/**
 *
 * @author Ken
 */
public class StaffUtils {

	private static StaffType[] allStaffTypes;
	
	public StaffUtils() {
		
		allStaffTypes = StaffType.values();
		
	}

	/**
         * 
         * @return a list of all available staff types as a String
         */
	public static String listStaffTypes() {
				
		String allStaff="";
		int counter = 1;
						
					
		for(StaffType s: allStaffTypes) {
						
			allStaff = allStaff.concat(counter + ": " + s.toString() + "\n");
			counter++;
		}
						
		return allStaff;
	}
	
	//@return a formatted string of all available staff types in department @param dept
	public static String listTypeByDepartment(Department dept) {
		
		String typeString ="";
		int count = 1;
		
		for (StaffType s: allStaffTypes) {
			
			if (s.whichDept() == dept) {
				
				typeString = typeString.concat(count + ": " + s.toString() + "\n");
				count++;
			}
		}
		
		return typeString;
	}
	
	public static ArrayList<StaffMember> listStaffByDepartment (ArrayList<StaffMember> staffList, Department dept){
		
		ArrayList<StaffMember> specificList = new ArrayList<StaffMember>();
		
		for(StaffMember s: staffList) {
			
			//only add gthe staff member if they work in the specific department
			if(s.getRole().whichDept() == dept) {
				
				specificList.add(s);
			}
		}
		
		return specificList;
	}
	
	//@return a arraylist of staff members who carry out @param role
	public static ArrayList<StaffMember> listStaffByRole (ArrayList<StaffMember> staffList, StaffType role){
		
		ArrayList<StaffMember> specificList = new ArrayList<StaffMember>();
		
		for(StaffMember s: staffList) {
			
			//only adding the staff member if they work in the specific department
			if(s.getRole() == role) {
				
				specificList.add(s);
			}
		}
		
		return specificList;
	}
	
	//@return a list of STaffMembers from @param staffList that contain the string @param someName 
	//@throw SearchException if no  match found
	public static ArrayList<StaffMember> searchByStaffName(ArrayList<StaffMember> staffList, String someName) throws SearchException {
		
		someName = someName.toLowerCase();
		
		ArrayList<StaffMember> searchResults = new ArrayList<StaffMember>();
		
		for (StaffMember s: staffList) {
			
			if ((s.getfirstName().toLowerCase().contains(someName)) || (s.getSurname().toLowerCase().contains(someName)) ) {
				
				searchResults.add(s);
				
			}
		}
		
		if (searchResults.size() == 0) {
			
			throw new SearchException("No matching name found.");
		}
		else {
			
			return searchResults;
		}
		
	}
	
	
}
