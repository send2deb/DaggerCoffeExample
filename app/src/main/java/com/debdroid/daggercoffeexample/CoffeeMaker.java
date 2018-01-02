package com.debdroid.daggercoffeexample;

import javax.inject.Inject;


/**
 * Created by debashispaul on 02/01/2018.
 */

class CoffeeMaker {
    private final Heater heater;
    private final Pump pump;

    @Inject
    CoffeeMaker(Heater heater, Pump pump) {
        this.heater = heater;
        this.pump = pump;
    }

    public void brew() {
        heater.on();
        pump.pump();
        System.out.println(" [_]P coffee! [_]P ");
        heater.off();
    }
}
