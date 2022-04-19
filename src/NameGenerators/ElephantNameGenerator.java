/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NameGenerators;


public class ElephantNameGenerator extends NameGenerator {
    
    private String[] elephantNames = {"Dumbo", "Mammoth", "Squashinator", "Tusker", "BigEars", "Mr. Trunks", "Hannibal"};
	
	private String[] elephantSurnames = {"Tuskington-Smythe", "Trunkmeister", "Hugeness", "Trampler", "LargeButt"};
	
	public ElephantNameGenerator() {
		// change firstnames and surnames to dog equivalents
		
		this.firstNames = elephantNames;
		this.surnames = elephantSurnames;
	}
}
