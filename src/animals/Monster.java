package animals;

public class Monster extends Animal {

	public Monster(String animalName, String illness) {
		
		super(animalName, illness, AnimalType.MONSTER);
		
	}

	@Override
	public String seeVet() {
		
		return "Aha! Lunchtime! Snarl...chomp...chew...gulp";
	}

}
