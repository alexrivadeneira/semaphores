package com.company;

import netgame.chat.ChatRoomServer;
import netgame.chat.ChatRoomWindow;
import netgame.common.Hub;
import java.net.*;
import java.io.*;

public class Main {

    public static void main(String[] args) {
        try {
            new Hub(3000);

        }
        catch (IOException e){
            System.out.println("Cant make listening socket.  Shutting down");
        }
        new Hub(3000);

    }
}
