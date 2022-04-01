package jiahan.strategyPattern.com;

public class strategyPattern {
    public static void main(String[] args) {
        System.out.println("begin testing");

        // construct a shopping cart
        Product pant = new Product(1, "a");
        Product shoes = new Product(2, "b");
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(pant);
        cart.addProduct(shoes);


        // construct two payments
        CreditCardPayment creditCardPayment = new CreditCardPayment("Jiahan", "384");
        PaypalPayment paypalPayment = new PaypalPayment("@gmail.com", "asd");


        cart.pay(creditCardPayment);
        cart.pay(paypalPayment);
    }
}
