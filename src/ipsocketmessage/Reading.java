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
public class Reading extends SocketMessageObject{
    private ARMarkerReadings aRMarkerReadings;
    private WifiReadings wifiReadings;
    private OrientationReading orientationReading;

    public Reading(ARMarkerReadings aRMarkerReadings, WifiReadings wifiReadings, OrientationReading orientationReading) {
        this.aRMarkerReadings = aRMarkerReadings;
        this.wifiReadings = wifiReadings;
        this.orientationReading = orientationReading;
    }

    public ARMarkerReadings getaRMarkerReadings() {
        return aRMarkerReadings;
    }

    public void setaRMarkerReadings(ARMarkerReadings aRMarkerReadings) {
        this.aRMarkerReadings = aRMarkerReadings;
    }

    public WifiReadings getWifiReadings() {
        return wifiReadings;
    }

    public void setWifiReadings(WifiReadings wifiReadings) {
        this.wifiReadings = wifiReadings;
    }

    public OrientationReading getOrientationReading() {
        return orientationReading;
    }

    public void setOrientationReading(OrientationReading orientationReading) {
        this.orientationReading = orientationReading;
    }
    
}
