

public class CreditCardPayment implements PaymentMethod {
    @Override
    public void pay(double tongTien, String tenKH) {
        System.out.println("Khách hàng " + tenKH + " thanh toán bằng THẺ TÍN DỤNG: " + tongTien + " VND");
    }
}
