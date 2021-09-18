
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Allows a menu to be created 
 * 
 * @author Ken
 */
public class Menu {
    
    private String[] optionList;
    
    public Menu(String[] options){
        
        this.optionList = options;
    }
    
    public Menu(ArrayList<String> options){
        
        this.optionList = new String[options.size()];
        for (int i = 0; i< this.optionList.length; i++){
            
            this.optionList[i] = options.get(i).toString();
        }
    }
    
    
    public String showMenu(String header){
        
        String menu = "***** " + header + " ******** \n";
        
        for (int count = 0; count < optionList.length; count++){
            
            menu = menu.concat("\n" + count +") " + optionList[count] + ".");
        }
        
        return menu;
    }
}
