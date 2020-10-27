package com.goosemagnet.facade.hometheater;

public class DvdPlayer {

    String name;
    String movie;
    
    public DvdPlayer(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " DVD Player on");
    }

    public void play(String movie) {
        this.movie = movie;
        System.out.println(name + " DVD Player playing \"" + movie + "\"");
    }

    public void stop() {
        System.out.println(name + " DVD Player stopped \"" + movie + "\"");
    }

    public void eject() {
        System.out.println(name + " DVD Player eject");
    }

    public void off() {
        System.out.println(name + " DVD Player off");
    }
}
