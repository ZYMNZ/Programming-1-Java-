/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegrid;

import java.util.Random;


public class Monster extends Opponent{

    public Monster() {
        Random r = new Random();
        this.positionX = r.nextInt(8)+1;
        this.positionY = r.nextInt(8)+1;
        this.type = "Big Gammorean";
        
        this.health = 1000;
        this.strength = 150;
    }
    
    public Monster(int positionX, int positionY) {
        this.positionX = positionX;
        this.positionY = positionY;
        type = "Big Gammorean";
        
        this.health = 1000;
        this.strength = 150;
    }
    
}
