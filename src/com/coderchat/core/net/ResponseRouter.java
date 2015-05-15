/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.coderchat.core.net;

import com.coderchat.core.Message;
import com.coderchat.core.NetworkConnectionService;
import com.google.gson.Gson;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yemi Kudaisi
 * @email yemikudaisi@gmail.com
 */
public class ResponseRouter implements Runnable {
    
    public void run(){
        Gson gson = new Gson();
        while(true){
            try {
                String inLine = NetworkConnectionService.getInBufferReader().readLine();
                Object response = gson.fromJson(inLine, Object.class);
                System.out.println("obj type:" + response.getClass().toString());
                //switch(response){
                    
                //}
            } catch (IOException ex) {
                continue;
                //Logger.getLogger(ResponseRouter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
