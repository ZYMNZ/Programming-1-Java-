/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridgame;

import java.util.Random;

/**
 *
 * @author yaman
 */
public class Monster extends Opponent{
    
   
        private String type;
        
        
        public Monster(){
            Random r = new Random();
        this.positionX = r.nextInt(8)+1;
        this.positionY = r.nextInt(8)+1;
        type = "Big G";
        this.health = 1000;
        this.strength = 150;
        }
         public Monster(int positionX, int positionY){
        this.positionX = positionX;
        this.positionY = positionY;
        type = "Big G";
        this.health = 1000;
        this.strength = 150;
        }
   
        
        
        public void setType(String t){
           type = (t.equals("")) ? type : t; 
        }

    @Override
    public String toString() {
        return "This monster located @ (" + this.getPositionX() + "," + this.getPositionY() + ")";
    }
    
    
   
      
    }
    
    

