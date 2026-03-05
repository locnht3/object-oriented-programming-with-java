package studentmanagement;

import data.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentManagement {

    public static void main(String[] args) {
        //playWithArrayList();
        //sortArrayListManually();
        //playWithSet();
        Student xxx = searchStudent("se123466");
        if (xxx != null) // null được quyền kết hợp với == != có trỏ null đáy ram hay không
            xxx.showProfile();
        else
            System.out.println("NOT FOUND!!!");
    }
    
    public static void playWithArrayList() {
//        Student[] arr = new Student[500];
        // arr là 1 cái túi chứa sẵn 500 chỗ, 500 món đồ có thể bỏ vô,
        // món đồ phải đi mua, new, thảy vào,
        // tên mảng chính là má mì, quản lí nhiều đồ, tên túi luôn.
        
        // List arr = new ArrayList(); // đựng lộn xộn đủ loại con trỏ
        // đúng nghĩa túi Doraemon, món gì cũng đựng, đựng tham chiếu,
        // nhét được NhanVien, GiangVien, Animal, Dog, ...
        
        // Túi đồng nhất chỉ lưu con trỏ Student.
        List<Student> arr = new ArrayList();
//        List<Student> arr1 = new ArrayList<>();
//        List<Student> arr2 = new ArrayList<Student>();
        // arr là cái túi chứa vô hạn chỗ, vô hạn con trỏ
        // nhét đồng nhất món đồ dễ chấm chung được, đa hình được.
        
        // MỞ NGĂN TỦ/TÚI NHÉT ĐỒ VÔ
        // arr[i] = new Student(...); // mảng
        
        // arr.add(new Student(...)); // lưu con trỏ thoi, new Student() thoải mái bên ngoài, vùng HEAP
        
        Student s1 = new Student("SE123456", "AN NGUYỄN", 2003, 9.0);
        Student s2 = new Student("SE123456", "BÌNH LÊ", 2003, 5.0);
        arr.add(s1);    // giỏ vùng new ArrayList, tủ có thêm 1 con trỏ, sinh ra 1 con trỏ
        // 2 chàng 1 nàng
        arr.add(s2);    // sinh ra thêm con trỏ nữa [1]
                        // add() vô tận, mảng [length - 1] hết mức
                        // new cứ nằm HEAP, SV cứ ở nhà, CN cứ ở xưởng, BN cứ ở phòng bệnh
        // add() mở khóa kéo, khóa dây, nhét đồ vô, nhét tham chiếu, thẻ bài, sinh ra con trỏ
        arr.add(s1);    // add trùng nè 1 tên người vào danh sách,
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.0));
        //      new cứ lên HEAP mà nằm, Bệnh Nhân cứ về phòng, tớ nắm thẻ bài
        // 1 con trỏ nữa lại được add vào
        
        // Hỏi xem túi đang có bao nhiêu đồ
        // arr.length hỏi túi mà, hỏi má mì mà, tên mảng mà
        System.out.println("The bag has: " + arr.size() + " elements");
        // 4 Sinh Viên in ra, nhưng thực ra chỉ có 3 Sinh Viên, do có người đếm trùng
        
        // In mọi người ra
        // tủ có gì, chứa bên trong 1 đống con trỏ
        // mảng: [i].showProfile()
        // Tủ ArrayList[pointer1, pointer2, pointer3, ... nếu add() thêm]
        // add() đẩy vào 1 con trỏ, tọa độ, thẻ bài
        // get(vị trí thẻ bài muốn lấy), trả về tọa độ con trỏ thứ i
        //                               trả về địa chỉ vùng new đang trỏ
        // [i] lấy được tham chiếu bạn thứ i
        // get(i) lấy được chỗ ngồi tham chiếu con trỏ thẻ bài thứ i
        
        // In bạn đầu tiên
        // arr[i].showProfile() phần tử đầu tiên của mảng
        Student xxx = arr.get(0); // trả về tọa độ con trỏ thẻ bài bạn thứ 0
        // trả về tọa độ gán vào biến Student khác nắm cùng tọa độ
        System.out.println("The student list");
        xxx.showProfile();
        
        // Bạn 1 get(1), có tọa độ chấm luôn cho rồi, thêm biến con trỏ trỏ cùng làm gì
        arr.get(1).showProfile(); // trả về con trỏ
        
        System.out.println("In xịn sò");
        for (Student x : arr) { // không sợ NULL POINTER add() đến đâu thêm con trỏ đến đó
            // x = arr.get(i) = arr[i]
            x.showProfile();
        }
        
        System.out.println("In xịn sò for truyền thống");
        for (int i = 0; i < arr.size(); i++) {
            // arr[i].showProfile();
            arr.get(i).showProfile();
        }
        
        // Có hành động xóa 1 con trỏ, loại bỏ 1 thẻ bài, món đồ, gạch tên 1 người khỏi danh sách,
        // vùng new Student() bị mất hay không tùy vào mấy con trỏ trỏ nó,
        // size() giảm liền, mảng không có, fix cứng số con trỏ
        // set() đảo con trỏ, trỏ sang vùng khác (get() hàm set() xử nay của các object)
        
    }
    
    // Một cái túi List Cha (nhiều Con ArrayList, Vector, ...) có 1 cơ chế
    // sort tự động QUA GỌI LỆNH các thẻ bài/biến tham chiếu/biến con trỏ bên trong
    // cơ chế này thì phải xài Interface (Comparable và Comparator)
    // Cuối cùng vẫn là so sánh và đảo thứ tự
    // ta dùng trước cơ chế tự viết sort, so sánh và đổi thứ tự trỏ
    public static void sortArrayListManually() {
        List<Student> arr = new ArrayList(); // new là có Túi, có hành động, có chỗ chứa đồ
        
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        // mở khóa dây của giỏ, nhét 1 thẻ bài vào, thẻ bài ghi thông tin trỏ tới Sinh Viên An 9.0
        // thẻ bài nằm ở vị trí đầu tiên trong giỏ (0) [0]
        // Bệnh nhân cứ nằm ở phòng, new nằm trong HEAP
        // thông tin bệnh nhân + phòng -> ghi vào excel/1 dòng trong danh sách
        // bác sĩ cầm trên tay, arr đấy
        // arr là cái túi cái excel chứa tọa độ của bệnh nhân
        
        arr.add(binh); // 1 thẻ bài được thêm vào giỏ trỏ BÌNH 4.9
        arr.add(binh); // add trùng, đã có trước đó 1 thẻ bài trỏ vùng new BINH 4.9 rồi
                       // THÊM 1 THẺ BÀI NỮA GHI INFO TRỎ BÌNH 4.9
        // Danh sách 3 người, 1 người ghi trùng 2 lần
        // in danh sách
        // binh.setName("AHUHU");
        System.out.println("The student list");
        for (Student x : arr) {
            // x = con trỏ/thẻ bài thứ 0, thẻ bài thứ 1, thẻ bài thứ n
            // x lưu tọa độ nằm trong thẻ bài thứ i, tức là trỏ vùng new thứ i
            x.showProfile();
        }
        // LẤY TRỰC TIẾP TỪNG CON TRỎ, KHÔNG CHƠI TRÒ QUÉT FOR EACH
        // ~~~ [i] bên mảng, vị trí thứ i, biến thứ i, chính là chứa trong nó tọa độ vùng new
        System.out.println("The student list (printed by using for i)");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile(); // lấy thẻ bài thứ i trên đó có tọa độ, chấm luôn
        }
        
        // XÓA BÌNH CUỐI TRONG GIỎ, TỨC LÀ LOẠI BỎ ĐI 1 THẺ BÀI,
        // BIẾN MẤT 1 CON TRỎ LUÔN, SIZE() SẼ GIẢM ĐI 1 ĐƠN VỊ,
        // MẢNG KHÔNG CÓ TRÒ NÀY, XIN BAO NHIÊU, FIX BẤY NHIÊU
        arr.remove(2);
        
        System.out.println("The LAST student list");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        // THẺ BÀI (0) GET(0) LUÔN CÓ GHI TRÊN THẺ BÀI INFO CỦA SV AN 9.0 Ở XA
        // THẺ BÀI (1) GET(1) LUÔN CÓ GHI TRÊN THẺ BÀI INFO CỦA SV BÌNH 4.9 Ở XA
        // SẮP XẾP TĂNG DẦN THEO ĐIỂM
        // SURE, PHẢI ĐỔI LẠI INFO TRỎ, CÁCH TRỎ, GHI LẠI CÁI THẺ BÀI TRỎ LẠI ĐI
        // THẺ BÀI 0 PHẢI TRỎ VÀO BÌNH 4.9
        // THẺ BÀI 1 PHẢI GHI LẠI INFO TRỎ, TRỎ VÀO AN 9.0
        // [I] = [J] ĐỔI INFO TRỎ
        // hàm .set(thẻ nào vị trí thẻ bài, thông tin tọa độ mới)
        Student tmpStudent = arr.get(0); // lấy tọa độ vùng new AN 9, thảy vào tmp
        arr.set(0, arr.get(1)); // get(1) được tọa độ của BÌNH 4.9, thảy tọa độ vào thẻ 0
        arr.set(1, tmpStudent); // sửa đồng thời thẻ 1, trỏ vùng mới
                                // vùng tmp đang trỏ, AN 9.0 xưa kia
        
        System.out.println("The student list sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile(); // BÌNH -> AN 4.9 -> 9.0
        }
                                
    }
 
    // Set: nhóm Túi/Giỏ hàng hiệu, mỗi món 1 lần tính, xuất hiện 1 lần
    // không có 2 hay nhiều hơn thẻ bài trong giỏ trỏ cùng 1 vùng new
    // mỗi thẻ bài trong giỏ này trỏ duy nhất 1 vùng new
    // Set chia 2 loại Giỏ chi tiết hơn: HashSet: đồ đưa vào lộn xộn thứ tự
    //                                   TreeSet: đồ đưa vào TỰ ĐỘNG SẮP XẾP
    // ArrayList đưa vào giữ nguyên thứ tự, vào ra đúng thứ tự, get() set() add()
    public static void playWithSet() {
        Set<Student> arr = new HashSet();
        
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.9));
        // CÓ NEW CÓ VÙNG NHỚ MỚI, ĐÃ CÓ AI TRỎ ĐÂU
        // KHÔNG QUAN TÂM INFO TRÙNG CỦA VÙNG NEW
        arr.add(binh);
        arr.add(binh); // add trùng rồi, có 1 thẻ bài trước đó đã trỏ vùng BÌNH
        // ÂM THẦM LOẠI BỎ ADD TRÙNG
        // VÀO RA KHÔNG THEO ĐÚNG THỨ TỰ, ADD() VÀO THÌ OKE, KHÔNG CÓ HÀM GET RA()
        // MUỐN LẤY INFO TRONG SET CHỈ CÓ CÁCH FOR EACH
        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
        
    }
    
    // TÌM KIẾM 1 SINH VIÊN TRONG DANH SÁCH, HÀM TRẢ VỀ OBJECT.
    // ĐỌC ĐÚNG LÀ: HÀM TRẢ VỀ THAM CHIẾU ĐẾN 1 VÙNG NEW
    //              HÀM TRẢ VỀ CÁI THẺ BÀI, TRÊN THẺ CÓ KHẮC TỌA ĐỘ VÙNG NEW
    //              HÀM TRẢ VỀ ĐỊA CHỈ MÀ OBJECT NEW ĐANG NẰM
    //      ~~~   Student x; // cần lắm luôn 1 tọa độ new Student
    public static Student searchStudent(String id) { // tên hàm là 1 tọa độ searchStudent()
        // mò trong ArrayList, mảng [] lấy được thẻ bài, thảy ra ngoài thẻ bài
        // thảy ra ngoài hàm cái tọa độ ghi trong thẻ bài, chính là trỏ đến object
        
        List<Student> arr = new ArrayList();
        
        Student binh = new Student("SE999999", "BÌNH LÊ", 2003, 4.9);
        
        arr.add(new Student("SE123456", "AN NGUYỄN", 2003, 9.0));
        arr.add(binh);
        
        // quét đầu đến cuối giỏ, lôi từng thẻ bài ra, get(i)
        // hỏi tiếp, mssv của bạn là mấy, get(i).getId()
        // if(id cần tìm == id vừa lấy trong giỏ) return thẻ bài khớp info
        // return tọa độ ghi trong thẻ bài, return vùng new SV tìm thấy
        Student tmp = arr.get(0);
        String tmpId = tmp.getId(); // tmpId = arr.get(0).getId()
        // if (tmpId == id đưa vào) thì return
        // không thấy thì return null
        
        if (tmpId.equalsIgnoreCase(id))
            return tmp; // trả về tọa độ vùng new trong thẻ bài 0
        
        return null;        
    }
    
}
