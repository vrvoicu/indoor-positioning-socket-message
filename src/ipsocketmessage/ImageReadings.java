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
public class ImageReadings extends SocketMessageObject{
    private ArrayList<ImageReading> images;

    public ImageReadings() {
        images = new ArrayList<ImageReading>();
    }

    public ArrayList<ImageReading> getImages() {
        return images;
    }

    public void setImages(ArrayList<ImageReading> images) {
        this.images = images;
    }
    
}
