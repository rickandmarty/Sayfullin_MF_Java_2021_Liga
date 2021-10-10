import entity.Client;
import entity.Product;
import service.ClientService;

public class Main {
    public static void main(String[] args) {
        Client client = new Client(1,"Vasya");
        ClientService.createOrder(client,1);
        ClientService.addProductToCart(client.getCart(), new Product(1,"bread",10));
        ClientService.addProductToCart(client.getCart(), new Product(2,"milk",20));
        ClientService.createOrder(client,2);
        System.out.println(ClientService.getLastOrder(client));
        ClientService.addProductToCart(client.getCart(), new Product(1,"bread",10));
        ClientService.addProductToCart(client.getCart(), new Product(2,"milk",20));
        ClientService.addProductToCart(client.getCart(), new Product(3,"egg",5));
        ClientService.addProductToCart(client.getCart(), new Product(4,"water",15));
        ClientService.createOrder(client,3);
        System.out.println("------------------------------------------------------");
        ClientService.printAllOrders(client);
    }
}