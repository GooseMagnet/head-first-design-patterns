package com.goosemagnet.facade.hometheater;

public class Projector {
    
    String name;
    
    public Projector(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Projector on");
    }

    public void wideScreenMode() {
        System.out.println(name + " Projector in widescreen mode (16x9 aspect ratio)");
    }

    public void off() {
        System.out.println(name + " Projector off");
    }
}
