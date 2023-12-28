package com.zegasoftware;

import java.util.List;

public record User(String username, String password) {

    public void addOrder(List<? super Order> orderHistory, final Order order) {
        orderHistory.add(order);
    }

    public void getOrderHistory(List<? extends Order> orderHistory) {
        for (Order or : orderHistory) {
            System.out.println(or);
            for (Items i : or.items()) {
                System.out.println(i);
            }
        }
    }
}
