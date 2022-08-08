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
public abstract class GameCharacter implements IGameCharacter{
    protected int positionX;
    protected int positionY;

    public int getPositionX() {
        return this.positionX;
    }

    public void setPositionX(int positionX) {
        this.positionX = positionX;
    }

    public int getPositionY() {
        return this.positionY;
    }

    public void setPositionY(int positionY) {
        this.positionY = positionY;
    }
    
    public String move(){
        
        String direction = UserInputManager.retrievePlayerMovementDirection();
   /*     this.positionY =(direction.equalsIgnoreCase("up")) ? this.positionY +1 : this.positionY;
        this.positionY =(direction.equalsIgnoreCase("down")) ? this.positionY -1 : this.positionY;
        this.positionX =(direction.equalsIgnoreCase("right")) ? this.positionX +1 : this.positionX;
        this.positionX =(direction.equalsIgnoreCase("left")) ? this.positionX -1 : this.positionX;*/
        
     /* if(direction.equalsIgnoreCase("up")){
          this.positionY = this.positionY + 1;
      }
      if(direction.equalsIgnoreCase("down")){
          this.positionY = this.positionY - 1;
      }
      if(direction.equalsIgnoreCase("right")){
          this.positionX = this.positionX +1;
          System.out.println("All right mate.");
      }
      if(direction.equalsIgnoreCase("left")){
          this.positionX = this.positionX -1; */
     /*     
     if(direction.equalsIgnoreCase("up")){
          this.positionY = this.positionY + 1;
      }
     else{
         if(direction.equalsIgnoreCase("down")){
          this.positionY = this.positionY - 1;
      }
         else{   
         System.out.println("Option Invalide");
         this.move();
         }
    }*/
     if(direction.equalsIgnoreCase("up")){
          this.positionY = this.positionY + 1;
      }
     else if(direction.equalsIgnoreCase("down")){
          this.positionY = this.positionY - 1;
      }
     else if(direction.equalsIgnoreCase("right")){
          this.positionX = this.positionX +1;
          System.out.println("All right mate.");
      }
     else if(direction.equalsIgnoreCase("left")){
          this.positionX = this.positionX -1;
      }    
     else{   
         System.out.println("Option Invalide");
         
         }
     
    //SWITCH : IS ON HELLOEVERYONE PROJECT
    
    return direction;
}   
    
  public void attack(GameCharacter gc){
      
  }
    
}
