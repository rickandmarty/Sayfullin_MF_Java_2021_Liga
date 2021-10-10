package service;

import entity.Cart;
import entity.Product;

import java.util.HashMap;

public class OrderService {
    public static int getTotalPrice(Cart cart) {
        int total = 0;
        for (HashMap.Entry<Product, Integer> entry : cart.getHashmap().entrySet()) {
            int value = entry.getKey().getPrice();
            total += entry.getValue() * value;
        }
        return total;
    }

    public static int getTotalCount(Cart cart) {
        int total = 0;
        for (HashMap.Entry<Product, Integer> entry : cart.getHashmap().entrySet()) {
            total += entry.getValue();
        }
        return total;
    }
}
