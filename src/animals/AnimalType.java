package animals;

import NameGenerators.*;

public enum AnimalType {

	DOG{

		@Override
		public Animal getAnimal() {
			
			this.NG = new DogNameGenerator();
			String name = NG.getRandomName();
			
			
			return new Dog(name, getIllness());
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Dog";
		}
		
		
	},
	
	CAT{

		@Override
		public Animal getAnimal() {
			
			this.NG = new CatNameGenerator();
			String name = NG.getRandomName();
			
			
			return new Cat(name, getIllness());
		}

		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "Cat";
		}
		
		
	},
	
	MONSTER{

		@Override
		public Animal getAnimal() {
			
			this.NG = new MonsterNameGenerator();
			String name = NG.getRandomName();
						
			return new Monster(name, getIllness());
		}

		@Override
		public String toString() {
			
			return "Monster";
		}
		
		
	},
        
        RABBIT{
            
        
            @Override
            public Animal getAnimal() {
                
                this.NG = new CatNameGenerator();
                String name = NG.getRandomName();
                
                return new Rabbit(name, getIllness());
            }
            
            @Override
            public String toString() {
                
                return "Rabbit";
            }
            
        }
        
        
        
        ;
	
	protected  NameGenerator NG;
	public abstract Animal getAnimal();
	public abstract String toString();
	
	//@return a random illness as a String
	private static String getIllness() {
		
		NameGenerator NG = new diseaseGenerator();
		return (NG.getRandomName());
	}
        
       /**
        * 
        * @return All available types as a formatted multi-line String
        */
	public static String listAnimalTypes() {
			
			String list = "";
			AnimalType[] types = AnimalType.values();
			
			for( int counter = 0; counter<types.length; counter++) {
			
				list = list.concat((counter + 1) + ": " + types[counter].toString() + "s \n");
			}
			
			return list;
		}
	
}
