package com.zegasoftware;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public record Order(int ID, String title, List<Items> items, LocalDateTime date) {

    public BigDecimal getTotalPrice() {
        BigDecimal totalPrice = BigDecimal.valueOf(0.0);
        for (Items item : items) {
            totalPrice = totalPrice.add(item.product().price().multiply(BigDecimal.valueOf(item.quantity())));
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "ID: " + ID() + " " + "Title order: " + title()
                + " " + " Total order price: " + getTotalPrice()
                + " " + "date: " + date();
    }
}
