import entity.Product;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.HashMap;

public class TestOrderService {

    @Test
    public void getTotalPrice() {
        HashMap<Product, Integer> hm = new HashMap<>();
        hm.put(new Product(1,"milk",10),1);
        hm.put(new Product(1,"bread",20),2);
        int total = 0;
        for (HashMap.Entry<Product, Integer> entry : hm.entrySet()) {
            int value = entry.getKey().getPrice();
            total += entry.getValue() * value;
        }
        Assertions.assertEquals(total,50);
    }

    @Test
    public void getTotalCount() {
        HashMap<Product, Integer> hm = new HashMap<>();
        hm.put(new Product(1,"milk",10),1);
        hm.put(new Product(1,"bread",20),2);
        int total = 0;
        for (HashMap.Entry<Product, Integer> entry : hm.entrySet()) {
            total += entry.getValue();
        }
        Assertions.assertEquals(total,3);
    }
}
