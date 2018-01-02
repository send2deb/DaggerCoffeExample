package com.debdroid.daggercoffeexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CoffeeShopComponent coffeeShopComponent = DaggerCoffeeShopComponent.builder()
                .coffeeMakerModule(new CoffeeMakerModule())
                .build();

        coffeeShopComponent.coffeMaker().brew();
    }
}
