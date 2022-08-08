/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banking;

import java.util.ArrayList;

/**
 *
 * @author yaman
 */
public class Account {
    private static int counter = 0;
    protected int accountNumber;
    protected double balance;
    protected Client owner;
    protected ArrayList<Transaction> transactions;
    protected String type;
    
        public Account(String type){
        counter ++;
        this.accountNumber = counter;
        this.balance = 0.0;
        this.owner = getOwner();
        this.transactions = new ArrayList<Transaction>();
        this.type = type;
    }

    public int getCounter() {
        return Account.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Client getOwner() {
        return this.owner;
    }

    public void setOwner(Client owner) {
        this.owner = owner;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }

    
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }
    

    public  double deposit(double dep){
       Transaction tran1 = new Transaction("Deposit", dep); 
       addTransaction(tran1);
       
       return this.balance;
    }
    
    public  double withdraw(double wit){
        
       Transaction tran2 = new Transaction("Withdraw", wit); 
       addTransaction(tran2);
       
       return this.balance;
    }
    
    public void addTransaction(Transaction addT){
        this.transactions.add(addT);
    }
    
    public void displayAllTransactions(){
        for (int i = 0; i < transactions.size(); i++) {
            System.out.println(transactions.get(i));
        }
    }

    @Override
    public String toString() {
        return "Name: " + getOwner().getFirstName() + " " + getOwner().getLastName() + "; " + this.getType() + ", " + this.getAccountNumber();
    }
    
    
    
}
