package service;

import entity.Cart;
import entity.Client;
import entity.Order;
import entity.Product;

public class ClientService {

    public static void createOrder(Client client, int id){
        if (!client.getCart().getHashmap().isEmpty()) {
            Order order = new Order(id, client.getCart());
            client.getOrders().add(order);
            Cart newCart = new Cart();
            client.setCart(newCart);
        }
    }

    public static void addProductToCart(Cart cart, Product product){
        CartService.addProductToCart(cart,product);
    }

    public static void printAllOrders(Client client){
        for (Order currentOrder : client.getOrders()){
            System.out.println(currentOrder);
        }
    }

    public static Order getLastOrder(Client client){
        Order lastOrder = client.getOrders().get(client.getOrders().size() - 1);
        return lastOrder;
    }
}
