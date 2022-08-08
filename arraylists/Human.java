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
public class Human extends LivingBeeing{
    
    private String hairColor;


    public String getHairColor() {
        return this.hairColor;
    }

    public void setHairColor(String hairColor) {
        this.hairColor = hairColor;
    }
    
    public Human(){
      this.species = "Human";  
    }
       @Override
    public String toString() {
        
        return "human";
    } 
}
