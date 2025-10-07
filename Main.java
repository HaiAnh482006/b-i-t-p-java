import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        ArrayList<Product> kho = new ArrayList<>();
        kho.add(new ElectronicProduct("SP01", "Laptop", 15000000, "IMEI123", 12));
        kho.add(new FoodProduct("SP02", "Bánh quy", 50000, "31/12/2025"));
        kho.add(new ElectronicProduct("SP03", "Điện thoại", 7000000, "IMEI999", 6));
        kho.add(new FoodProduct("SP04", "Sữa tươi", 30000, "15/11/2025"));


     
        System.out.print("Nhập tên khách hàng: ");
        String tenKH = sc.nextLine();

      
        System.out.println("Chọn phương thức thanh toán: ");
        System.out.println("1. Tiền mặt");
        System.out.println("2. Thẻ tín dụng");
        System.out.println("3. Momo");
        int chon = sc.nextInt();

        PaymentMethod pm;
        if (chon == 1) {
            pm = new CashPayment();
        } else if (chon == 2) {
            pm = new CreditCardPayment();
        } else {
            pm = new MomoPayment();
        }

        Order order = new Order(tenKH, pm);

        
        System.out.println("Danh sách sản phẩm trong kho:");
        for (int i = 0; i < kho.size(); i++) {
            System.out.print((i + 1) + ". ");
            kho.get(i).hienThiTT();
        }

        System.out.println("Chọn sản phẩm muốn mua (nhập số 0 để kết thúc): ");
        while (true) {
            int spChon = sc.nextInt();
            if (spChon == 0) break;
            if (spChon >= 1 && spChon <= kho.size()) {
                order.themSP(kho.get(spChon - 1));
                System.out.println("Đã thêm " + kho.get(spChon - 1).getTenSP() + " vào giỏ hàng.");
            } else {
                System.out.println("Không hợp lệ!");
            }
        }

        
        order.hienThiDS();
        order.checkout();
    }
}
