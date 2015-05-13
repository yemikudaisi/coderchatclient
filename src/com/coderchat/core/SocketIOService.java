/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.coderchat.core;

import com.github.nkzawa.socketio.client.IO;
import com.github.nkzawa.socketio.client.Socket;
import com.google.gson.Gson;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yemikudaisi
 * @version Expression version is undefined on line 13, column 15 in Templates/Classes/Class.java.
 */
public class SocketIOService {
    Socket socket = null;
    private Gson gson = new Gson();
    
    public SocketIOService(){
        try {
            socket = IO.socket("http://localhost:8000/");
        } catch (URISyntaxException ex) {
            Logger.getLogger(SocketIOService.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Socket connect = socket.connect();
    }
    
    public void sendBroadCast(Message msg){
        //socket.emit(msg.getRequest().toString(), gson.toJson(msg));
    }
}
