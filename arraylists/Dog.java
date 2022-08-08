/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylists;

/**
 *
 * @author yaman
 */
public class Dog extends Animal{

    private boolean isHuntingDog;
    
    public boolean isIsHuntingDog() {
        return this.isHuntingDog;
    }

    public void setIsHuntingDog(boolean isHuntingDog) {
        this.isHuntingDog = isHuntingDog;
    }
    
    public Dog(){
        this.species = "Dog";
    }
    @Override
    public String toString() {
        
        return "dog";
    } 
         
}
