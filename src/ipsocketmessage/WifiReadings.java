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
public class WifiReadings extends SocketMessageObject {

    private ArrayList<WifiReading> wifiReadings;

    public WifiReadings() {
        wifiReadings = new ArrayList<WifiReading>();
    }

    public ArrayList<WifiReading> getWifiReadings() {
        return wifiReadings;
    }

    public void setWifiReadings(ArrayList<WifiReading> wifiReadings) {
        this.wifiReadings = wifiReadings;
    }

    public void addWifiReadings(WifiReadings wRs) {
        for (WifiReading wifiReading : wRs.getWifiReadings()) {
            addWifiReading(wifiReading);
        }
    }

    public void addWifiReading(WifiReading wR) {
        for (WifiReading wifiReading : wifiReadings) {
            if (wifiReading.equals(wR)) {
                wifiReading.addWifiReading(wR);
                return;
            }
        }

        wifiReadings.add(wR);
    }

    public int indexOf(WifiReading wR) {

        for (int index = 0; index < wifiReadings.size(); index++) {
            if (wifiReadings.get(index).equals(wR)) {
                return index;
            }
        }

        return -1;
    }

//    public boolean containes(WifiReading wR){
//        boolean containes = false;
//        
//        for(WifiReading wifiReading: wifiReadings)
//            if(wifiReading.equals(wR)){
//                containes = true;
//                break;
//            }
//                
//        return containes;
//    }
}
