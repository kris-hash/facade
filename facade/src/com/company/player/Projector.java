package com.company.player;
import com.company.Amplifier;
import com.company.*;

public class Projector {
    private DVDPlayer amplifier;

    public Projector(DVDPlayer amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(this + ": on");
    }

    public void off() {
        System.out.println(this + ": off");
    }
}
