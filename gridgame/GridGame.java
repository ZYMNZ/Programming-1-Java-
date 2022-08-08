/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridgame;

import java.util.ArrayList;

/**
 *
 * @author yaman
 */
public class GridGame {
       
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Player hero = new Player();
        
      //  hero.positionX = 15;
        
      //  hero.setPositionX(15);
        
        Monster roz = new Monster(4,2);
        
        System.out.println(hero);
        
        ArrayList<GameCharacter> monsters = new ArrayList<GameCharacter>();
        
        monsters.add(hero);
        
        for (int i = 0; i < 7; i++) {
            monsters.add(new Monster());
            }
       
        for (int i = 0; i < monsters.size(); i++) {
            System.out.println(monsters.get(i));
        }
        
        String dir;
        do{
       dir = hero.move();
               
       boolean isAccompanied = hero.isAccompanied(roz);
       
           if(isAccompanied){
                boolean isAttacking = UserInputManager.retrievePlayerAttackDecision();
                if(isAttacking){
                    
                    do{
                    hero.attack(roz);
                    roz.attack(hero);
                    }while(hero.getHealth()>0 && roz.getHealth()>0);
                    
                    System.out.println("Player health: " + hero.getHealth());
                    System.out.println("Monster health: " + roz.getHealth());
                }
            }
        }while(!dir.equalsIgnoreCase("exit"));
       
      // hero.move();
        
        String message = (hero.positionX==roz.positionX  && hero.positionY==roz.positionY)
                ? "Same square" : "Different square"; 
        
       /*         
        System.out.println(message);       
        System.out.println("Player name: " + hero.getName());
        System.out.println("Player position: " + hero.getPositionX() + "," + hero.getPositionY());
        System.out.println("Monster position: " + roz.getPositionX() + "," + roz.getPositionY());
        */
      // hero.move();
      

    }
}
    
    
