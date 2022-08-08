/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author dakor
 */
public class Animal extends LivingBeeing{

    protected String breed;

 
    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Animal() {
        
        this.species = "Unknown";
    }

    
    
    
}
