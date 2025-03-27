package tekprominggu7;// tekprominggu7.Order.java menangani pemesanan makanan oleh pelanggan ke restoran tertentu.
//Menyimpan informasi pelanggan, restoran, dan total harga pesanan.

public class Order {
    private Customer customer;
    private Restaurant restaurant;
    private double totalAmount;

    public Order(Customer customer, Restaurant restaurant, double totalAmount) {
        this.customer = customer;
        this.restaurant = restaurant;
        this.totalAmount = totalAmount;
    }

    public void placeOrder() {
        System.out.println("====================================");
        System.out.println("      PESANAN TELAH DIBUAT ");
        System.out.println("====================================");
        System.out.println("Pelanggan: " + customer.getName());
        System.out.println("Restoran : " + restaurant.getName());
        System.out.println("Total Harga: Rp " + totalAmount);
        System.out.println("====================================");
    }
    public double getTotalAmount() {
        return totalAmount;
    }
}