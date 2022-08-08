
package looppractice;

import java.util.Scanner;


public class LoopPractice {

    
    public static void main(String[] args) {
        
        for(int i=0; i <=100 ;i++) {
            for (int j = 0; j <= 10; j++) {
                int o = i*j;
                System.out.println(i + " x " + j + " = " + o );
            }
        }
        
        
      /*  int sum=0;
        for (int i = 1; i <= 10; i++) {
            sum=sum+i;
       }
        System.out.println(sum);*/
      
     /* Scanner sc = new Scanner(System.in);
      System.out.print("Plz enter a pos num: ");
      int num ;
      num = sc.nextInt();
      if(num>0){
          for (int i = 1 ; i<=12; i++) {
              
              System.out.println(num +" x " + i + " = " + (num*i));
            }
        }*/
        /*Scanner sc = new Scanner(System.in);
        System.out.print("plz enter a num: ");
        int num = sc.nextInt();
        int fact = 1;
        
        for (int i = 1; i<=num; i++) {
            fact=fact*i;
        }
        System.out.println(fact);*/
        
      /* Scanner sc = new Scanner(System.in);
        System.out.print("plz enter ur nums: "); 
        int base=sc.nextInt();
        System.out.print("plz enter ur 2nd nums: ");
        int power=sc.nextInt();
        int result =1;
        for (int i = 1; i <= power; i++) {
            result= result* base;  
            //System.out.println(result*power);
              // System.out.println(result); 
            }
       System.out.println(result);*/
        System.out.println(looping(3,4));
    } 
    public static int looping(int base,int power){
        
        int result =1;
        for (int i = 1; i <= power; i++) {
            result= result* base;  
            //System.out.println(result*power);
              // System.out.println(result); 
            }
        return result;
    }
    
    
}
// Integer.parseInt
//Step over = to go into the other step
//Step into = when we have a function inside a function =telling the debug