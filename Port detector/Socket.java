/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaman
 */public class Socket {
    private int portNumber;
    private IPAddress ip;
    
    
    public int getPortNumber() {
        return this.portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public IPAddress getIp() {
        return this.ip;
    }

    public void setIp(IPAddress ip) {
        this.ip = ip;
    }
    
    public Socket(){
        this.portNumber=0;
        this.ip=null;
    }
    public Socket(int port, IPAddress ip){
        this.portNumber=port;
        this.ip=ip;
    }

    public boolean run(){
        
        return true;
        
    }
   
    @Override
    public String toString() { 

        return "Port number " + portNumber + " at " + ip ;
    }
   
}
