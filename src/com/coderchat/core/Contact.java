/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.coderchat.core;
/**
 *
 * @author yemikudaisi
 * @email yemikudaisi@gmail.com
 */
public class Contact {
    private String userName;
    private String displayName;
    private UserStatus status;
    
  
    public Contact(String name){
        this.userName = name;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
        this.setStatus(UserStatus.OFFLINE);
    }

    /**
     * @return the status
     */
    public UserStatus getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(UserStatus status) {
        this.status = status;
    }

    /**
     * @return the displayName
     */
    public String getDisplayName() {
        return displayName;
    }
}
