package com.oops.abstraction;

public class DVD implements RemoteService{
    @Override
    public void powerOn() {

        System.out.println("You Press PowerOn button - DVD ON");
    }

    @Override
    public void powerOff() {
        System.out.println("You Press PowerOff button - DVD OFF");
    }

    @Override
    public void volumeUp() {
        System.out.println("You Press VolumeUp button - DVD Volume Increases");
    }

    @Override
    public void volumeDown() {
        System.out.println("You Press VolumeDown button - DVD Volume Decreases");
    }
}
