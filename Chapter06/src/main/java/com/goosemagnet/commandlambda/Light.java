package com.goosemagnet.commandlambda;

public class Light {

    String location;

    public Light(String location) {
        this.location = location;
    }

    public void off() {
        System.out.println(location + " light is off");
    }

    public void on() {
        System.out.println(location + " light is on");
    }
}
