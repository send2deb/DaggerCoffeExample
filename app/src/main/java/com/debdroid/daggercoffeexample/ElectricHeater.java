package com.debdroid.daggercoffeexample;

/**
 * Created by debashispaul on 02/01/2018.
 */

class ElectricHeater implements Heater {
    boolean heating;

    @Override public void on() {
        System.out.println("~ ~ ~ heating ~ ~ ~");
        this.heating = true;
    }

    @Override public void off() {
        this.heating = false;
    }

    @Override public boolean isHot() {
        return heating;
    }
}
