package tekprominggu7;// tekprominggu7.Payment.java menangani proses pembayaran berdasarkan pesanan yang telah dibuat.

public class Payment {
    private Order order;

    public Payment(Order order) {
        this.order = order;
    }

    public void processPayment() {
        System.out.println("\n====================================");
        System.out.println("      PEMBAYARAN BERHASIL ");
        System.out.println("====================================");
        System.out.println("Total yang dibayarkan: Rp " + order.getTotalAmount());
        System.out.println("Terima kasih telah memesan!\n");
    }
}

