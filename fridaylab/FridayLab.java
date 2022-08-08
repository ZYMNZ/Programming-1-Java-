
package fridaylab;
//Date:28-1-2022

import java.util.Scanner;


public class FridayLab {
enum Alert { LOW, NEDIUM, HIGH }
    /*
    enum TvBrand { LG, Samsung, Panasonic, RCA, Sony }
    enum AlertLevel { LOW, NEDIUM, HIGH }
    enum PrimaryColors { Red, Yellow, Blue }
 */
    public static void main(String[] args) {
    
        /*
    int[] arrValues = new int[5];
    arrValues[2]= (int)5.2;    
    arrValues[0]= (int)5.2;    
    arrValues[4]= (int)5.2;

    arrValues[2] = 3;
   /*  String tvBrand = "LG";
       double age;
       age = 5.5;
       
        System.out.println(tvBrand);
        System.out.println(TvBrand.Panasonic);
        
        AlertLevel al = AlertLevel.HIGH;
        System.out.println(al);
        
        System.out.print(PrimaryColors.Red);
        System.out.print(PrimaryColors.Yellow);
        System.out.println(PrimaryColors.Blue);
        
        System.out.println(PrimaryColors.Red + "" + PrimaryColors.Yellow + "" + PrimaryColors.Blue); 
                
        String[] arrColors = new String[3];
        arrColors[0] = "Red";
        arrColors[1] = "Yellow";
        arrColors[2] = "Blue";
        System.out.println(arrColors[0] + arrColors[1] + arrColors[2] );
        arrColors[1] = "Purple";
        System.out.println(arrColors[0] + arrColors[1] + arrColors[2] );
        
        
        String name = "Waldo";
     String h = "Hello my name is ";
     String statement = "I am ";
     String conclusion = " years old.";
     System.out.println(h + name + " and " + statement + age + conclusion);
     
     int a = (int)age;
     System.out.println(h + name + " and " + statement + a + conclusion);
     System.out.println(h + name + " and " + statement + (int)age + conclusion);

     float f = (float)5.0;
     int x = (int)5.0 / 7;
     int y = (int)(5.0 / 7.0);
     int z = (int)(5.0f / 7.0);
     int zx = (int)5.0f /(int)7.0;
     */           
     String[] arrSentence = new String[3];
     arrSentence[0]= "Hello my name is ";
     arrSentence[1]= " I am ";
     arrSentence[2]= " years old.";
     
     Scanner sc = new Scanner(System.in);
     System.out.println("Please enter your name: ");
     String name = sc.nextLine();
     System.out.println("Please enter your age:");
     double age = sc.nextDouble();
     System.out.println(arrSentence[0] + name + arrSentence[1] + (int)age + arrSentence[2]);
     
     
             
    }
    
}
