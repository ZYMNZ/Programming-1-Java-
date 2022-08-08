/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *
 * http://www.beginwithjava.com/java/loops/questions.html
 *
 */
package loopexercises;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author dakor
 */
public class LoopExercises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //System.out.println(question5());
        //System.out.println( question9() );
        //question17();
        //question18_6();
        
    }
    
    
    /*public static void question3(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int val = sc.nextInt();
        
        if(val>0){
            System.out.println("Multiplication table of val");
            for (int i = 1; l <= 10; i++) {
                System.out.println(val + "x" +i + " -> " + (i*val));
            }
        }
        else{
            System.out.println("Not a positive number");
        }
    }*/
    
    /*public static int question5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base value: ");
        int base = sc.nextInt();
        System.out.print("Enter the power value: ");
        int pow = sc.nextInt();
        int result = 1;
        for (int i = 1; i < pow; i++) {
            result *= base;
        }
        
        return result;
    }*/
    
    /*public static void question6() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int val = sc.nextInt();
        int reverse = 0;
        int remainder;
                
        while(val%10 > 0){
            remainder = val % 10;
            reverse = Integer.parseInt( reverse +""+remainder );
            
        }
        
        System.out.println(reverse);
    }*/
    
    /*public static void question7() {
        Scanner sc = new Scanner(System.in);
        int even = 0, odd = 0;
        int number;
        char answer;
        do{
            System.out.print("Enter a number: ");
            int val = sc.nextInt();
            
            if(val%2 == 0){
                even += val;
            }
            else{
                odd += val;
            }
            
            System.out.print("Do you want to continue y/n? ");
            answer = sc.next();
        }while(answer == 'y');
        
        System.out.println("Sum of even numbers: " + even);
        System.out.println("Sum of odd numbers: " + odd);
        
    }*/
    
    
    /*public static void question8() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        int val = sc.nextInt();
        boolean isPrime = true;
        
        for (int i = 2; i < val; i++) {
            if(val%i == 0){
                isPrime= false;
                System.out.println(val + " is not a prime number");
            }
        }
        
        System.out.println(val + " is a prime number");
    }*/


    /*public static int question9() {
        Scanner sc = new Scanner(System.in);
        int hcf = 0;
        
        System.out.print("Enter the first number: ");
        int first = sc.nextInt();
        System.out.print("Enter the second number: ");
        int second = sc.nextInt();
        
        for (int i = first; i > 1; i++) {
            if(first%i == 0 || second%i == 0){
                return i;
            }
        }
        
        
        return 1;
    }*/
    

    
    /*public static void question11() {
        Scanner sc = new Scanner(System.in);
        
        int number, countPositive = 0, countNegative = 0, countZero = 0;
        char choice;
	
        do
        {
            System.out.print("Enter the number: ");
            number = sc.nextInt();
        
            if(number > 0)
            {
                countPositive++;
            }
            else if(number < 0)
            {
                countNegative++;
            }
            else
            {
                countZero++;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Positive numbers: " + countPositive);
        System.out.println("Negative numbers: " + countNegative);
        System.out.println("Zero numbers: " + countZero);
    }*/
    
    
    /*public static void question12() {
        Scanner sc = new Scanner(System.in);
        
        int number;
        int max = 50;  // Intialize max with minimum value
        int min = 0;  // Intialize min with maximum value

        char choice;
	
        do
        {
            System.out.print("Enter the number: ");
            number = sc.nextInt();
        
            if(number > max)
            {
                max = number;
            }
            
            if(number < min)
            {
                min = number;
            }
        
            System.out.print("Do you want to continue y/n? ");
            choice = sc.next().charAt(0);
            
        }while(choice=='y' || choice == 'Y');
        
        System.out.println("Largest number: " + max);
        System.out.println("Smallest number: " + min);
        
    }*/


    /*public static void question13() {
        int h,d,u;
        
        for (int i = 1; i <= 500; i++) {
            u = i%10;
            d = (i/10)%10;
            h = (i/100)%10;
            
            if(i == (Math.pow(u, 3) * Math.pow(d, 3) * Math.pow(h, 3))){
                System.out.println(i);
            }
        }
        
    }*/
    
    
    /*public static void question17() {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int rand = r.nextInt(11);
        System.out.println(rand);
        int val;
        
        do{
            System.out.print("Enter a positive number: ");
            val = sc.nextInt();
            if(val > rand){
                System.out.println("Too high, try again.");
            }
            else if(val <= rand){
                System.out.println("Too low, try again.");
            }
            
        }while(val != rand);
        
    }*/
    
/*    public static void question18_6() {
        Scanner sc = new Scanner(System.in);
        String spaces = "";
        int input;
        
        System.out.print("Enter a number: ");
        input = sc.nextInt();
        
        for (int i = 1; i < input; i++) {
            spaces += " ";
        }
        
        for (int i = 1; i <= input; i++) {
            System.out.print(spaces);
            
            for (int j = i; j > 0; j++) {
                System.out.print(j);
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            
            System.out.println("");
            
            if(spaces.length() > 0)
                spaces = spaces.substring(1);
        }
    }
*/
    
}
