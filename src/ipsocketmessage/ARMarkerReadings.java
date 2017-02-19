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
    
    public void addArMakerReading(ARMarkerReading arMR){
        int index = containes(arMR);
        
        if(index == -1){
            arMarkerReadings.add(arMR);
            return;
        }
        
        arMarkerReadings.get(index).addReading(arMR);
    }
    
    public void addArMarkerReadings(ArrayList<ARMarkerReading> arMRs){
        for(ARMarkerReading arMarkerReading: arMRs)
            addArMakerReading(arMarkerReading);
    }
    
    public void addArMarkerReadings(ARMarkerReadings arMRs){
        addArMarkerReadings(arMRs.getArMarkerReadings());
    }
    
    public int containes(ARMarkerReading arMR){
        
        for(int index = 0; index < arMarkerReadings.size(); index++)
            if(arMarkerReadings.get(index).equals(arMR))
                return index;
        
        return -1;
    }
    
}
