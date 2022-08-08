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
public class Client {
    private static int counter = 0;
    private int clientId;
    private String firstName;
    private String lastName;
    private ArrayList<Account> accountList;
    
    
    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getClientId() {
        return this.clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public ArrayList<Account> getAccountList() {
        return this.accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }

        
    public Client(String firstN,String lastN){
        counter++;
        this.clientId = counter;
        this.firstName = firstN;
        this.lastName = lastN;
        this.accountList = new ArrayList<Account>();
    }
    
    public void addAccount(Account addAcc){
        this.accountList.add(addAcc);
    }
    
    public  Account getAccount(int getAcc){
        for (int i = 0; i < accountList.size(); i++) {
            if(accountList.get(i).getAccountNumber() == getAcc){
                return accountList.get(i);
            }
        }return null;
    }
    
    public  void displayAccounts(){
        for (int i = 0; i < accountList.size(); i++) {
            System.out.println(accountList.get(i));
        }

    }

    @Override
    public String toString() {
        return "Name: " + getFirstName() + " " + getLastName() + "; Client ID: " + getClientId();
            
    }
  
   
    
}
