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
public class OrientationReading extends SocketMessageObject{
    private float azimuth;
    private float pitch;
    private float roll;

    public OrientationReading(float azimuth, float pitch, float roll) {
        this.azimuth = azimuth;
        this.pitch = pitch;
        this.roll = roll;
    }
    
    public void addOrientationReading(OrientationReading or){
        azimuth = (float)((azimuth + or.getAzimuth())/2.0);
        pitch = (float)((pitch + or.getPitch())/2.0);
        roll = (float)((roll + or.getRoll()) / 2.0);
    }

    public float getAzimuth() {
        return azimuth;
    }

    public void setAzimuth(float azimuth) {
        this.azimuth = azimuth;
    }

    public float getPitch() {
        return pitch;
    }

    public void setPitch(float pitch) {
        this.pitch = pitch;
    }

    public float getRoll() {
        return roll;
    }

    public void setRoll(float roll) {
        this.roll = roll;
    }
    
}
