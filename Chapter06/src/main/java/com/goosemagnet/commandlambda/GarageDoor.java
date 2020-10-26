package com.goosemagnet.commandlambda;

public class GarageDoor {

    String location;

    public GarageDoor() {

    }

    public GarageDoor(String location) {
        this.location = location;
    }

    public void up() {
        System.out.println(location + "Garage Door is Open");
    }

    public void down() {
        System.out.println(location + "Garage Door is Closed");
    }

    public void stop() {
        System.out.println(location + "Garage Door is Stopped");
    }

    public void lightOn() {
        System.out.println(location + "Garage Door Light is On");
    }

    public void lightOff() {
        System.out.println(location + "Garage Door Light is Off");
    }
}
