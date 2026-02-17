package dogmanagement;

import data.Dog;
// Đi mượn cái Khuôn Dog ở ngăn data về đúc.
// ~ #include<stdio.h> bên C.

public class DogManagement {

    public static void main(String[] args) {
        int             yob         =       2003;
    // data type    tên gọi/biến        value, single, đơn, primitive
        
        Dog             chiHu       =       new Dog("CHI HU HU", 2026, 0.5);        
    // data type   tên biến object              phức tạp, object
        
        chiHu.bark();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2020, 50.0);
        ngaoDa.bark();
        
        // Kiểm tra xem khi đổ vào Khuôn, đứa sau có đè đứa trước hay không?
        System.out.println("chiHu barks again.");
        chiHu.bark();
    }
    
}
