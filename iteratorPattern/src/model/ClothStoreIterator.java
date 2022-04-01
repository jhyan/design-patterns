package model;

import java.util.ArrayList;

public class ClothStoreIterator implements Iterator {

    private int position = 0;
    private ArrayList<Product> products;

    public ClothStoreIterator(ArrayList<Product> products) {
        this.products = products;
    }

    @Override
    public boolean hasNext() {
        // haven't been initialized or cross boundary
        if (position == products.size() || products.get(position) == null) {
            return false;
        } return true;
    }

    @Override
    // what if the below return type is Object/Product
    public Object getNext() {
        Product product = products.get(position);
        position += 1;
        return product;
    }
}
