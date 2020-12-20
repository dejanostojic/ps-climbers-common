/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dostojic.climbers.common.communication;

import java.io.ObjectInputStream;
import java.net.Socket;

/**
 *
 * @author planina
 */
public class Receiver {

    private Socket socket;

    public Receiver(Socket socket) {
        this.socket = socket;
    }

    public Object receive() throws Exception {
        try {
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());
            Object object = in.readObject();

            System.out.println("DEBUG: recieving: " + object);

            return object;
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("Error receiving object!\n" + e.getMessage());
        }
    }
}
