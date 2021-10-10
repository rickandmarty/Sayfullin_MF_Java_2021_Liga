package entity;

import java.util.HashMap;

public class Cart {
    private HashMap<Product, Integer> hashmap;

    public Cart(){
        this.hashmap = new HashMap<>();
    }

    public HashMap<Product, Integer>  getHashmap() {
        return this.hashmap;
    }

    public void setHashmap(HashMap<Product, Integer> hm){
        this.hashmap = hm;
    }
    @Override
    public String toString() {
        return "Cart{" +
                "hashmap=" + this.hashmap +
                '}';
    }
}

