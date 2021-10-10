package entity;

import java.util.ArrayList;

public class Client {
    private int id;
    private String name;
    private ArrayList<Order> orders;
    private Cart cart;

    public Client(int id, String name) {
        this.id = id;
        this.name = name;
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public Cart getCart() {
        return this.cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public ArrayList<Order> getOrders() {
        return this.orders;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
