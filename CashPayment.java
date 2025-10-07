

public class CashPayment implements PaymentMethod {
    @Override
    public void pay(double tongTien, String tenKH) {
        System.out.println("Khách hàng " + tenKH + " thanh toán TIỀN MẶT: " + tongTien + " VND");
    }
}
