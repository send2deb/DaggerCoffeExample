package com.debdroid.daggercoffeexample;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by debashispaul on 02/01/2018.
 */

@Module
public class CoffeeMakerModule {

    @Provides
    @Singleton
    Heater provideHeater() {
        return new ElectricHeater();
    }

    @Provides
    @Singleton
    Pump providePump(Thermosiphon pump) {
        return pump;
    }

    // If constructor @Inject is not used for Thermosiphon then this @Provides is needed to get an instance of Thermosiphon
    @Provides
    @Singleton
    Thermosiphon provideThermosiphon(Heater heater) {
        return new Thermosiphon(heater);
    }
}
