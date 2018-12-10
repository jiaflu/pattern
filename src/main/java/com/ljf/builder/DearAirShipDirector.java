package com.ljf.builder;

public class DearAirShipDirector implements AirShipDirector{

    private AirShipBuilder builder;

    public DearAirShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directAirShip() {
        Engine e = builder.builderEngine();
        OrbitalModule o = builder.builderOrbitalModule();
        EscapeTower et = builder.builderEscapeTower();

        // 装配成飞船
        AirShip ship = new AirShip();
        ship.setEngine(e);
        ship.setOrbitalModule(o);
        ship.setEscapeTower(et);

        return ship;
    }
}
