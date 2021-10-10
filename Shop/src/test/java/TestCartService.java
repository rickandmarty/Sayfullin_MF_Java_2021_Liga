import entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class TestCartService {

    @Test
    public void addProductToCart() {
        HashMap<Product, Integer> hm = new HashMap<>();
        Product product = new Product(1,"milk",10);
        if (!hm.containsKey(product)) {
            hm.put(product, 8);
            Assertions.assertEquals(hm.get(product),8);
        } else {
            int number = hm.get(product);
            hm.put(product, number + 1);
            Assertions.assertEquals(hm.get(product),9);
        }
    }

    @Test
    public void deleteProductFromCart() {
        HashMap<Product, Integer> hm = new HashMap<>();
        Product product = new Product(1,"milk",10);
        Product product2 = new Product(2,"bread",20);
        hm.put(product, 8);
        hm.put(product2, 4);
        hm.remove(product);
        Assertions.assertFalse(hm.containsKey(product));
    }

    @Test
    public void clearCart() {
        HashMap<Product, Integer> hm = new HashMap<>();
        Product product = new Product(1,"milk",10);
        Product product2 = new Product(2,"bread",20);
        hm.put(product, 8);
        hm.put(product2, 4);
        hm.clear();
        Assertions.assertEquals(hm.size(),0);
    }
}
