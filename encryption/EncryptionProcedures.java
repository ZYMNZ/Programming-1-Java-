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
public class EncryptionProcedures {
    private String originalMessage;

    public EncryptionProcedures(String originalMessage) {
        this.originalMessage = originalMessage;
    }
    

    public String getOriginalMessage() {
        return originalMessage;
    }

    public void setOriginalMessage(String originalMessage) {
        this.originalMessage = originalMessage;
    }
    
    
    public String cesarShift(){
        
        String encrypted = "";
        
        for (int i = 0; i < this.originalMessage.length(); i++) {
            
            char c = this.originalMessage.charAt(i);
            int ascii = (int)c;
            boolean lower =ascii >=97 && ascii<122;
            boolean upper =ascii >=65 && ascii<90;
            if(lower || upper){
                
            c++;
            
            }
            else if(c =='z'){
                c= 'a';
            }
            else if(c =='Z'){
                c= 'A';
            }
            encrypted += c;
           
        }
        return encrypted;
    }
        public String cesarShift(int shift){
            String encryptionValue = "";
            for (int i = 0; i < this.originalMessage.length(); i++) {
                char c = this.originalMessage.charAt(i);
                int ascii = (int)c;
                boolean isUpper =(ascii >=65 && ascii<=90);
                boolean isLower =(ascii >=97 && ascii<=122);
                
                if(isLower || isUpper){
                    ascii+=shift;
                    boolean resultIsUpper =(ascii >=65 && ascii<=90);
                    boolean resultIsLower =(ascii >=97 && ascii<=122);
                    
                    if(!(resultIsLower || resultIsUpper)){
                        ascii-=26;
                    }
                    
                    encryptionValue+= (char)ascii;
                }
                else{
                    encryptionValue+=c;
                }
                
            }
            return encryptionValue;
        } 
        
        
        public String fibonacci(){
            String encryptionValue = "";
             for (int i = 0; i < this.originalMessage.toLowerCase().length(); i++){
                char c = this.originalMessage.charAt(i);
                int ascii = (int)c;
                 
                 boolean isLower =(ascii >=97 && ascii<=122);
                 
                 if(isLower){
                     int pos = ascii-=96;
                     int fib = Sequence.fibonacci(pos);
                     encryptionValue+=fib;
                 }
                 else{
                     encryptionValue+=c;
                 }
                 
             }
            
            return encryptionValue;
        }
}
         
 
        

