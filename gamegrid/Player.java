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
public class Player extends GameCharacter {
    private String name;
    private int health, strength; 
    
    public Player(){
        this.positionX = 4;
        this.positionY = 1;
        this.health = 750;
        this.strength = 250;
        
        this.name = UserInputManager.retrievePlayerName();
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getStrength() {
        return this.strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isAttacking(){
        boolean isAttacking = UserInputManager.retrievePlayerAttackDecision();
        return isAttacking;
    }
    
    public boolean isAccompanied(Opponent op){
        boolean isAccompanied = (this.positionX == op.getPositionX()) && (this.positionY == op.getPositionY());
        
        return isAccompanied;
    }
    
    public void attack(Opponent op){
        op.setHealth(
            op.getHealth() - this.strength
        );
        
    }
}
