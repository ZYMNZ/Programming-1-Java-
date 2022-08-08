/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

import java.util.Scanner;

/**
 *
 * @author yaman
 */
public class Encryption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter here: ");
        String txt =sc.nextLine();
      */  
        EncryptionProcedures ep = new EncryptionProcedures("Ronald is a teacher");
        System.out.println( ep.cesarShift(0));
        System.out.println( ep.fibonacci());
     
    }
}
    

