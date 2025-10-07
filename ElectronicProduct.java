

public class ElectronicProduct extends Product {
    private String imei;
    private int baoHanhThang;

    public ElectronicProduct(String maSP, String tenSP, double gia, String imei, int baoHanhThang) {
        super(maSP, tenSP, gia);
        this.imei = imei;
        this.baoHanhThang = baoHanhThang;
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT();
        System.out.println("IMEI: " + imei + " | Bảo hành: " + baoHanhThang + " tháng");
    }
}
