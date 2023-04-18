
package com.kodilla.good.patterns.food2door;


import com.kodilla.good.patterns.food2door.producers.ExtraFoodShop;
import com.kodilla.good.patterns.food2door.producers.GlutenFreeShop;
import com.kodilla.good.patterns.food2door.producers.HealthyShop;
import com.kodilla.good.patterns.food2door.producers.Producers;

public class OrderProcessor {

    public void process(OrderRequest orderRequest) {
        Producers producer = getProducer(orderRequest);
        if (producer != null) {
            producer.process(orderRequest);
        }
    }

    private Producers getProducer(OrderRequest orderRequest) {
        switch (orderRequest.getProducer().getClass().getSimpleName()) {
            case "ExtraFoodShop" -> {
                return new ExtraFoodShop();
            }
            case "GlutenFreeShop" -> {
                return new GlutenFreeShop();
            }
            case "HealthyShop" -> {
                return new HealthyShop();
            }
        }
        return null;
    }
}