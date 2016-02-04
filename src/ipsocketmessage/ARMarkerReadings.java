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
public class ARMarkerReadings extends SocketMessageObject{
    
    private ArrayList<ARMarkerReading> arMarkerReadings;
    
    public ARMarkerReadings(){
        arMarkerReadings = new ArrayList<ARMarkerReading>();
    }

    public ArrayList<ARMarkerReading> getArMarkerReadings() {
        return arMarkerReadings;
    }

    public void setArMarkerReading(ArrayList<ARMarkerReading> arMarkerReadings) {
        this.arMarkerReadings = arMarkerReadings;
    }
    
}
