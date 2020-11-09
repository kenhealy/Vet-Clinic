package NameGenerators;

public class DogNameGenerator extends NameGenerator {

	private String[] dogNames = {"Boxy", "Fido", "Rex", "Tuffington", "Yelper", "Sir WhinesALot", "Misty"};
	
	private String[] dogsurnames = {"McMuffin", "ManChaser", "Fartletter", "Hairball", "Plumpton"};
	
	public DogNameGenerator() {
		// change firstnames and surnames to dog equivalents
		
		this.firstNames = dogNames;
		this.surnames = dogsurnames;
	}

}
