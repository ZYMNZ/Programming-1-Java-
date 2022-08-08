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
public abstract class GameCharacter implements IGameCharacter{
    protected int positionX;
    protected int positionY;
    
    
    public int getPositionX(){
        return this.positionX;
    }
    
    public void setPositionX(int positionX){
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

        
        if(direction.equalsIgnoreCase("up")){
            this.positionY = this.positionY + 1;
        }
        else if(direction.equalsIgnoreCase("down")){
                this.positionY = this.positionY - 1;
        }
        else if(direction.equalsIgnoreCase("right")){
            this.positionX = this.positionX + 1;
            System.out.println("All right Maytee!!");
        }
        else if(direction.equalsIgnoreCase("left")){
            this.positionX = this.positionX - 1;
        }
        else{
            System.out.println("Illegal option, please try again!");
            
        }

        return direction;
    }
    
    public void attack(GameCharacter gc){
        
    }
}
