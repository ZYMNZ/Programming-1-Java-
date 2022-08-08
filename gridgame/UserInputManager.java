/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridgame;

import java.util.Scanner;

/**
 *
 * @author yaman
 */
public abstract class UserInputManager {
    
    public static String retrievePlayerMovementDirection(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enetr your direction (up/down/left/right): ");
        String direction = sc.next();
        
        return direction;
    }
    
    public static boolean retrievePlayerAttackDecision(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to attack (true/false)? ");
        boolean isAttacking = sc.nextBoolean();
        
        return isAttacking; 
    }
    
    public static String retrievePlayerName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your player name: ");
        String heroName = sc.nextLine();
        
        return heroName;
    }
}