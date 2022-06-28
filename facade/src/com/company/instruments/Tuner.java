package com.company.instruments;
import com.company.Amplifier;
public class Tuner {
    private Amplifier amplifier;

    public Tuner(Amplifier amplifier) {
        this.amplifier = amplifier;
    }

    public void on() {
        System.out.println(this + ": on");
    }

    public void off() {
        System.out.println(this + ": off");
    }

    public void setAM(int value) {
        System.out.println(this + ": AM set to" + value);
    }

    public void setFM(float value) {
        System.out.println(this + ": FM set to" + value);
    }
}
