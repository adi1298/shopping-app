package com.zegasoftware;

public record Items(Product product, int quantity) {

    @Override
    public String toString() {
        return product().name() + " " + product().price() + " " + "nr/buc" + " " + quantity();
    }
}
