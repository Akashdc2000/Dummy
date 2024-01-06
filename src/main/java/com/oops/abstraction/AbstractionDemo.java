package com.oops.abstraction;

public class AbstractionDemo {

    public static void main(String[] args) {
        System.out.println("Abstraction Demo");

        System.out.println("------------------------------------------------");
        RemoteService TVRemoteService = new TV();
        TVRemoteService.powerOn();
        TVRemoteService.volumeUp();
        TVRemoteService.volumeDown();
        TVRemoteService.powerOff();

        System.out.println("------------------------------------------------");
        RemoteService DVDRemoteService = new DVD();
        DVDRemoteService.powerOn();
        DVDRemoteService.volumeUp();
        DVDRemoteService.volumeDown();
        DVDRemoteService.powerOff();


    }
}
