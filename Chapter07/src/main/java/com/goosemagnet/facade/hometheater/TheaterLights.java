package com.goosemagnet.facade.hometheater;

public class TheaterLights {

    public void dim(int dimPercent) {
        System.out.println("Theater Ceiling Lights dimming to " + dimPercent + "%");
    }

    public void on() {
        System.out.println("Theater Ceiling Lights on");
    }
}
