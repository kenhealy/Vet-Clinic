package animals;

import java.util.Random;

public class AnimalFactory {

	/* @return a random animal */
	public Animal getAnimal() {
		
		Random r = new Random();
		AnimalType[] types = AnimalType.values();
		
		int number = r.nextInt(types.length);		//pick a random number based on how many types of animal we have
		
		return getAnimal(types[number]);
		
	}
	
	/* @return an animal of a specified type
	 * @param type -- the type specified */	
	public Animal getAnimal(AnimalType type) {
		
		return type.getAnimal();
	}

	
}
