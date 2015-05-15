package com.coderchat.core;

/**
 *
 * @author yemikudaisi
 * 
 * This enum is used to specify the protocol for interpreting transmissions
 * between the server and clients
 * 
 *  AUTH    -   Authentication (i.e Login)
 *  PRP     -   Profile Request Protocol   
 *  FLP     -   Friend List Update Protocol
 *  IMP     -   Instant Message Protocol
 *  BMP     -   Broadcast message protocol
 *  FSP     -   File System protocol
 *  SFP     -   Single File protocol
 *  SCP     -   Source code protocol
 */
public enum RequestType {
    AUTH, PRP, FLP, IMP, BROADCAST_MESSAGE, FILESYSTEM, FILE;
}
