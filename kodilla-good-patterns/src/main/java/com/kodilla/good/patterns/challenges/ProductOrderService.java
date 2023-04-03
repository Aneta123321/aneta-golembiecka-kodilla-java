package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

        private InformationService informationService; //serwis ktory bedzie wyciagal informacje
        private OrderService orderService; // serwis sluzacy do zakupow  // to sa atrybuty typu obiektowego
        private OrderRepository orderRepository;

        public ProductOrderService(final InformationService informationService,
                               final OrderService orderService,
                               final OrderRepository orderRepository) {
            this.informationService = informationService;
            this.orderService = orderService;
            this.orderRepository = orderRepository;   // konstruktor
        }

        public OrderDto process(final OrderRequest orderRequest) {
            boolean isOrdered = orderService.order(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());

            if (isOrdered) {
                informationService.inform(orderRequest.getUser());
                orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getQuantity());
                return new OrderDto(orderRequest.getUser(), true);
            } else {
                return new OrderDto(orderRequest.getUser(), false);
            }
        }
}
