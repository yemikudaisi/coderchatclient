/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.coderchat.app;

import com.coderchat.core.NetworkConnectionService;
import java.io.IOException;

/**
 *
 * @author yemikudaisi
 * @version Expression version is undefined on line 13, column 15 in Templates/Classes/Class.java.
 */
public class Globals {
    public static String getAppName(){
        return "CoderChat";
    }
    
    public static String getLoginUser(){
        return "yemikudaisi";
    }
    
    public static void init() throws IOException{
        NetworkConnectionService.openSocket();
    }
    
//TODO Add threadExcutor to project
}
