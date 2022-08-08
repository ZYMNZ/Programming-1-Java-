/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaman
 */
public class Alphabet {
    boolean isCap = true;
    public static String display(boolean isCap) {
        String res ="";
        String lower = "abcdefghijklmnopqrstuvwxyz";
        if (isCap) {
            return lower.toUpperCase();
        }
        else {
            return lower;
        }
        
    }
}

