package com.oops.abstraction;

public class TV implements RemoteService{
    @Override
    public void powerOn() {

        System.out.println("You Press PowerOn button - TV ON");
    }

    @Override
    public void powerOff() {
        System.out.println("You Press PowerOff button - TV OFF");
    }

    @Override
    public void volumeUp() {
        System.out.println("You Press VolumeUp button - TV Volume Increases");
    }

    @Override
    public void volumeDown() {
        System.out.println("You Press VolumeDown button - TV Volume Decreases");
    }
}
