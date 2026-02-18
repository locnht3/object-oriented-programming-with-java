package dogmanagement;

import data.Dog;

public class DogManagement {

    public static void main(String[] args) {
        Dog chiHu = new Dog("CHI HU HU", 2026, 0.5);
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGAO DA", 2020, 50.0);
        ngaoDa.bark();
        
        System.out.println("Show all of info by using toString() method");
        String chDetails = chiHu.toString();
        System.out.println("CH details: " + chDetails);
        System.out.println("ND details: " + ngaoDa.toString());
        
        System.out.println("GỌI THẦM TÊN EM");
        System.out.println("ND details: " + ngaoDa);
        // Điều gì diễn ra khi ta in ra?
        // Khi in biến con trỏ/biến object/biến tham chiếu reference
        // thì thay vì in ra địa chỉ như bên C, Java ngầm đi tìm hàm toString() mà gọi
        // hàm ý rằng đi đến tọa độ đang trỏ in hết thông tin.
        
        // NẾU KHÔNG CÓ TOSTRING() mà ngoan cố gọi nó để in ra thì
        // Java sẽ in ra con số HEXA, mã băm vùng ram, hash number, gom data thành 1 con số đại diện vùng ram.
        // HASH NUMBER, THUẬT TOÁN MD5, SHA-1, SHA-256.
           
        System.out.println("ND age: " + ngaoDa.getAge());
    }
    
}
