package NameGenerators;

public class CatNameGenerator extends NameGenerator {

	private String[] catNames = {"Scratchy", "TopCat", "Lion-O", "Tomcat", "Mr Fluffy", "CatsRule"};
	private String[] catsurnames = {"McShedsALot", "Milkdrinker", "Pouncer", "Mouse-hunter", "Bird-watcher"};
	
	public CatNameGenerator() {
		// replace our firstnames and surnames with cat equivalents
		
		this.firstNames = catNames;
		this.surnames = catsurnames;
		
		
	}

}
