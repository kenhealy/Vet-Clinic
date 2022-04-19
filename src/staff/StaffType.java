package staff;

import java.util.ArrayList;

import NameGenerators.NameGenerator;
import adminStaff.*;
import medicalStaff.*;

public enum StaffType {

	VET{

		@Override
		public StaffMember getStaff() {
			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			
			return new Vet(name[0],name [1]);
			
		}
		
		/**
         * 
         * @return Medical for all MedicalStaff sub-types
         */
	@Override
	public Department whichDept() {
		
            return Department.MEDICAL;
	}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Vetrinarian";
		}
		
	},
	
	VETNURSE{

		@Override
		public StaffMember getStaff() {
			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			
			return new VetNurse(name[0], name[1]);
		}
		
		/**
         * 
         * @return Medical for all MedicalStaff sub-types
         */
	@Override
	public Department whichDept() {
		
            return Department.MEDICAL;
	}

		@Override
		public String toString() {
			
			return "Vetrinary Nurse";
		}
	},
	
	INTERN{

		@Override
		public StaffMember getStaff() {
			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			
			return new Intern(name[0], name[1] );
		}
		
		/**
         * 
         * @return Medical for all MedicalStaff sub-types
         */
	@Override
	public Department whichDept() {
		
            return Department.MEDICAL;
	}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Intern";
		}
		
	},
	
	FRONTDESK{

		@Override
		public StaffMember getStaff() {
			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			
			return new FrontDeskAdmin(name[0], name[1] );
		}
		
		 /**
         * 
         * @return Admin for all AdminStaff subtypes
         */
        @Override
	public Department whichDept() {
			
		return Department.ADMIN;
	}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Front Desk";
		}
		
	},
	
	ITSPECIALIST{

		@Override
		public StaffMember getStaff() {

			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			
			return new ITSpecialist(name[0], name[1] );
		}
		
		
 /**
         * 
         * @return Admin for all AdminStaff subtypes
         */
            @Override
            public Department whichDept() {
            
		return Department.ADMIN;
            }
		
            @Override
            public String toString() {
			
             return "IT Specialist";
            }
                
	},
	
	CARETAKER{

		 
		
		@Override
		public StaffMember getStaff() {
			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			
			return new Caretaker(name[0], name[1] );
		}

		
 /**
         * 
         * @return Admin for all AdminStaff subtypes
         */
        @Override
	public Department whichDept() {
			
		return Department.ADMIN;
	}
		



		
		
		
	};
	
	public abstract StaffMember getStaff();
        
        public abstract Department whichDept();
	
	private static String[] generateName() {
		
		NameGenerator NG = new NameGenerator();
		
		String name = NG.getRandomName();
		
		return name.split(" ");
	}
	
	//@return arraylist of only admin staff roles
	public static ArrayList<StaffType> listAdmins() {
		
		StaffType[] allTypes = StaffType.values();
		ArrayList<StaffType> admins = new ArrayList<StaffType>();
		
		for (StaffType t: allTypes) {
			
                    
			if(t.whichDept() == Department.ADMIN) {
				admins.add(t);
			}
		}
		
		return admins;
	}
	
	//@return arraylist of only medical staff roles
	public static ArrayList<StaffType> listMedical() {
		
		StaffType[] allTypes = StaffType.values();
		ArrayList<StaffType> medicals = new ArrayList<StaffType>();
		
		for (StaffType t: allTypes) {
			
			if(t.whichDept() == Department.MEDICAL) {
				medicals.add(t);
			}
		}
		
		return medicals;
	}
        
        /**
        * 
        * @return All available types as a formatted multi-line String
        */
	public static String listStaffTypesAsString() {
			
			String list = "";
			StaffType[] types = StaffType.values();
			
			for( int counter = 0; counter<types.length; counter++) {
			
				list = list.concat((counter + 1) + ": " + types[counter].toString() + "s \n");
			}
			
			return list;
		}
}
