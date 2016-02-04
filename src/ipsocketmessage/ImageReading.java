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
public class ImageReading extends SocketMessageObject{
    private byte[] image;

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
    
}
