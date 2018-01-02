package com.debdroid.daggercoffeexample;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by debashispaul on 02/01/2018.
 */

@Singleton
@Component(modules = {CoffeeMakerModule.class})
public interface CoffeeShopComponent {
    CoffeeMaker coffeMaker();
}
