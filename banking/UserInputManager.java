package banking;
import java.util.Scanner;
/**
 *
 * @author yaman
 */
public abstract class UserInputManager {
    public static int retrieveAccountNumber(){
        int accountNumber = 0;
        Scanner accNum = new Scanner(System.in);
        System.out.println("Please enter your account number: ");
        accountNumber = accNum.nextInt();
    
        return accountNumber;
    }
    public static Account retrieveAccountType(){
        String accountType = "";
        Scanner accType = new Scanner(System.in);
        System.out.println("Please enter your account type (Saving / Checking) ");
        accountType = accType.next();
        if(accountType.equalsIgnoreCase("Saving")){
            SavingsAccount sa = new SavingsAccount();
            return sa;
        }
        else if(accountType.equalsIgnoreCase("Checking")){
            CheckingAccount ca = new CheckingAccount();
            return ca;
        }
        
        return null;
    }

    public static int retrieveClientId(){
        int clientId = 0;
        Scanner clid = new Scanner(System.in);
        System.out.println("Please enter your ID number: ");
        clientId = clid.nextInt();
                
        return clientId;
    }

    public static Client retrieveClientInfo(){
         Client cl = new Client("","");
        Scanner clinfo = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        cl.setFirstName(clinfo.next()) ;
        System.out.println("Please enter your last name: "); 
        cl.setLastName(clinfo.next()) ;
        
        return cl ;
    }
    


    public static double retrieveTransactionAmount(){
        double transactionAmount = 0.0;
        Scanner trAmount = new Scanner(System.in);
        System.out.println("Please enter your Transaction Amount: ");
        transactionAmount = trAmount.nextDouble();
                
        return transactionAmount;
    }

    public static int retrieveUserOption(){
        int userOption = 0;
        Scanner usop = new Scanner(System.in);
        System.out.println("Please choose one of the following options: \n" +
         "[1] Add a new Client  \n" +
         "[2] Create a new Account \n" +
         "[3] Make a Deposit             \n" +
         "[4] Make a Withdrawal \n" +
         "[5] List Account Transactions  \n" +
         "[6] List Clients \n" +
         "[7] List Client Accounts  \n" +
         "[0] Exit the application  ");
        userOption = usop.nextInt();
        
        
        return userOption;
    }
    
}
  