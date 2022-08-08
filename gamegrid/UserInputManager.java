/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamegrid;

import java.util.Scanner;

/**
 *
 * @author raphaelr
 */
public class UserInputManager {
    public static String retrievePlayerMovementDirection(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter the direction (up/down/left/right): ");
        String direction = sc.next();
        
        return direction;
    }
    
    public static boolean retrievePlayerAttackDecision(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Do you want to attack (true/false)? ");
        boolean isAttacking = sc.nextBoolean();
        
        return isAttacking;
    }
    
    public static String retrievePlayerName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your player's name: ");
        String heroName = sc.nextLine();
        
        return heroName;
    }
}
