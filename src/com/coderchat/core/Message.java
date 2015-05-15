/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.coderchat.core;

import com.coderchat.app.Globals;

/**
 *
 * @author yemikudaisi
 */
public class Message {
    
    private User destination;
    private User from;
    private String content;
    private RequestType request;
    
    public Message(){
        this( new User("destination_user"), new User(Globals.getLoginUser()), "", RequestType.BROADCAST_MESSAGE);
    }
    public Message(String data){
        this( new User(""), new User(""), data, RequestType.BROADCAST_MESSAGE);
    }
    
    public Message( User dest, User from, String c, RequestType req){
        this.destination = dest;
        this.from = from;
        this.content = c;
        this.request = req;
    }

    /**
     * @return the destination
     */
    public User getDestination() {
        return destination;
    }

    /**
     * @param destination the destination to set
     */
    public void setDestination(User destination) {
        this.destination = destination;
    }

    /**
     * @return the from
     */
    public User getFrom() {
        return from;
    }

    /**
     * @param from the from to set
     */
    public void setFrom(User from) {
        this.from = from;
    }

    /**
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the request
     */
    public RequestType getRequest() {
        return request;
    }

    /**
     * @param request the request to set
     */
    public void setRequest(RequestType request) {
        this.request = request;
    }
    
    
}
