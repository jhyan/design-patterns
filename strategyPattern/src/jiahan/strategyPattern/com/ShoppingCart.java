package jiahan.strategyPattern.com;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> productList;

    public ShoppingCart(){
        // 多态， 因为assign ArrayList 给 list了
        this.productList = new ArrayList<>();
    }

    public void addProduct(Product product){
        productList.add(product);
    }

    public void removeProduct(Product product){
        productList.remove(product);
    }

    public int calculateTotal() {
        int sum = 0;
        for (Product product:productList) {
            sum += product.getPrice();
        }
        return sum;
    }

    public void pay(Payment payment) {
        int amount = calculateTotal();
        payment.pay(amount);

    }

}
