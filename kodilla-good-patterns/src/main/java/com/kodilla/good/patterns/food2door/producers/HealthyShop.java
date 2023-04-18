package com.kodilla.good.patterns.food2door.producers;

import com.kodilla.good.patterns.food2door.OrderRequest;

public class HealthyShop implements Producers{
        private final String name = "HealthyShop";


        @Override
        public void process(OrderRequest orderRequest) {
            System.out.println("Producent " + name + " zrealizowal zamowienie");
            System.out.println(orderRequest);
        }
    }



