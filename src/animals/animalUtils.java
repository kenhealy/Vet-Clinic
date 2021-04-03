package animals;

import java.util.ArrayList;

import Exceptions.SearchException;
import constants.Constants;

public class animalUtils {

	public animalUtils() {
		// TODO Auto-generated constructor stub
	}

	
		
		//@return a list of animals from @param allAnimals matching @param type
		public static ArrayList<Animal> listAnimalsByType(ArrayList<Animal> allAnimals, AnimalType type){
			
			ArrayList<Animal> resultList = new ArrayList<Animal>();
			
			for (Animal a: allAnimals) {
				
				if( a.getType() == type) {
					
					resultList.add(a);
					
				}
			}
			
			return resultList;
		}
		
		//@return a list of animals from @param allAnimals whose name matches @param someName
		//@throws a SearchException if no matches or too many matches
		public static ArrayList<Animal> searchForAnimalByName(ArrayList<Animal> allAnimals, String someName) throws SearchException{
			
			ArrayList<Animal> result = new ArrayList<Animal>();
			
			for (Animal a: allAnimals) {
				
				if (a.getName().contains(someName)) {
					
					result.add(a);
				}
			}
			
			//possible that there are no matches or too many matches
			if (result.isEmpty()) {
				
				throw new SearchException("No animals found matching that name");
				
			}else if (result.size() > Constants.MAXSEARCHRESULTS) {
				
				throw new SearchException("There are too many animals matching those search parameters");
				
			}else {
				
				return result;
			}
		}
}
