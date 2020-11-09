package staff;

import java.util.ArrayList;

public enum Department {

	MEDICAL{

		@Override
		public StaffMember getStaff(StaffType type) {
		
			return type.getStaff();
		}

		@Override
		public ArrayList<StaffType> listAllTypes() {
			
			return StaffType.listMedical();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Medical Department";
		}
		
	},
	
	ADMIN{

		@Override
		public StaffMember getStaff(StaffType type) {
			
			return type.getStaff();
		}

		@Override
		public ArrayList<StaffType> listAllTypes() {
			
			return StaffType.listAdmins();
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Admininstration Department";
		}

		
		
	};
	
	//@return a StaffMmeber of a specific type
	public abstract StaffMember getStaff(StaffType type);
	
	
	public abstract ArrayList<StaffType> listAllTypes();
	
	public abstract String toString();
	
	
}
