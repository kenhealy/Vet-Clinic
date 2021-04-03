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
		
		@Override
		public Department whichDept() {
			// TODO Auto-generated method stub
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
			
			return null;
		}
		
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
		
		@Override
		public Department whichDept() {
			// TODO Auto-generated method stub
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
		
		@Override
		public Department whichDept() {
			// TODO Auto-generated method stub
			return Department.ADMIN;
		}

		
		
	},
	
	ITSPECIALIST{

		@Override
		public StaffMember getStaff() {

			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			
			return new ITSpecialist(name[0], name[1] );
		}
		
		@Override
		public Department whichDept() {
			// TODO Auto-generated method stub
			return Department.ADMIN;
		}

		
	},
	
	CARETAKER{

		 
		
		@Override
		public StaffMember getStaff() {
			
			NameGenerator NG = new NameGenerator();
			
			String[] name = generateName();
			
			return new Caretaker(name[0], name[1] );
		}

		

		



		@Override
		public Department whichDept() {
			// TODO Auto-generated method stub
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
}
