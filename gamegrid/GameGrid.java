/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegrid;

/**
 *
 * @author raphaelr
 */
public class GameGrid {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Player hero = new Player();
        Monster roz = new Monster(4,2);
        
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
    }
    
}
