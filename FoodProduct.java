

public class FoodProduct extends Product {
    private String hanSuDung;

    public FoodProduct(String maSP, String tenSP, double gia, String hanSuDung) {
        super(maSP, tenSP, gia);
        this.hanSuDung = hanSuDung;
    }

    @Override
    public void hienThiTT() {
        super.hienThiTT();
        System.out.println("Hạn sử dụng: " + hanSuDung);
    }
}
