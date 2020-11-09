package animals;

import java.util.Random;

public abstract class Animal {

	private String animalName;
	
	protected int age;
	
	private String illness;
	
	private AnimalType type;
	
	private int licenceNo;
	
	private static int currLicence = 100;
	
	public Animal(String animalName, String illness, AnimalType type) {
		
		this.animalName = animalName;
		this.age = generateAge();
		this.type = type;
		this.illness = illness;
		this.licenceNo = generateLicense();
		
	}
	
	private int generateAge() {
		
		Random r = new Random();
		
		return r.nextInt(15);	//I just picked 15. Sure why not
	}

	private int generateLicense() {
		//could do  something more complex here
		currLicence++;
		return currLicence;
	}

	public abstract String seeVet();
	
	public String getName() {
		
		return this.animalName;
	}
	
	//effectively a getter for animal license number
	public int checkLicense() {
		
		return this.licenceNo;
	}
	
	@Override 
	public String toString() {
		
		String details;
		
		details = "*********\n NAME OF ANIMAL: " + this.animalName + "\n LICENSE NO:  " + this.licenceNo + "\n AGE OF ANIMAL: " + this.age + "\nTYPE OF ANIMAL: " + this.type + "\nILLNESS: " + this.illness + "\n ************ \n"; 
	
		return details;
	}

	//@return animal type
	public AnimalType getType() {
		
		return this.type;
	}
	
}
