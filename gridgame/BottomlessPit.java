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
public class BottomlessPit extends Opponent{
    
   public BottomlessPit(){
       this.strength = Integer.MAX_VALUE;
       
       Random r = new Random();
       this.positionX = r.nextInt(8)+1;
       this.positionY = r.nextInt(8)+1;
   }

}
