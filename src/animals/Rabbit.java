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
public class Rabbit extends Animal{

    public Rabbit(String animalName, String illness) 
    {
        super(animalName, illness, AnimalType.RABBIT);
    }

    @Override
    public String seeVet() {
        
        return "hop, hop, cute twitchy nose";
    }
    
}
