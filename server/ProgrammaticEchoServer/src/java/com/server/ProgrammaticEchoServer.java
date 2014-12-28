/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.server;

import java.io.IOException;
import javax.websocket.Endpoint;
import javax.websocket.EndpointConfig;
import javax.websocket.MessageHandler;
import javax.websocket.Session;

/**
 *
 * @author Willy
 */
public class ProgrammaticEchoServer extends Endpoint {

    @Override
    public void onOpen(Session session, EndpointConfig config) {
       final Session mySession = session;
       mySession.addMessageHandler(new MessageHandler.Whole<String>() {
           @Override
           public void onMessage(String message) {
               try {
                   mySession.getBasicRemote().sendText("I got this ("+message+") so I am sending it back ! ");
               } catch (IOException ioe) {
                   System.out.println("Erro:  " + ioe.getMessage());
               }
           }
       });
    }
    
}
