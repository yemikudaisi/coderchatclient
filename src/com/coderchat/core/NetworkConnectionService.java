/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderchat.core;

import com.coderchat.core.helpers.DialogHelper;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author yemikudaisi
 */
public class NetworkConnectionService {
    // TODO Check fo internet connection
    // TODO Handle attempt to reconnect to the Server after a fixed timeout
    
    private static final String serverURL = "127.0.0.1";
    private static final int serverPort = 8000;
    private static Socket clientSocket = null;
    // out
    private static DataOutputStream outStream = null;
    private static PrintWriter outWriter = null;
    // in
    private static BufferedReader inReader = null;
    
    public static void init(){
        
    }
    /**
     * @return the serverURL
     */
    public static String getServerURL() {
        return serverURL;
    }

    /**
     * @return the serverPort
     */
    public static int getServerPort() {
        return serverPort;
    }
    
    public static DataOutputStream getOutStream() throws IOException{
        if (clientSocket == null){
            clientSocket =  new Socket(serverURL, serverPort);
        }else if (outStream == null){
            outStream = new DataOutputStream(clientSocket.getOutputStream());
        }
        return outStream;
    }
    
    public static PrintWriter getOutWriter() throws IOException{
        if (clientSocket == null){
            clientSocket =  new Socket(serverURL, serverPort);
        }else if (outWriter == null){
            outWriter= new PrintWriter(clientSocket.getOutputStream(), true);
        }
        return outWriter;
    }
    
    public static BufferedReader getInBufferReader() throws IOException{
        return new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
    }
    
    public static void close() throws IOException{
        outStream.close();
        clientSocket.close();
    }
    
    public static void resetConnection(){
        try {
            clientSocket =  new Socket(serverURL, serverPort);
            outStream = new DataOutputStream(clientSocket.getOutputStream());
            outWriter= new PrintWriter(clientSocket.getOutputStream());
        } catch (IOException ex) {
            Logger.getLogger(NetworkConnectionService.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void openSocket()throws IOException {
        clientSocket =  new Socket(serverURL, serverPort);
    }
}
