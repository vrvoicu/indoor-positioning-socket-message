/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsocketmessage;

import java.util.ArrayList;
import socketmessage.SocketMessageObject;

/**
 *
 * @author victor
 */
public class WifiReadings extends SocketMessageObject{
    private ArrayList<WifiReading> wifiReadings;
    
    public WifiReadings(){
        wifiReadings = new ArrayList<WifiReading>();
    }

    public ArrayList<WifiReading> getWifiReadings() {
        return wifiReadings;
    }

    public void setWifiReadings(ArrayList<WifiReading> wifiReadings) {
        this.wifiReadings = wifiReadings;
    }
    
}
