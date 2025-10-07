
import java.util.ArrayList;

public class Order {
    private String tenKH;
    private ArrayList<Product> danhSachSP = new ArrayList<>();
    private PaymentMethod phuongThucTT;

    public Order(String tenKH, PaymentMethod phuongThucTT) {
        this.tenKH = tenKH;
        this.phuongThucTT = phuongThucTT;
    }

    public void themSP(Product p) {
        danhSachSP.add(p);
    }

    public void xoaSP(Product p) {
        danhSachSP.remove(p);
    }

    public double tinhTongTien() {
        double tong = 0;
        for (Product p : danhSachSP) {
            tong += p.getGia();
        }
        return tong;
    }

    public void checkout() {
        double tong = tinhTongTien();
        phuongThucTT.pay(tong, tenKH);
    }

    public void hienThiDS() {
        System.out.println("Danh sách sản phẩm trong đơn hàng:");
        for (Product p : danhSachSP) {
            p.hienThiTT();
        }
    }
}
