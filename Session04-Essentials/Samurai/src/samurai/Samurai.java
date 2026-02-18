package samurai;

import java.util.Scanner;

public class Samurai {

    public static void main(String[] args) {
//        inputProfile();
        inputProfileV2();
    }

    public static void inputProfile() {
        // Nhập vào thông tin SV gồm tên, yob, địa chỉ, và in ra.
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        try {
            // Lệnh văng miểng nằm ở đây
            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

        } catch (Exception e) {
            // e chính là tin nhắn màu đỏ JVM gửi mình để lưu ý rằng có cà chớn, ngoại lệ,
            // xử lí đi, tao không giết app đâu.
            // Ngầm phía sau: JVM Exception e = new Exception("câu chửi bới, lưu ý gì đó!");
            // thường ta quan tâm có cà chớn, lúc này ta tự xử lí, JVM không giết, không can thiệp.

            // 2 cách: Default, bắt vòng lên nhập lại.
            yob = 69;
        }

        System.out.print("Input address: ");
        address = sc.nextLine();

        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println("---End of profile---");
    }

    public static void inputProfileV2() {
        // Nhập vào thông tin SV gồm tên, yob, địa chỉ, và in ra.
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();

        while (true) {    // lặp vô tận
            try {
                System.out.print("Input yob: ");
                yob = Integer.parseInt(sc.nextLine());
                break;  // đúng thì thoát vòng lặp.
            } catch (Exception e) { // sai thì văng miểng ăn chửi, chửi xong, nhập lại.
                //yob = 69;
                System.out.println("Do you know how to input a positive integer?");
            }
        }

        System.out.print("Input address: ");
        address = sc.nextLine();

        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println("---End of profile---");
    }

}

// MẶC ĐỊNH DATA ĐƯA VÀO CÀ CHỚN, JAVA (JVM - MÁY ẢO JAVA) SẼ GIẾT APP NGAY TẠI CHỖ CÀ CHỚN,
// KHI JAVA PHÁT HIỆN CÀ CHỚN, NÓ SẼ GỬI CHO APP 1 TIN NHẮN THÔNG BÁO RẰNG DATA VỚ VẨN,
// DATA BỊ EXCEPTION, DATA DỊ QUÁ, BẤT THƯỜNG QUÁ, NGOẠI LỆ, SỐ LÀ AHIHI KÌ QUÁ,
// GỬI TIN NHẮN CHO APP XONG (MÀU ĐỎ EXCEPTION), GIẾT APP LUÔN.
// NÓI LẠI: NẾU NGƯỜI DÙNG LỠ TAY, KHÔNG LỠ TAY, CŨNG NÊN CHO CƠ HỘI SỬA SAI.
// SỬA SAI THÌ TỨC LÀ ĐỪNG GIẾT APP KHI CÓ CÀ CHỚN EXCEPTION.
// CHỖ NÀO CÓ THỂ CÓ CÀ CHỚN THÌ CHỖ ĐÓ CÓ NGUY CƠ APP BỊ GIẾT,
// JAVA ĐỪNG GIẾT APP, ĐỂ EM TỰ LO, DEV TỰ LO, CODE CẦN ĐIỀU CHỈNH NẾU CÓ CÀ CHỚN,
// THÌ BẮT USER LÀM LẠI CÁI SAI THÀNH ĐÚNG, XIN APP ĐỪNG BỊ GIẾT ĐỂ EM TỰ LO - SAMURAI.
// KHÔNG VIẾT TỰ DO NẾU KHÔNG BỊ GIẾT, BÁO VỚI JVM ĐOẠN CODE NÀY CÓ NGUY CƠ CÀ CHỚN,
// NẾU CÓ CÀ CHỚN, BÁO APP BIẾT ĐỂ APP XỬ LÍ NỐT.
// NHỐT CÂU LỆNH CÀ CHỚN VÀO TRONG 1 HỘP CÁT/SANDOX ĐỂ XỬ LÍ BOM MÌN NỔ TRONG ĐÂY CHO AN TOÀN.
// NHỐT TRONG CỤM TRY - CATCH
// try {lệnh văn miểng nằm here}
// catch (JVM báo hiệu cho biết có cà chớn này, sửa sai đi)
