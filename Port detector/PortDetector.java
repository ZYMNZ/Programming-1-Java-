/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;

/**
 *
 * @author yaman
 */
public class PortDetector {
private static ArrayList<Socket> SocketList;

    public ArrayList<Socket> getSocketList() {
        return this.SocketList;
    }

    public void setSocketList(ArrayList<Socket> SocketList) {
        this.SocketList = SocketList;
    }

    public PortDetector() {
    }
    
            
    public static void main(String[] args) {
     
       for(int i = 105; i <= 200; i++){
           IPAddress ip = new IPAddress("155.220.203" + i);
            Socket s; 
            s = new Socket(21,ip);
            addSocket(s);
            s = new Socket(23,ip);
            addSocket(s);
             s = new Socket(80,ip);
            addSocket(s);
             s = new Socket(443,ip);
            addSocket(s);
       }
       displayList();
    }
    
    public static void addSocket(Socket s){
        SocketList.add(s);
    }
    
    public static void displayList(){
        for (int i = 0; i < SocketList.size(); i++) {
            System.out.println(SocketList.get(i));
            
        }
    }
    
}
