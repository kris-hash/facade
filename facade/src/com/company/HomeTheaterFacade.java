package com.company;
import com.company.instruments.*;
import com.company.player.*;

public class HomeTheaterFacade {
    public Amplifier amplifier;
    public CdPlayer cdPlayer;
    public DVDPlayer dvdPlayer;
    public PopcornMachine popcornMachine;
    public Projector projector;
    public Screen screen;
    public Lights Lights;
    public Tuner tuner;

    public HomeTheaterFacade() {
        this.amplifier = new Amplifier();
        this.popcornMachine = new PopcornMachine();
        this.screen = new Screen();
        this.Lights = new Lights();

        this.tuner = new Tuner(this.amplifier);
        this.dvdPlayer = new DVDPlayer(this.amplifier);
        this.cdPlayer = new CdPlayer(this.amplifier);
        this.projector = new Projector(this.dvdPlayer);
    }

    public void watchMovie() {
        tuner.on();
        amplifier.on();
        dvdPlayer.on();
        popcornMachine.on();
        screen.down();
        projector.on();
        dvdPlayer.setDVD("disney cartoon");
        amplifier.setVolume(70);
        dvdPlayer.play();
        popcornMachine.pop();
        popcornMachine.pop();
        popcornMachine.pop();
    }

    public void endMovie() {
        Lights.on();
        dvdPlayer.pause();
        amplifier.setVolume(0);
        amplifier.off();
        dvdPlayer.off();
        popcornMachine.off();
        projector.off();
        screen.up();
    }

    public void listenToCD() {
        amplifier.on();
        cdPlayer.on();
        cdPlayer.setDVD("horror, soap, live sports");
        amplifier.setVolume(50);
        cdPlayer.play();
    }

    public void endCD() {
        cdPlayer.pause();
        amplifier.setVolume(0);
        amplifier.off();
        cdPlayer.off();
    }
}
