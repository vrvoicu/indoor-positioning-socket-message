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
public class PhoneDetails extends SocketMessageObject{
    
    private String imei;
    private String phoneName;

    public PhoneDetails(String imei, String phoneName) {
        this.imei = imei;
        this.phoneName = phoneName;
    }
    

    public String getImei() {
        return imei;
    }

    public void setImei(String phoneId) {
        this.imei = phoneId;
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phone) {
        this.phoneName = phone;
    }
    
}
