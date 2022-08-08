/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author yaman
 */
public class Arrays {
    public static void main(String[] args) {
        
        LivingBeeing[] creatureArray = new LivingBeeing[8];
        
          // 1 - Add the following to the array
        //      2 dogs, 2 cats, 2 humans and 2 Living beeings
        
         
        
        
        for (int i = 0; i < 8; i++) {
            creatureArray[i] = (new Cat());
            i++;
            creatureArray[i] = (new Dog());
            i++;
            creatureArray[i] = (new Human());
            i++;
            creatureArray[i] = (new LivingBeeing());
        
        }
        
        
        // 2 - display the contents of the array by printing the actual objects of the array
       // for (LivingBeeing q2 : creatureArray){
                System.out.println(creatureArray);
        //}
        
        // 3 - Remove the 3rd element of the array
        
        creatureArray[2] = null;


        
        // 4 - display the contents of the array by printing the actual objects of the array      
        
        for (LivingBeeing q4 : creatureArray){
                System.out.println(q4);
        }

        // 5 - Change the nbLegs for all the dogs from 4 legs to 3 legs
                  
        for (int i = 0; i < creatureArray.length; i++) {
            if(creatureArray[i] != null){
                if(creatureArray[i].getSpecies().equalsIgnoreCase("dog")){
                    creatureArray[i].setNbLegs(3);   
                }
            }
        }
 
            
            
        
        
        // 6 - display the contents of the array by printing the actual objects of the array       

            for (LivingBeeing q6 : creatureArray){
                System.out.println(q6);
        }
        
        // 7 - Display the length of the array

                System.out.println(creatureArray.length);
        
    }
}
