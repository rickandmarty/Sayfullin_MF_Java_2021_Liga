import entity.Cart;
import entity.Client;
import entity.Order;
import entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.ClientService;

import java.util.HashMap;

public class TestClientService {

    @Test
    public void createOrder(){
        HashMap<Product, Integer> hm = new HashMap<>();
        hm.put(new Product(1,"milk",10),1);
        hm.put(new Product(1,"bread",20),2);
        Client client = new Client(1, "Vasya");
        Cart cart = new Cart();
        cart.setHashmap(hm);
        client.setCart(cart);

        if (!hm.isEmpty()) {
            Order order = new Order(1, client.getCart());
            client.getOrders().add(order);
            Assertions.assertEquals(client.getOrders().size(),1);
        }
    }

    @Test
    public void getLastOrder(){
        Client client = new Client(1, "Vasya");
        ClientService.createOrder(client,1);
        ClientService.addProductToCart(client.getCart(), new Product(1,"bread",10));
        ClientService.createOrder(client,2);
        ClientService.addProductToCart(client.getCart(), new Product(1,"bread",10));
        ClientService.addProductToCart(client.getCart(), new Product(2,"milk",20));

        Order lastOrder = client.getOrders().get(client.getOrders().size() - 1);
        Assertions.assertEquals(lastOrder.getId(),2);
    }

}
