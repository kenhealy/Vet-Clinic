package animals;


public class Cat extends Animal {

	

	public Cat(String animalName, String illness) {
		
		super(animalName, illness, AnimalType.CAT);
		
	}

	@Override
	public String seeVet() {
		// return noise a cat makes
		return "hiss, spit, hiss, meeeooow!";
	}

}
