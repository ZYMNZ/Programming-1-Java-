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
public class Bank {
    private String bankNumber;
    private String address;
    private ArrayList<Client> clientList;
    
    public String getBankNumber() {
        return this.bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Client> getClientList() {
        return clientList;
    }

    public void setClientList(ArrayList<Client> clientList) {
        this.clientList = clientList;
    }

    
    public Bank(){
        this.clientList= new ArrayList<Client>();
    }
    
    public void addClient(Client addCl){
        this.clientList.add(addCl);
    }
    
    public void displayClientAccounts(int clId){
        Client cl = getClient(clId);
        cl.displayAccounts();
      
    }
    
    public void displayClientList(){
        for (int i = 0; i < clientList.size(); i++) {
            System.out.println(clientList.get(i));
        }
    }
    
    public Client getClient(int clientId){
        for (int i = 0; i < clientList.size(); i++) {
            
            if(clientList.get(i).getClientId() == clientId){
                return clientList.get(i);
            }
        }
        return null;
    }
    
    public Account getClientAccount(int getClAcc, int getCA){
        
        Client clAcc = getClient(getCA);
        Account a = clAcc.getAccount(getCA);
        return a;
    }
    
    public void displayAllAccounts(){
       
        for (int i = 0; i <clientList.size(); i++) {
            clientList.get(i).displayAccounts();
        }
    }
    
    public void displayAllTransactions(){
        for (int i = 0; i <clientList.size(); i++) {
            Client c = clientList.get(i);
            for (int j = 0; j < c.getAccountList().size(); j++) {
                Account a = c.getAccountList().get(j);
                a.displayAllTransactions();
            }
        }
    }
}
