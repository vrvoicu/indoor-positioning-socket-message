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
public class ARMarkerReading extends SocketMessageObject{
    private long markerId;
    private int direction;
    private double [][] vertex;
    private double [][] transMat;
    //private double [][] cameraTransMat;

    public ARMarkerReading() {
        vertex = new double[4][2];
        transMat = new double[3][4];
        //cameraTransMat = new double[3][4];
    }
    
    public void addReading(ARMarkerReading arMarkerReading){
        if(markerId != arMarkerReading.markerId)
            return;
        
        for(int i = 0; i< vertex.length; i++)
            for(int j = 0; j< vertex[0].length; j++)
                vertex[i][j] = (int)((vertex[i][j]+arMarkerReading.vertex[i][j])/2.0);
        
        for(int i = 0; i< transMat.length; i++)
            for(int j = 0; j< transMat[0].length; j++)
                transMat[i][j] = (int)((transMat[i][j]+arMarkerReading.transMat[i][j])/2.0);
        
        for(int i = 0; i< transMat.length; i++)
            for(int j = 0; j< transMat[0].length; j++)
                transMat[i][j] = (int)((transMat[i][j]+arMarkerReading.transMat[i][j])/2.0);
        
//        for(int i = 0; i< cameraTransMat.length; i++)
//            for(int j = 0; j< cameraTransMat[0].length; j++)
//                cameraTransMat[i][j] = (int)((cameraTransMat[i][j]+arMarkerReading.cameraTransMat[i][j])/2.0);
        
    }

    public long getMarkerId() {
        return markerId;
    }

    public void setMarkerId(long markerId) {
        this.markerId = markerId;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public double[][] getVertex() {
        return vertex;
    }

    public void setVertex(double[][] vertex) {
        this.vertex = vertex;
    }

    public double[][] getTransMat() {
        return transMat;
    }

    public void setTransMat(double[][] transMat) {
        this.transMat = transMat;
    }

//    public double[][] getCameraTransMat() {
//        return cameraTransMat;
//    }
//
//    public void setCameraTransMat(double[][] cameraTransMat) {
//        this.cameraTransMat = cameraTransMat;
//    }

    @Override
    public boolean equals(Object obj) {
        ARMarkerReading aRMarkerReading = (ARMarkerReading)obj;
        return aRMarkerReading.markerId == markerId;
        //return super.equals(obj); //To change body of generated methods, choose Tools | Templates.
    }
   
    
}
