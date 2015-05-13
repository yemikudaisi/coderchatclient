/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.coderchat.core;

/**
 *
 * @author Yemi Kudaisi
 * @email yemikudaisi@gmail.com
 */
public class LoginMessage extends Message {
    
    private User user;
    public LoginMessage(User u){
        this.user =u;  
        super.setRequest(RequestType.LOGIN);
    }

}
