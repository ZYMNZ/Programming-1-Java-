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
public class LivingBeeing {
    protected int nbLegs;
    protected int nbEyes;
    protected String species;
    protected double lifeExpectancy;

     public int getNbLegs() {
        return this.nbLegs;
    }

    public void setNbLegs(int nbLegs) {
        this.nbLegs = nbLegs;
    }

    public int getNbEyes() {
        return this.nbEyes;
    }

    public void setNbEyes(int nbEyes) {
        this.nbEyes = nbEyes;
    }

    public String getSpecies() {
        return this.species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getLifeExpectancy() {
        return this.lifeExpectancy;
    }

    public void setLifeExpectancy(double lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public LivingBeeing(){
        this.species = "Unknown";
    }
    @Override
    public String toString() {
        
        return "Living Beeing";
    } 
}
