package NameGenerators;
import java.util.Random;

public class NameGenerator {

	protected String[] firstNames = {"ken", "Tom", "Sally", "Pavel", "Priscilla", "Claudia"};
	
	protected String[] surnames = {"Murphy", "Silva", "Smith", "Jones", "Carvalho", "Ernst"};
	
	public NameGenerator() {
		
		//nothing here - deliberate
		
	}
	
	public String getRandomName() {
		//return a random name
		
		Random r = new Random();
		
		//pick a firstname and surname based on length of array
		String fname = this.firstNames[r.nextInt(firstNames.length)];
		String sname = this.surnames[r.nextInt(surnames.length)];
		
		return ( fname + " " + sname);
		
	}

}
