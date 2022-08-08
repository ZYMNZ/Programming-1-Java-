/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yaman
 */
public class IPAddress {
    private String ip;
    private String url;
    private String domainName;

    public String getIp() {
        return this.ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getUel() {
        return this.url;
    }

    public void setUel(String url) {
        this.url = url;
    }

    public String getDomainName() {
        return this.domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    public IPAddress(){
        this.ip="";
        this.url="";
        this.domainName="";
    }
    
    public IPAddress(String ip){
        this.ip=ip;
        this.url="";
        this.domainName="";
        
    }
            
    public IPAddress(String ip,String url ){
        this.ip=ip;
        this.url=url;
        this.domainName="";
        
    }
            
    public IPAddress(String ip, String url, String domain){
        this.ip=ip;
        this.url=url;
        this.domainName=domain;
        
    }
    
    @Override
    public String toString() { 
      
        return ip;
    }
   
            
    
}
