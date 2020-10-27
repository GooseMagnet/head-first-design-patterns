package com.goosemagnet.facade.hometheater;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        String name = "Top-O-Line";
        Amplifier amp = new Amplifier(name);
        Tuner tuner = new Tuner();
        DvdPlayer dvd = new DvdPlayer(name);
        CdPlayer cd = new CdPlayer();
        Projector projector = new Projector(name);
        Screen screen = new Screen();
        TheaterLights lights = new TheaterLights();
        PopcornPopper popper = new PopcornPopper();

        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);

        homeTheater.watchMovie("Raiders of the Lost Ark");
        homeTheater.endMovie();
    }
}
