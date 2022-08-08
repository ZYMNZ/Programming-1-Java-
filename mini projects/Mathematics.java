/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaman
 */
public class Mathematics {
 final static double EULER = 0.5772;

     public static int power(int base, int pow){
         int result =1;
        for (int i = 1; i <= pow; i++) {
            result= result* base; 
        
        } 
        return result;
    }    

     public static int summation(int max){
        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum = sum + i;
        }
        return sum;
    }
    public static int arraySum(int[] arr){
        int arrsum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrsum = arrsum + arr[i];
        }
        return arrsum;
    } 
    public static int product(int max) { 
        int prod = 1;
        for (int i = 1; i <= max; i++) {
            prod = prod * i;
        }
        return prod;
    }
    public static double eulerProduct(int val) {
        return val * EULER;
    }
}

