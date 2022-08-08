/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloeveryone;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author yaman
 */


class neum {
   public static String numberToString(int num) {
    
       
    return String.valueOf(num) ;
  }


public static void main(String[] args){
    Scanner call = new Scanner(System.in);
    System.out.println("Insert ur num: ");
    int num1 = call.nextInt();
    System.out.println("Enter ur name");
    String name = call.next();
    boolean checkIn = (name.equals("Yaman") && num1==1234) ? true : false;
    System.out.println(checkIn);
    
    Random ran = new Random();
    


  }
}