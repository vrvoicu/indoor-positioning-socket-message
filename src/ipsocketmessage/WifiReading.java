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
public class WifiReading extends SocketMessageObject{
    private String BSSID;
    private String SSID;
    private int level;

    public WifiReading(String BSSID, String SSID, int level) {
        this.BSSID = BSSID;
        this.SSID = SSID;
        this.level = level;
    }
    
    public void addWifiReading(WifiReading wifiReading){
        if(!wifiReading.BSSID.equals(BSSID))
            return;
        
        level = (int)((level + wifiReading.level)/2.0);
    }

    public String getBSSID() {
        return BSSID;
    }

    public void setBSSID(String BSSID) {
        this.BSSID = BSSID;
    }

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return SSID+" "+level;
    }

    @Override
    public boolean equals(Object obj) {
        WifiReading wifiReading = (WifiReading)obj;
        return wifiReading.BSSID.equals(BSSID);
    }
    
}
