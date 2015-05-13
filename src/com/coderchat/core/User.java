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
public class User {
    private String username;
    private String password;

    public User(String name){
        this(name, "");
    }
    public User(String name, String pass){
        this.username = name;
        this.password = pass;
    }
    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username the username to set
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
