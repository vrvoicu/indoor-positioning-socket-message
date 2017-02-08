/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsocketmessage;

import java.util.ArrayList;
import java.util.List;
import socketmessage.SocketMessageObject;

/**
 *
 * @author victor
 */
public class Readings extends SocketMessageObject{
    private List<Reading> readings;
    private String readingsInfo;

    public Readings(){
        this.readings = new ArrayList<Reading>();
    }
    
    public Readings(List<Reading> readings) {
        this.readings = readings;
    }
    
    public void addReading(Reading reading){
        this.readings.add(reading);
    }

    public String getReadingsInfo() {
        return readingsInfo;
    }

    public List<Reading> getReadings() {
        return readings;
    }

    public void setReadings(List<Reading> readings) {
        this.readings = readings;
    }

    public void setReadingsInfo(String readingsInfo) {
        this.readingsInfo = readingsInfo;
    }
    
}
