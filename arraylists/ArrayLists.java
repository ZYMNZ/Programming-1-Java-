/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;

import java.util.ArrayList;

/**
 *
 * @author yaman
 */
public class ArrayLists {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          
         
        ArrayList<LivingBeeing> creatureList = new ArrayList<LivingBeeing>();
        
        
        
        // 1 - Add the following to the array 2 dogs, 2 cats, 2 humans and 2 Living beeings
              for(int i = 0; i < 2; i++){
                    creatureList.add(new Cat());
                    creatureList.add(new Dog());
                    creatureList.add(new Human());
                    creatureList.add(new LivingBeeing());
              }
                
        
               
        // 2 - display the contents of the array by printing the actual objects of the array       

      
            for (LivingBeeing q2 : creatureList){
                 System.out.println(q2);
            }
      
        // 3 - Remove the 3rd element of the array

             creatureList.remove(2);
		
        // 4 - display the contents of the array by printing the actual objects of the array       

                for (LivingBeeing q4 : creatureList){
                 System.out.println(q4);
                }

        // 5 - Change the nbLegs for all the dogs from 4 legs to 3 legs
                
                 for (int i = 0; i < creatureList.size(); i++) {
            
                if(creatureList.get(i).getSpecies().equalsIgnoreCase("dog")){
                    creatureList.get(i).setNbLegs(3);   
                }
            }
        
       
        // 6 - display the contents of the array by printing the actual objects of the array       

                for (LivingBeeing q6 : creatureList){
                 System.out.println(q6);
                }

        // 7 - Display the length of the array

                System.out.println(creatureList.size());
    }
    
}
