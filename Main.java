// Main.java
package tekprominggu7;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Budi");
        Restaurant restaurant = new Restaurant("Warung Sederhana");
        Order order = new Order(customer, restaurant, 50000);
        Payment payment = new Payment(order);

        order.placeOrder();
        payment.processPayment();
    }
}