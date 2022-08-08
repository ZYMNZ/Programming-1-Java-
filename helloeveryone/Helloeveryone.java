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
public class Helloeveryone {
     
    
    enum Access {Approuved , Denied}
    enum Game {Roulette, Dice}
   
    public static void main(String[] args) {
        
       
        
     /* 
        System.out.println("Hello Everyone!");
        System.out.println("I'm Yaman");
        
        System.out.println("5" + "5);

    }
  */  
   /* 
     String greeting = "Hello Everyone!";
     String name = "I'm Roland";
     String five = "5"
    */ 
   /*
     String name = "Waldo";
     String h = "Hello my name is ";
     String statement = "I am ";
     int age = 5;
     String conclusion = " years old.";
     System.out.println(h + name + " and " + statement + age + conclusion);
     
     int a = (int)age;
     */
   /*
     Scanner sc = new Scanner(System.in);
     String name = sc.next();
     boolean boo = (name.equalsIgnoreCase("Ronald"));
     boolean b = (2!=2);
     String s = ( b && boo ) ? "Unicorns are real": "Horses should have horns";
     System.out.println(s);
     */
     /*Scanner sc = new Scanner(System.in);
     System.out.println("Please enter a full name: ");
     String fullname = sc.nextLine();
     String response = (fullname.equals("Yaman Alhmy")) ? "Valide" : "invalide";
     System.out.println(response);
*/
    /* 
     Scanner nameAndPass = new Scanner(System.in);
     System.out.println("Please enter your Username: ");
     String userName = nameAndPass.next();
     System.out.println("Please eneter your password: ");
     int password = nameAndPass.nextInt();
     String answer = (userName.equals("Yaman") && password==123)? "Access Valide" : "Access Denied";
     System.out.println(answer); 
     
     */
     /*
     Scanner nameAndPass = new Scanner(System.in);
     System.out.println("Please enter your Username: ");
     String userName = nameAndPass.next();
     System.out.println("Please eneter your password: ");
     String password = nameAndPass.next();
     
     boolean isUsernameCorrect = userName.equals("Yaman");
     boolean isPasswrdCorrect = userName.equals("Alhmy");
     
     /String/ userAccess = (isUsernameCorrect && isPasswrdCorrect) ? Access.Approuved.toString() : Access.Denied.toString();
     
    
     System.out.println("Access " + userAccess);
     */
     /*
     Scanner sc = new Scanner(System.in);
     int abs, x ,y;
     
     System.out.println("Please enter a n(x): ");
     x = sc.nextInt();
        System.out.println("Please enter a n(y): ");
     y = sc.nextInt();
     abs = ((x+y)>=0) ? x+y : -x+(-y);
   
    System.out.println(abs);
        
    abs = Math.abs(x+y);
        System.out.println(abs);
      */  
    /* Scanner sc = new Scanner(System.in);
     Random rand = new Random();
     
     String selectedGame = sc.next();
     int maxRand = (selectedGame.equalsIgnoreCase(Game.Roulette.toString())) ? 36 : 6;
     
     
     int myRandomResult = rand.nextInt(maxRand)+1;
     System.out.println(myRandomResult);
    */
 /*
    String firstname = "Yaman";
    String lastname = "Alhamamy";
    
        System.out.println(lastname.length());
        System.out.println(firstname.toUpperCase() + " " + lastname.toUpperCase());
        System.out.println(lastname.indexOf("y"));
        System.out.println(5.0f/0.0);
        
        Scanner meow = new Scanner(System.in);
        System.out.println("Pizza bleez enter: ");
        String name = meow.nextLine();
        System.out.println("ur chicken name is: " + name);
       */ 
       /* Scanner equality = new Scanner(System.in);
        System.out.println("plz enetr ur 1st number: ");
        int firstnum = equality.nextInt();
        System.out.println("plz enetr ur 2nd number: ");
        int secondnum = equality.nextInt();
        boolean checking = (firstnum == secondnum) ? true : false;
        System.out.println(checking);
        */
     /*  Scanner sc = new Scanner(System.in);
       int number = sc.nextInt();
       switch (number){
           case 1:
               System.out.println("One");
               break;
           case 2:
               System.out.println("Two");
               break;
           case 3:
               System.out.println("Three");
               break;
           case 4:
               System.out.println("Four"); 
               break;
           case 5:
               System.out.println("Five");
               break;
           case 6:  
               break;
           case 7:
               System.out.println("Wow");
           case 8:   
           case 9:
               System.out.println("Too big");
               break;
           default:
               System.out.println("Out of bounds");
       }*/
       /* for(int i =0; i<30; i++){
            int outputVal = i + 1;
            System.out.println(outputVal);
          
       }*/
       // i "+=" 2 Increasing by 2
      /* for(int i=1; i<=15; i++){
           /*if(i==5){
               i++;
           }
            if(i==7){
               i++;
           }
             if(i==9){
               i++;
           }
           switch(i){
               case 5:
               case 7:
               case 9:
                  continue;
           }
           System.out.println(i);
       }*/
   /*   Scanner sc = new Scanner(System.in);
      String resp  ;//="a";
        
       /* while(resp.equals("a")){
           System.out.println("Enter a response:");
           resp = sc.next();
           System.out.print("continue...");
           System.out.println("with unicorn");
       }*/
     /*  do{
           System.out.println("Enter a response:");
           resp = sc.next();
           System.out.print("continue...");
           System.out.println("with unicorn");
       }while(resp.equals("a"));*/
        
       /* int i=1;
        while(i<=15){
            System.out.println(i);
            i+=2;
            
      }*/
       
       char[] vowels = new char[6];
       vowels[2]= 'i';
       vowels[0]= 'a';
       char[] vowels2 = {'a','e','i','o','u','y','z'};
       
       // System.out.println(vowels.length);
       
       for(int i=0; i<vowels2.length;i++){
          if(vowels2[i]=='u'){
              //break; 5 times
              //continue; 7 times
              //return i; 
              //System.out.println(i); 
          } 
       }
   } 
   
   
}
// .substring() = 


// MILESTONE 3
/*
  switch (userOption){
           case 1:
               Client cl = new Client();
               break;
           case 2:
               Account acc = new Account();
               break;
           case 3:
               Account.deposit();
               break;
           case 4:
               Account.withdraw();
               break;
           case 5:
               
               break;
           case 6:  
               
               break;
           case 7:
               
               break;
           case 0:
               
            break;             
           
       }
           */


