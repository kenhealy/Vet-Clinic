package NameGenerators;
import java.util.Random;

/**
 * Base class to generate random names
 * firstnames - array of Strings that could be first names
 * surnames - array Strings that coudl be surnames
 * 
 * getRandomName() generates a random full name using these arrays
 * @author Ken
 */
public class NameGenerator {

	protected String[] firstNames = {"Ken", "Tom", "Sally", "Pavel", "Priscilla", "Claudia", "Steffany"};
	
	protected String[] surnames = {"Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst"};
	
	public NameGenerator() {
		
		//nothing here - deliberate
		
	}
	
        /**
         * Generates a random name using firstnames and surnames
         * @return the name as a String
         */
	public String getRandomName() {
				
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fname = this.firstNames[r.nextInt(firstNames.length)];
		String sname = this.surnames[r.nextInt(surnames.length)];
		
		return ( fname + " " + sname);
		
	}

}
