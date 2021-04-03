package NameGenerators;

/**
 * Extend NameGenerator class and replace firstNames and surnames with silly dog names
 * @author Ken
 */
public class DogNameGenerator extends NameGenerator {

	private String[] dogNames = {"Boxy", "Fido", "Rex", "Tuffington", "Yelper", "Sir WhinesALot", "Misty"};
	
	private String[] dogsurnames = {"McMuffin", "ManChaser", "Fartletter", "Hairball", "Plumpton"};
	
	public DogNameGenerator() {
		// change firstnames and surnames to dog equivalents
		
		this.firstNames = dogNames;
		this.surnames = dogsurnames;
	}

}
