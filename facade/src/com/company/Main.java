package com.company;

public class Main {

    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade();

        homeTheaterFacade.watchMovie();
        homeTheaterFacade.endMovie();
        homeTheaterFacade.listenToCD();
        homeTheaterFacade.endCD();
    }
}
