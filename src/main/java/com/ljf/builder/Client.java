package com.ljf.builder;

public class Client {

    public static void main(String[] args) {
        AirShipDirector director = new DearAirShipDirector(new DearAirShipBuilder());

        AirShip ship = director.directAirShip();

        ship.launch();
    }
}
