/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animals;

/**
 *
 * @author Ken
 */
public class Elephant extends Animal {

    public Elephant(String animalName, String illness) {
        
        super(animalName, illness, AnimalType.ELEPHANT);
    }

    @Override
    public String seeVet() {
        
        return "BLLLAAAAARPPP....TRAMPLE TRAMPLE TRAMPLE...";
    }
    
}
