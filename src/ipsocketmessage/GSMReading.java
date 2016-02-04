/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsocketmessage;

import socketmessage.SocketMessageObject;

/**
 *
 * @author victor
 */
public class GSMReading extends SocketMessageObject {

    private int rssi;
    private String cid;

    public GSMReading(int rssi, String cid) {
        this.rssi = rssi;
        this.cid = cid;
    }
    
    public void addGSMReading(GSMReading gsmReading){
        if(!cid.equals(gsmReading.cid))
            return;
        
        rssi = (int)((rssi + gsmReading.rssi)/2.0);
    }

    public int getRssi() {
        return rssi;
    }

    public void setRssi(int rssi) {
        this.rssi = rssi;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
    
}
