package model;

public class Main {
    public static void main(String[] args) {
        ClothStore clothStore = new ClothStore();
        ClothStoreIterator clothStoreIterator = clothStore.createClothStoreIterator();
        while (clothStoreIterator.hasNext()) {
            System.out.println("products: " + ((Product)clothStoreIterator.getNext()).getName());
        }
    }
}
