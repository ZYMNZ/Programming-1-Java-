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
public class Cat extends Animal {

    private int tailSizeCM;
    
      public int getTailSizeCM() {
        return this.tailSizeCM;
    }

    public void setTailSizeCM(int tailSizeCM) {
        this.tailSizeCM = tailSizeCM;
    }
    
    public Cat(){
        this.species = "Cat";
        
    }
    
   @Override
    public String toString() {
        
        return "cat";
    } 

}
