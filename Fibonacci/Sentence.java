/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaman
 */
public class Sentence {
   private String text; 

    public Sentence(String text) {
        this.text = text;
    }
    public String reverse(){
        String reverse = "";
        for (int i = text.length() - 1; i >=0 ; i--) {
            reverse = reverse + text.charAt(i);
        }
                
        return reverse;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }
   
   public boolean isPalindrome(){
       for (int i = 0; i < text.length()/2; i++) {
           
       }
       return false;//check
 
   }
   
}
