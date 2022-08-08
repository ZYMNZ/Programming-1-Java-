/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridgame;

/**
 *
 * @author yaman
 */
public abstract class Opponent extends GameCharacter {
    protected String type;
    protected int health, strength;

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
    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void attack(Player p){
        p.setHealth(
                p.getHealth() - this.strength
        );
    }
    
    
    public String move(){
     return "";  
    }
}

