package jiahan.strategyPattern.com;

public class PaypalPayment implements Payment{
    private String email;
    private String password;

    public PaypalPayment(String email, String password) {
        this.email = email;
        this.password = password;

}
    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid with paypal");
    }
}
