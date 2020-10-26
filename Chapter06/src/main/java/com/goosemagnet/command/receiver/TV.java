package com.goosemagnet.command.receiver;

public class TV {

    String location;

    public TV(String location) {
        this.location = location;
    }

    public void off() {
        System.out.println(location + " TV is off");
    }

    public void on() {
        System.out.println(location + " TV is on");
    }
}
