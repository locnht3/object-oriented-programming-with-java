package main;

import data.Student;

public class Stage {
    
    public static void main(String[] args) {       
        Student s1 = new Student("SE686868", "LỘC PHÁT", 1998, 6.8);
        // biến object
        // biến đối tượng           OBJECT, INSTANCE, HIỆN THÂN, THỂ HIỆN... CỤ THỂ
        // obj variable
        // reference variable
        // "con trỏ"
        
        // 1. new là clone vùng ram từ Khuôn (static nếu có thể).
        // 2. Gọi phễu đổ data vào vùng clone.
        // 3. Chốt lại tọa độ vùng new thảy cho ai đó giữ, thảy cho biến object giữ.
        
        s1.showProfile();
        
        s1 = new Student("SE666789", "ĐẠI GIA", 2001, 9.9);
        s1.showProfile();
        // sếp -> ca sĩ ST MTP
        // sếp -> người quyết định mức lương cho người đi làm thuê
        // tí -> mày ở nhà, tao ở nhà
        // tí -> Trạng Tí
        
        // Mất tọa độ bạn Lộc Phát rồi.
        // Mất tọa độ vùng ram/object thì điều gì xảy ra?
        // Công ti Môi trường đô thị/GARBAGE COLLECTOR, vùng ram object không ai trỏ
        // sẽ bị thu hồi, object sẽ bị giết.
        // HEAP clear ~ free(con trỏ bên C, vùng HEAP trả lại cho new object mới.
        
        System.gc();
        
        // HAI CHÀNG TRỎ/NHÌN 1 NÀNG.
        // VỪA SINH RA KHÓC 1 TIẾNG RỒI CHẾT.
    }
}
