package model;

import java.util.ArrayList;

public class ClothStore {
    private ArrayList<Product> products;

    public ClothStore() {
        products = new ArrayList<>();
        addProductWithName("paint");
        addProductWithName("tShirt");
    }

    public void addProductWithName(String name) {
        Product product = new Product(name);
        products.add(product);
    }

    public ClothStoreIterator createClothStoreIterator() {
        return new ClothStoreIterator(products);
    }
}
