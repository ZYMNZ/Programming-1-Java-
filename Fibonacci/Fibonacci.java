/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaman
 */
public class Fibonacci {
    private static int[] sequence = new int[10];

    public static int[] getSequence() {
        return sequence;
    }

    public static void setSequence(int[] sequence) {
        Fibonacci.sequence = sequence;
    }
    
    public static void display(){
        for(int i=0;i<sequence.length;i++){
            
          //  System.out.print(sequence[i] + ",");
        } 
        
    }
    
    public static int[] fill(){
        sequence[0] = 1;
        sequence[1] = 1;
        
      for(int i=2;i<sequence.length;i++){
            sequence[i] = sequence[i-1] + sequence[i-2];
            System.out.println(sequence[i]); 
        }
        
        return sequence[i];
    } 
}
