package com.goosemagnet.facade.hometheater;

public class Amplifier {
    
    String name;
    
    public Amplifier(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println(name + " Amplifier on");
    }

    public void off() {
        System.out.println(name + " Amplifier off");
    }

    public void setDvd(DvdPlayer dvd) {
        System.out.println(name + " Amplifier setting DVD player to " + name);
    }

    public void setSurroundSound() {
        System.out.println(name + " Amplifier surround sound on (5 speakers, 1 subwoofer)");
    }

    public void setVolume(int volume) {
        System.out.println(name + " Amplifier setting volume to " + volume);
    }
}
