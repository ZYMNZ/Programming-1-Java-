
package gridgame;

/**
 *
 * @author yaman
 */
public class Player extends GameCharacter{
  private String name;
  private int health, strength;
  private static int numberOfPlayers;
  

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

   public Player(){
       this.positionX = 4;
       this.positionY = 1;
       this.health = 750;
       this.strength = 250;
       
       this.name = UserInputManager.retrievePlayerName();
   }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
   
  /* public int setPositionX(int pos){
       positionX = (pos > 8) ? 8 : pos;
       
       return positionX;
   }
   */
   public boolean isAttacking(){
       boolean isAttacking = UserInputManager.retrievePlayerAttackDecision();
       
       return isAttacking;
    }
    
   public boolean isAccompanied(Opponent op){
       boolean isAccompanied = (this.positionX==op.getPositionX()) && (this.positionY==op.getPositionY());
       
       return isAccompanied;
   }
   
   public void attack(Opponent op){
       op.setHealth(
             op.getHealth() - this.strength   
       );
   }

    public static int getNumberOfPlayers() {
        return Player.numberOfPlayers;
    }

    public static void setNumberOfPlayers(int numberOfPlayers) {
        Player.numberOfPlayers = numberOfPlayers;
    }
   
   public static int numberOfPlayers(){
       
       int numberOfPlayers = Player.numberOfPlayers();
       
      return numberOfPlayers;
       
   }
   
   public void move(int num){
       this.positionX =  this.positionX+num;
   }

    @Override
    public String toString() {
        
        return "The Player \"" + name + "\" is located at (" + this.getPositionX() + "," + this.getPositionY() + ")";
    }
   
   
   
}

    
    
   