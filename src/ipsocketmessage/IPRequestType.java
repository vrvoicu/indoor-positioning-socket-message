/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipsocketmessage;

import socketmessage.SocketMessageRequest;

/**
 *
 * @author victor
 */
public enum IPRequestType implements SocketMessageRequest{
    //connection related
    CLOSE_CONNECTION,
    //
    POST_READING_MARKER_WITH_IMAGE, POST_READING_MARKER_WITHOUT_IMAGE, POST_READING_ORIENTATION,
    //
    REQUEST_MAP
}
