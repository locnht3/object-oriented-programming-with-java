package data;

import java.util.Scanner;

public class Shelf {

    // Đặc điểm của 1 cái tủ bất kì là gì: màu sơn:___; giá tiền:___; nsx:___;
    // số ngăn/không gian chứa đồ:___các món đồ nhét vào, món đồ là object
    // chứa nhiều đồ, nhiều object, rõ ràng đến thời điểm này là ta cần mảng object,
    // tủ sẽ chứa 1 list/mảng/danh sách các đối tượng,
    // ứng dụng của mảng, góp phần tạo dựng nên object khác
    // OOP: tìm các object, chúng phối hợp, trộn nhau
    private String color;
    private String label; // tủ chén, tủ hồ sơ SE, IA, GD
    
    // biến được đưa value lúc nào? 
    //                              qua phễu (default trong suy nghĩ)
    //                              gán trực tiếp lúc khai báo

    // chứa cái gì, chừa không gian để chứa đồ, thực ra đồ chưa có
    //              chưa có hồ sơ sinh viên
    private Student[] ds = new Student[300];
    //      ds là biến má mì - cần value
    //                     new sẵn 300 tương đương mua tủ 300 lít
    //                     đặt hàng kích thước, dung tích size 500, 1000, 2000
    
    private Scanner sc = new Scanner(System.in);
    private int count = 0;  // mới mua tủ về, số hồ sơ = 0
                            // nhét thêm 1 hồ sơ thì count++
                            // chơi mảng chỉ for đến count
    
    // Tôi có không gian chứa info, tôi sẽ giải quyết chuyện nhập xuất
    public Shelf(String color, String label) { // int size - kích thước tủ
        this.color = color;
        this.label = label;
        //ds = new Student[size]; // linh hoạt trong kích thước tủ
    }
    
    // DATA + HÀM XỬ LÍ CỦA TỦ NHÂN CÁCH HÓA, TOÀN BỘ LÀ NON-STATIC
    // NẾU KHÔNG THÌ CÁC TRƯỜNG ĐẠI HỌC, BỘ MÔN XÀI CHUNG DSSV THÌ TOANG
    // ĐẶC ĐIỂM, HÀNH XỬ PHẢI THUỘC VỀ OBJECT
    public void inputAStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Input student #" + (count + 1) + "/" + ds.length);
        System.out.print("Input id: ");
        id = sc.nextLine();

        System.out.print("Input name: ");
        name = sc.nextLine();

        System.out.print("Input yob: ");
        yob = Integer.parseInt(sc.nextLine());

        System.out.print("Input gpa: ");
        gpa = Double.parseDouble(sc.nextLine());

        ds[count] = new Student(id, name, yob, gpa);
        count++;
        System.out.println("Add student successfully");
    }
    
    public void printStudentList() {
        System.out.println("The student list");
        for (int i = 0; i < count; i++) {
            ds[i].showProfile();    // FOR HẾT LÀ TOANG!!!
        }                           // VÌ MẸ KIẾP, MẢNG OBJECT DEFAULT CÁC PHẦN TỬ LÀ NULL
    }                               // HẠ CÁNH NƠI ANH, TRỎ ĐÁY RAM.
    
    public void searchAStudent() {
        // search là quét/duyệt/đi từ trái sang phải lôi cổ từng sv[i] ra
        // hỏi hắn mã số là mấy?
        // so sánh với mã số muốn tìm? == mã số of sv[i] sv[i].getMS() -> báo tìm thấy
        // tìm hết không thấy thì báo rằng not found
        // THUẬT TOÁN TRÂU BÒ/VÉT CẠN/TÁT CẠN
        System.out.print("Input the id that you want to search: ");
        String id = sc.nextLine(); // hoa thường à nhen
        for (int i = 0; i < count; i++) {
            if (ds[i].getId().equalsIgnoreCase(id)) {
                // tìm thấy tại vị trí [i]
                System.out.println("Student found!!! Here she/he is");
                ds[i].showProfile(); // in kết quả liền
                return;
            }   // tìm thấy thì dừng hàm luôn, không for gì nữa
        }
        
        // Sống sót tới đây, sure, không có thấy id cần tìm, nếu thấy đã dừng sớm ở trên,
        // đi hết for mà không thoát được, báo không thấy
        System.out.println("Student not found!!!");
        // dùng biến flag phất cờ nếu thấy và không thấy, if () in ra câu thông báo
    }
    
}
