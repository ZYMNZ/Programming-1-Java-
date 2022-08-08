
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaman
 */
public class LoanAccount {
    private String type;
    private String accountNumber;
    private Date dateReleased;
    private double loanAccount;
    
    public LoanAccount(){}

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Date getDateReleased() {
        return this.dateReleased;
    }

    public void setDateReleased(Date dateReleased) {
        this.dateReleased = dateReleased;
    }

    public double getLoanAccount() {
        return this.loanAccount;
    }

    public void setLoanAccount(double loanAccount) {
        this.loanAccount = loanAccount;
    }
    
    
    public void renew(){}
    public void extend(){}
    
    
            
}
