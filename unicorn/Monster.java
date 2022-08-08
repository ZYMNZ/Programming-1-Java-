/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unicorn;

/**
 *
 * @author yaman
 */
public class Monster {
    private int numberOfLegs;
    private String eyeColor;    //properties
    private String species;
    private double numberOfHands;

    public int getNumberOfLegs() {
        return this.numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getEyeColor() {
        return eyeColor;
    }

    public void setEyeColor(String eyeColor) {
        this.eyeColor = eyeColor;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getNumberOfHands() {
        return numberOfHands;
    }

    public void setNumberOfHands(double numberOfHands) {
        this.numberOfHands = numberOfHands;
    }
    
    
    public Monster(){
        species = "Gammorean";
    }
    
    public Monster(String s){
        species = s;
    }
    public Monster(int legs){
       numberOfLegs = legs; 
    }
    public Monster(String s, int legs){
        species = s;
        numberOfLegs = legs; 
    }
    public Monster (String s ,double d, int r ){
        numberOfHands = d;
        numberOfLegs = r;
        eyeColor = s;
        
    }
            
    public void test(){
        numberOfLegs = 5;
        eyeColor = "Red";
        
        
    }
}
