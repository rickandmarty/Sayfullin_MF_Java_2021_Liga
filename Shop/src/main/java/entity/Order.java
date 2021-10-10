package entity;

import service.OrderService;

public class Order {
    private int id;
    public Cart cart;
    private int totalPrice;
    private int totalCount;

    public Order(int id, Cart cart) {
        this.id = id;
        this.cart = cart;
        this.totalPrice = OrderService.getTotalPrice(this.cart);
        this.totalCount = OrderService.getTotalCount(this.cart);
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", cart=" + cart +
                ", totalPrice=" + totalPrice +
                ", totalCount=" + totalCount +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}
