/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment2;

import java.util.Scanner;

/**
 *
 * @author yaman
 */
public class CompundInterest {
    public static void main(String[] args) {
     
       
       Scanner money = new Scanner(System.in);
       System.out.print("Please enter the amount of the deposit: ");
       
       double deposit = money.nextDouble();
       System.out.println("For the following deposit: " + (int)deposit + "$");
       System.out.println("With a compound interest of 5% per year");
       for (int year=1;year<=5;year++){
           deposit = deposit + deposit * 0.05;
           if(year==1 || year==3 || year==5){        
               System.out.println("You will have: " + (int)deposit + "$ after " + year + " years");
           }
        }
    }
}
    

