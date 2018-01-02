package com.debdroid.daggercoffeexample;

import javax.inject.Inject;

/**
 * Created by debashispaul on 02/01/2018.
 */

class Thermosiphon implements Pump {
    private final Heater heater;

//    @Inject
    Thermosiphon(Heater heater) {
        this.heater = heater;
    }

    @Override public void pump() {
        if (heater.isHot()) {
            System.out.println("=> => pumping => =>");
        }
    }
}
