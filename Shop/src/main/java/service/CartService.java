package service;

import entity.Product;
import entity.Cart;

public class CartService {

    public static void addProductToCart(Cart cart, Product product) {
        if (!cart.getHashmap().containsKey(product)) {
            cart.getHashmap().put(product, 1);
        } else {
            int number = cart.getHashmap().get(product);
            cart.getHashmap().put(product, number + 1);
        }
    }

    public static void deleteProductFromCart(Cart cart, Product product) {
        cart.getHashmap().remove(product);
    }

    public static void clearCart(Cart cart) {
        cart.getHashmap().clear();
    }
}
