package NameGenerators;

/**
 * Extend NameGenerator class and replace firstNames and surnames with silly disease names
 * @author Ken
 */
public class diseaseGenerator extends NameGenerator {

	private String[] diseaseNames = {"Smelly", "Wonky", "Broken", "Missing", "Achy breaky", "Upside-down", "Infested", "Wart-covered"};
	
	private String[] bodyparts = {"right leg" , "left leg", "paw", "heart", "eye", "ears", "liver", "pelvis", "licence", "owner", "hair"};
	
	public diseaseGenerator() {
		// replace firsname and surnames with diseases
		
		this.firstNames = diseaseNames;
		this.surnames = bodyparts;
		
	}

}
