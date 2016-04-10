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
public class BitmapImage extends SocketMessageObject{
    private int image[];
    private int size[];
    
    public BitmapImage(int image[], int size[]){
        this.image = image;
        this.size = size;
    }

    public int[] getImage() {
        return image;
    }

    public void setImage(int[] image) {
        this.image = image;
    }

    public int[] getSize() {
        return size;
    }

    public void setSize(int[] size) {
        this.size = size;
    }
    
}
