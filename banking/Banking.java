/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

/**
 *
 * @author yaman
 */
public class Banking {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bank b = new Bank();
        Client client = new Client("","");
        
        while(true){
            int o = UserInputManager.retrieveUserOption();
              switch (o){
           case 1:
                addNewClient(b);
               break;
           case 2:
               addNewAccount(b);
               break;
           case 3:
           case 4:
               executeTransaction(b,o);
               break;
           case 5:
                int c = UserInputManager.retrieveClientId();
                int a = UserInputManager.retrieveAccountNumber();
                Account acc = b.getClient(c).getAccount(a);
                acc.displayAllTransactions();
                break;
           case 6:  
               b.displayClientList();
               break;
           case 7:
               int cID = UserInputManager.retrieveClientId();
               b.displayClientAccounts(cID);
               break;
           case 0:
               
            return;             
           
       }
        }
    }
    
    private static void addNewClient(Bank cibc){
        Client clientInfo = UserInputManager.retrieveClientInfo();
        cibc.addClient(clientInfo);         
    }
    
    private static void addNewAccount(Bank cibc){
       int clientId = UserInputManager.retrieveClientId();
       Client cl = cibc.getClient(clientId);
       if(cl != null){
            Account accountType = UserInputManager.retrieveAccountType();
            cl.addAccount(accountType);
       }
    }
    
    private static void executeTransaction(Bank exT, int tran ){
        int clientId = UserInputManager.retrieveClientId();
       Client cl = exT.getClient(clientId);
       int accountNum = UserInputManager.retrieveAccountNumber();
       Account a = cl.getAccount(accountNum);
       
       double am = UserInputManager.retrieveTransactionAmount();
       
        if (tran == 3) {
            a.deposit(am);
        }
      
        else if (tran == 4) {
            a.withdraw(am);
        }
      
        
    }
    
}
/* 1 create a client (call it from)userinput --> add it to the arrayList in bank 
loop to keep asking the user what to choose next (default "asking") 
*/
