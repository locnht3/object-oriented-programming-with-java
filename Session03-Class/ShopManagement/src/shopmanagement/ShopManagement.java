package shopmanagement;

import data.Account;
import data.Book;
import data.Shoe;
import data.Watch;
import java.util.Scanner;

public class ShopManagement {

    public static void main(String[] args) {
        System.out.println("Danh sách các cuốn sách tiêu biểu:");
        System.out.println("|Tên sách                                |Tác giả             |Thể loại            |Giá tiền|Số lượng|");
        Book book1 = new Book("Hồi ức, giấc mơ, suy ngẫm", "Carl Jung", "Tự truyện", 217000, 10);
        book1.show();
        
        Book book2 = new Book("Học tĩnh trong một thế giới ồn ào", "Lê Nhật Nam", "Tiểu thuyết", 69120, 21);
        book2.show();
        
        Book book3 = new Book("Tần số năng lượng", "David R. Hawkins", "Huyễn học", 84900, 128);
        book3.show();
        
        System.out.println("------------------------------------------");
        
        System.out.println("Danh sách các tài khoản:");
        System.out.println("|ID  |Tác giả             |CCCD        |SĐT        |Số dư    |");
        Account acc1 = new Account("0001", "Ngô Huỳnh Tấn Lộc", "054209001222", "09141009999", 3000000.5);
        acc1.showProfile();
        
        Account acc2 = new Account("0002", "Bùi Thiện Trung", "054209003333", "09141008888", 4500000.9);
        acc2.showProfile();
        
        Account acc3 = new Account("0003", "Bùi Thiên Trang", "054209006789", "09141006666", 9000000.5);
        acc3.showProfile();
        
        System.out.println("------------------------------------------");
        System.out.println("Thông tin giao dịch");
        Scanner atm = new Scanner(System.in);
        double money;
        System.out.print("Vui lòng nhập số tiền cần rút: ");
        money = atm.nextDouble();
        System.out.println("Số tiền cần rút: " + money);
        acc1.withdrawMoney(money);
        acc1.showProfile();
        
        System.out.println("------------------------------------------");
        System.out.println("Các mẫu đồng hồ tiêu biểu: ");
        System.out.println("|Mã sản phẩm         |Hãng sản xuất  |Giới tính |Độ chịu nước |Giá tiền  |");
        Watch w1 = new Watch("AT-68750.41", "Atlantic", "Male", "5ATM", 20862000);
        w1.showWatch();
        
        Watch w2 = new Watch("AT-68750.44", "Atlantic", "Male", "5ATM", 12587500);
        w2.showWatch();
        
        Watch w3 = new Watch("SHE-3808SPG", "Casio", "Female", "5ATM", 4646000);
        w3.showWatch();
        
        System.out.println("------------------------------------------");
        System.out.println("Các mẫu đồng hồ tiêu biểu: ");
        System.out.println("|Mã sản phẩm         |Kiểu dáng           |Chất liệu           |Màu sắc             |Giá tiền  |");
        Shoe s1 = new Shoe("SD01056", "Giày xăng đan", "Da tổng hợp", "Xanh lá-Đen-Nâu", 200000);
        s1.showShoe();
        
        Shoe s2 = new Shoe("BB03007", "Giày búp bê", "Da tổng hợp", "Đỏ-Đen-Hồng", 200000);
        s2.showShoe();
        
        Shoe s3 = new Shoe("RM52886", "Giày tây nam", "Da PU", "Nâu-Đen", 199000);
        s3.showShoe();
    }
    
}
