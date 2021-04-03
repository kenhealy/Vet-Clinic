package NameGenerators;

/**
 * Extend NameGenerator class and replace firstNames and surnames with silly Monster names
 * @author Ken
 */
public class MonsterNameGenerator extends NameGenerator{

	private String[] monsterTitles = {"Growling", "Snarling", "Skin-stealing", "Black-tongued", "Green-scaled", "Fire-breathing", "Princess-capturing", "Knight-crunching"};
	private String[] monsterTypes = {"Dragon", "Gruffalo", "Balrog", "Giant Spider", "Giant Bat", "Daemon", "Scrael"};
	
	public MonsterNameGenerator() {
		
		this.firstNames = monsterTitles;
		this.surnames = monsterTypes;
	}

}
