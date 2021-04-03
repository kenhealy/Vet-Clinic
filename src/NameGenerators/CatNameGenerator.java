package NameGenerators;

/**
 * Extend NameGenerator class and replace firstNames and surnames with silly cat names
 * @author Ken
 */
public class CatNameGenerator extends NameGenerator {

	private String[] catNames = {"Scratchy", "TopCat", "Lion-O", "Tomcat", "Mr Fluffy", "CatsRule"};
	private String[] catsurnames = {"McShedsALot", "Milkdrinker", "Pouncer", "Mouse-hunter", "Bird-watcher"};
	
	public CatNameGenerator() {
		// replace our firstnames and surnames with cat equivalents
		
		this.firstNames = catNames;
		this.surnames = catsurnames;
		
		
	}

}
