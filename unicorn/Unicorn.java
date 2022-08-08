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
public class Unicorn {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Monster m = new Monster();
        Monster m2 = new Monster("Rancor");
        Monster m3 = new Monster(4);
        Monster m4 = new Monster("Sarlacc", 4000);
        Monster m5 = new Monster ("num",45.0,4);
        
       System.out.println(m.getNumberOfLegs());
       System.out.println(m2.getSpecies());
       System.out.println(m3.getNumberOfLegs());
       System.out.println(m4.getNumberOfHands());
        System.out.println(m5.getNumberOfLegs());
       
       //System.out.println(m.numberOfLegs);
       // System.out.println(m.eyeColor); 
        
    }
    
}
