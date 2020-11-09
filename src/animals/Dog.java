package animals;

public class Dog extends Animal {

	
	public Dog(String animalName, String illness) {
		
		super(animalName, illness, AnimalType.DOG);
		
	}

	@Override
	public String seeVet() {
		// return noise a dog makes
		return "Whine, whine,  whine";
	}

}
