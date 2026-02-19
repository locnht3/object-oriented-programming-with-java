package main;

import data.Student;

public class Stage {

    public static void main(String[] args) {
        //checkObjectV6();
        
        Student x = checkObjectV7();    // x = tọa độ của ai đó new, mà ai đó new đã được return qua tên hàm
        x.showProfile();    // AHIHI
        x.setName("KHÔNG ĐỔI NGÀNH");
        x.showProfile();    // KHÔNG ĐỔI NGÀNH
        checkObjectV7().showProfile();  // AHIHI
    }

    public static void checkObject() {
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

    // Kiểm tra việc new trùng thông tin xem sao?
    public static void checkObjectV1() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        Student s2 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);

        s1.showProfile();
        s2.showProfile();

        // Chứng minh 2 new là 2 object khác nhau, 2 vùng clone khác nhau, dù đổ info giống nhau.
        // Vd: ở ngoài đời, vào tiệm sách đi tô tượng, chọn 2 tượng "giống nhau", vẫn là 2.
        s1.setName("DỖI RỒI, KHÔNG HỌC BÀI!!!");
        s1.showProfile();   // DỖI...
        s2.showProfile();   // AN

        System.out.println("Check duplication if any?");
        System.out.println(s1); // DỖI...
        System.out.println(s2); // AN
    }

    // MẤT TỌA ĐỘ, MẤT DẤU VÙNG NEW, CÓ THỂ CÓ ĐIỀU NÀY HAY KHÔNG, NẾU CÓ THÌ HẬU TRƯỜNG DIỄN RA GÌ?
    // BIẾN CÓ QUYỀN THAY ĐỔI CHỖ TRỎ!!!
    public static void checkObjectV2() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        // object/instance/đủ info được đổ, nằm vùng nào đó trong HEAP
        // new trả về tọa độ vùng clone
        // cả nguyên dòng từ new ...; được xem là tọa độ/giá trị phức tạp.
        // s1 là con trỏ, lưu tọa độ vùng new
        // biến object, lưu tọa độ vùng new,
        // reference variable, chiếu tới tọa độ chỗ khác.
        // BIẾN CON TRỎ/OBJECT/THAM CHIẾU BẢN CHẤT LÀ CẦN TRỎ, CẦN LƯU 1 TỌA ĐỘ VÙNG NEW CLONE.
        // vậy nên không ai cấm mình trỏ vùng new mới.

        s1 = new Student("SE666788", "BÌNH LÊ", 1998, 8.8);
        s1.showProfile();   // in ra cái gì? BÌNH LÊ
        // Biến có quyền thay đổi value nó lưu trữ, vì thay đổi value nó mới là biến.
        // variable - sự biến đổi.
        // sếp = CaSi MTP;
        // sếp = "gã" trả lương, đánh giá KPI làm việc của mình;
        // s1 li dị AN chơi với BÌNH
        // biến object thay chỗ trỏ, chiếu, tọa độ,

        // Tôi muốn lấy lại vùng clone AN thì sao, mất dấu rồi?
        // s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9); // AN này khác AN ban đầu.
        // LƯU Ý: khi 1 object/vùng new clone không có ai trỏ tới, mất con trỏ,
        // do con trỏ gán qua vùng new khác, thì ta mất dấu tọa độ vùng new cũ.
        // Java: JVM máy ảo Java chạy bên Windows giám sát vùng ram app viết bằng Java:
        //       -> có cà chớn không? giếp app, cảnh báo gửi báo tử nếu xài try-catch
        //       -> có vùng new mồ côi nào không, vùng không con trỏ
        //          HEAP có object nào không có con trỏ hay không?
        // Bộ phận giám sát này của máy ảo Java gọi là Công ti MTĐT GARBAGE COLLECTOR, clear
        // available cho new clone khác
        // free(con trỏ bên C - free vùng malloc() calloc()) HEAP
        // việc clear ram HEAP của Java diễn ra định kì, bao nhiêu giât, phút...
        // tuy nhiên mình có thể gọi ngay luôn
        System.gc();
    }

    // BACKUP OBJECT, TỨC LÀ GIỮ LẠI TỌA ĐỘ
    public static void checkObjectV3() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);

        // trước khi s1 chơi với Bình, không muốn mất An thì cần ghi ra đâu đó cái tọa độ vùng ne của An,
        // trước khi đãng trí quên tên thì ghi ra giấy, danh bạ.
        Student x = s1;

        s1.setName("KHÔNG TIN THẦY");

        // x là biến object, rất cần tọa độ 1 vùng new.
        // tự new cũng được, nhưng có ai đã new trước rồi chưa, cho x cùng chơi với,
        // cho tọa độ đi, x không cần new nữa.
        // x trỏ đến AN ở trên
        s1 = new Student("SE666788", "BÌNH LÊ", 1998, 8.8);
        // s1 đã bỏ AN để đi với BÌNH
        // x đang là AN của ngày hôm qua, xưa cũ bị s1 ruồng bỏ.
        s1.showProfile();   // BÌNH LÊ
        x.showProfile();    // AN NGUYỄN NHƯNG BỊ THAY THÀNH KHÔNG TIN THẦY

        System.out.println("Check thầy luôn đúng");
        s1.setName("THẦY LUÔN ĐÚNG");
        x.showProfile();    // KHÔNG TIN THẦY
        s1.showProfile();   // THẦY LUÔN ĐÚNG
    }

    // 2 CHÀNG TRỎ 1 NÀNG
    public static void checkObjectV4() {
        Student s1 = new Student("SE666789", "AN NGUYỄN", 1999, 8.9);
        Student s2 = s1; // 2 thằng cùng nhòm 1 hướng tọa độ, 2 chàng trỏ 1 nàng
        // s1, s2 cùng lưu 1 tọa độ, cùng trỏ vùng new clone AN
        s1.setName("ANH CỤC SÚC");

        s2.showProfile();  // CỤC SÚC
        s1.showProfile();  // CỤC SÚC

        // sếp
        // sky                  ---> (CaSi MTP)
        // anh lạc trôi
        // an
        // tèo      --> BẠN NÀO ĐÓ
    }

    public static void checkObjectV5() {
        Student s1 = new Student("SE666789", "AHIHI", 1999, 8.9);

        // object vô danh, sinh ra mà không thèm đặt tên, chỉ khóc 1 tiếng rồi pass away
        s1.showProfile();
        // s1 chấm - tức là vào vùng tọa độ chấm để làm gì đó
        // new... cũng chính là tọa độ, đẩy cho s1, s1 và new ... là như nhau
        // s1 chấm cũng như new chấm

        new Student("SE666789", "AHIHI", 1999, 8.9).showProfile();
        // cờ hó chạy ra đường không có ông chủ cầm xích, Exciter hốt luôn
        // không con trỏ, xuất hiện 1 lần rồi chết bởi công ti MTĐT
        // object vô danh, anonymous object
        // MUỐN RE-USE OBJECT, CHẤM NHIỀU LẦN THÌ PHẢI CÓ TÊN GỌI
    }

    // KHAI BÁO BIẾN RỒI GÁN SAU
    public static void checkObjectV6() {
        int a;
        a = 10; // ~~~ int a = 10

        Student s1; // tớ với cậu sẽ nói xấu dìm hàng 1 thằng bạn heng
        // s1 là đứa tao với mày sẽ chơi nó, troll, lên confession
        // s1 cần lắm luôn trỏ vùng new, sẵn sàng để trỏ
        // thằng đó đây, giờ trỏ nè            
        s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        s1.showProfile();
    }

    // HÀM TRẢ VỀ OBJECT, KHÔNG TRẢ VỀ PRIMITIVE
    // Hàm này trả về tọa độ của 1 object đã new đâu đó
    //            Student x = ...
    //            Student s1 = ...
    //              int a;
    //              int f();    // tên hàm là 1 biến vì nó tương đương 1 giá trị
    public static Student checkObjectV7() { // tên hàm này cũng là 1 biến/biến object
                                            // giá trị của hàm này, biến này là tọa độ new nào đó
           
        Student s1 = new Student("SE666789", "AHIHI", 1999, 8.9);
        //      s1 đang nắm tọa độ vùng new clone trong HEAP,
    
        return s1;  // ném cái tọa độ đó vào tên hàm
                    // tên hàm là tọa độ, Student f()
                    // 2 chàng trỏ 1 nàng new f() và s1 cùng trỏ new
        // từ trong hàm đã ném được tọa độ vùng new clone HEAP ra ngoài,
        // lát hồi hàm chạy xong, mất biến s1 vì s1 nằm trong STACK.
    }

}
