package com.goosemagnet.command.receiver;

public class Light {

    String location;

    public Light() {

    }

    public Light(String location) {
        this.location = location;
    }

    public void off() {
        System.out.println(location + " Light is Off");
    }

    public void on() {
        System.out.println(location + " Light is On");
    }
}
