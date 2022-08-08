/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DrawHouse;

import java.util.Scanner;

/**
 *
 * @author yaman
 */
public class UserInputManager {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("");
    }
    
    public static int retrieveAccountNumber(){
        int accountNumber=0;
       Scanner accNum = new Scanner(System.in);
       System.out.println("Please enter your bank account number: ");
       accountNumber = accNum.nextInt();
    
        return accountNumber;
    }

    public static String retrieveAccountType(){
        String accountType = "";
        Scanner accType = new Scanner(System.in);
        System.out.println("Please enter your account type: ");
        accountType = accType.next();
        
        return accountType;
    }

    public static int retrieveClientId(){
        int clientId = 0;
        Scanner clid = new Scanner(System.in);
        System.out.println("Please your ID number: ");
        clientId = clid.nextInt();
                
        return clientId;
    }

    public static String retrieveClientInfo(){
        String clientInfo = "";
        Scanner clinfo = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        clientInfo = clinfo.next();
        System.out.println("Please enter your last name: "); 
        clientInfo = clientInfo + " " + clinfo.next();
        /**
        * Inquire the user to input the first name of the client
        * and store it in the clientInfo variable
        * Inquire the user to input the  last name of the new client
        * then retrieves the entries from the console
        * and concatenate it to the clientInfo variable
        */
        
        return clientInfo;
    }

    public static double retrieveTransactionAmount(){
        double transactionAmount = 0.0;
        int tAmount = 0;
        Scanner trAmount = new Scanner(System.in);
        System.out.println("Please eneter your Transaaction Amount: ");
        transactionAmount =transactionAmount + trAmount.nextDouble();
        tAmount = (int) transactionAmount;        
        /**
        * Inquires the user to input the desired amount for the current transaction
        * then retrieves the entry from the console
        * and store it in the transactionAmount variable
        * Save the value of the transactionAmount variable into the tAmount variable
        */
        
        return tAmount;
    }

    public static int retrieveUserOption(){
        int userOption = 0;
        Scanner usop = new Scanner(System.in);
        System.out.println("Please enter your option: ");
        userOption = usop.nextInt();
        /**
        * Inquires the user to input the number associated with the operation he/she wants to execute
        * then retrieves the entry from the console
        * 
        * return the selected option number
        */
        
        return userOption;
    }
    
}
