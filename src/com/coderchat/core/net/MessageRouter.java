/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderchat.core.net;

import com.coderchat.core.Message;
import com.coderchat.core.NetworkConnectionService;
import com.coderchat.core.helpers.DialogHelper;
import com.google.gson.Gson;
import java.io.IOException;
import java.net.SocketException;

/**
 *
 * @author yemikudaisi
 */
public class MessageRouter implements Runnable {
    private final Message chatMessage;
    private final Gson gson = new Gson();
    
    public MessageRouter(Message message){
        this.chatMessage = message;
    }
    
    @Override
    public void run(){
        String text = gson.toJson(chatMessage);
        try{
            //NetworkConnectionService.getOutStream().writeBytes(text);
            NetworkConnectionService.getOutWriter().println(text);
            //DialogHelper.showMessage("Test", NetworkConnectionService.getInBufferReader().readLine());
        }catch(SocketException ex){
            NetworkConnectionService.resetConnection();
        }catch (IOException ex) {
            DialogHelper.showError(ex);
        } 
    }
}
