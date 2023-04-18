package com.kodilla.good.patterns.food2door;

import com.kodilla.good.patterns.food2door.producers.Producers;

public class OrderRequest {
    private Order order;
    private Producers producer;

    public OrderRequest(Order order, Producers producer) {
        this.order = order;
        this.producer = producer;
    }

    public Order getOrder() {
        return order;
    }

    public Producers getProducer() {

        return producer;
    }

    @Override
    public String toString() {
        return "Zamowienie : " + order + ", Producent: " + producer;
    }
}
