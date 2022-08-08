/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encryption;

/**
 *
 * @author yaman
 */
public class Sequence {
    public static int fibonacci(int pos){
        
        if(pos==1){
            return 1;
        }
        if(pos==2){
            return 1;
        }
        
        int[] arr = new int [pos];
        
        arr[0]=1;
        arr[1]=1;
        
        for (int i = 2; i < arr.length; i++) {
            arr[i] = arr[i-1] + arr[i-2];
            System.out.println(arr[i]);
        }
        
        return arr.length-1;
    } 
    
}
