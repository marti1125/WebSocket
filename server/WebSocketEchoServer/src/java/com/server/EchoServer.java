/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server;

import javax.websocket.server.ServerEndpoint;
import javax.websocket.OnMessage;

/**
 *
 * @author Willy
 */

@ServerEndpoint("/echo")
public class EchoServer {
    
    @OnMessage
    public String Echo(String incomingMessage){
        return "I got this ("+incomingMessage+") so I am sending it back ! ";
    }
    
}
