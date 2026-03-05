package studentmanagement;

import data.Student;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StudentManagement {

//    public static void main(String[] args) {
//        //playWithArrayList();
//        //sortArrayListManually();
//        //playWithSet();
////        Student xxx = searchStudent("se123466");
////        if (xxx != null) // null được quyền kết hợp với == != có trỏ null đáy ram hay không
////            xxx.showProfile();
////        else
////            System.out.println("NOT FOUND!!!");
//        sortStudentList();
//    }
        
//    public static void main(String[] args) {
//        List<Student> arr = initData(); // arr here trỏ thẳng vào Túi có 5 SV
//        System.out.println("The student list");
//        for (Student x : initData()) {
//            x.showProfile();
//        }
//        
//    }
        
    public static void main(String[] args) {
        List<Student> arr = initData();
        Student xxx = searchAStudent(arr, "se888888");
        if (xxx == null)
            System.out.println("NOT FOUND!!!");
        else { // vi diệu nè
            xxx.showProfile();
            // nếu tìm thấy tui sẽ update dữ liệu luôn, sửa điểm bạn TÁM thành 6789
            xxx.setGpa(6789);
        }
        
        // In ra kết quả
        System.out.println("The student list after updating SE8");
        for (Student x : arr) {
            x.showProfile();
        }
           
    }
    
    // Hàm chuẩn bị Data. HÀM TRẢ VỀ 1 CÁI TÚI/ARRAYLIST/DANH SÁCH SV
    // ĐỌC ĐÚNG: HÀM TRẢ VỀ TỌA ĐỘ VÙNG NEW ARRAYLIST() MÀ BÊN TRONG CÓ SẴN 1 ĐỐNG CARDVISIT GHI ĐỊA CHỈ SV
    //           HÀM TRẢ VỀ VỊ TRÍ 1 CÁI TÚI CÓ SẴN/MUA RỒI. TRONG TÚI CÓ ...
    //            List<Student> arr; = new gì đó
    //                          initData = new ArrayList(); nào đó
    public static List<Student> initData() {
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE444444", "BỐN VÕ", 2003, 4.4));
        arr.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arr.add(new Student("SE888888", "TÁM LÍ", 2003, 8.8));
        return arr; // initData() = arr = new ArrayList();
    }   // tên hàm cùng trỏ vào giỏ vừa new - 2 CHÀNG ARR, TÊN HÀM CÙNG TRỎ 1 NÀNG NEW ARRAYLIST(BÊN TRONG CÓ 5 THẺ SV)
    
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
    
    // CÁC HÀM XỊN SÒ, SORT, SEARCH, CHUẨN BỊ KHO DATA
    // 3 HÀM NÀY ĐỀU LÀ STATIC CHO MỤC TIÊU THỬ NGHIỆM, NÓ CHƯA LÀ TƯ DUY OOP
    // TƯ DUY OOP LÀ: CÁC HÀM PHẢI NẰM TRONG OBJECT NÀO ĐÓ
    //                CHẾ TẠO CÁI TỦ, THÙNG CHỨA, CÓ CÁC HÀNH ĐỘNG: THÊM, XÓA, TÌM, ...
    public static void sortStudentList() {
        // cần chuẩn bị danh sách SV: mua cái Túi - new Túi(), có các hồ sơ SV
        List<Student> arr = new ArrayList<>();
        arr.add(new Student("SE555555", "NĂM LÊ", 2003, 5.5));
        arr.add(new Student("SE999999", "CHÍN PHẠM", 2003, 9.9));
        arr.add(new Student("SE444444", "BỐN VÕ", 2003, 4.4));
        arr.add(new Student("SE222222", "HAI TRẦN", 2003, 2.2));
        arr.add(new Student("SE888888", "TÁM LÍ", 2003, 8.8));
        // TÚI đang có chứa thẻ bài, cardvisit, 5 biến con trỏ, tham chiếu
        //                  thông tin trên card chính là địa chỉ vùng new Student(...) trên HEAP
        // y chang bác sĩ cầm danh sách Excel chứa info các bệnh nhân,
        // bênh nhân cứ nằm phòng bệnh, bác sĩ đi thăm sau. Bác sĩ thăm, nhìn danh sách, thấy số phòng,
        // chính là địa chỉ từng bệnh nhân.
        // Bệnh Nhân 1, Bệnh Nhân 2, Thẻ 1, Thẻ 2, Card 1, Card 2 chính là biến con trỏ,
        // trên đó có địa chỉ object ~~~ get(i) - lấy được cái thẻ
        System.out.println("The student list before sorting ascending by gpa");
        for (Student x : arr) {
            // x = arr.get(i); // lấy tọa độ địa chỉ ghi trên thẻ thứ i
            // cất vào x
            x.showProfile();
        }
        
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student t = arr.get(i);
                    arr.set(i, arr.get(j));
                    arr.set(j, t);
                }
            }
        }
        
        System.out.println("The student list before sorting ascending by gpa");
        for (int i = 0; i < arr.size(); i++) {
            arr.get(i).showProfile();
        }
        
    }
    
    //            Student x = cần trỏ 1 vùng new SV()
    //                    tên hàm là 1 biến SV, tên hàm này cần trỏ 1 vùng new SV
    // hàm trả về giá trị thì tên hàm ~~~ giá trị
    // double r = sqrt(4); -> 
    //                                   arr trỏ 1 cái Giỏ có sẵn
    //                                   Giỏ ArrayList new ở đâu ko quan tâm, trong Giỏ có gì không care vội, lục lọi sau
    // Xài hàm này ta cần chuẩn bị sẵn 1 cái Túi/Giỏ ở đâu đó trước rồi, có đồ bên trong luôn, đưa vị trí Giỏ có sẵn đó vào trong hàm
    public static Student searchAStudent(List<Student> arr, String id) {
        // rà qua các phần tử trong mảng, Giỏ, lôi từng thẻ/con trỏ
        // hỏi thẻ đó, ê, cho tôi biết SV này có id mấy, (i).getId()
        // if (id mới tìm == id cần tìm đưa vào) return tọa độ/địa chỉ trên thẻ
        // nếu không thấy, return null; // tên hàm trỏ vào null, không có SV, chấm bị Exception
        // SV không tìm thấy mà chấm là vô nghĩa!!!
        // TA CẦN DANH SÁCH SV, ĐỂ FOR
        // cần chuẩn bị danh sách sv: mua cái Túi - new Túi(), có các hồ sơ SV
        if (arr.isEmpty())    // đưa Túi rỗng mới mua, không có gì để search
            return null;      // cho mày tọa độ NULL trả về
        
        for (int i = 0; i < arr.size(); i++) {
            // lôi từng thẻ ra, hỏi id của mỗi sv
//            Student t = arr.get(i);
//            String tId = t.getId(); // định luật bắt cầu arr.get(i).getId()
//            //if (tId == id) id vừa lấy của SV == id đưa vào thì return tọa độ
//            if (tId.equalsIgnoreCase(id))
//                return t;   // arr.get(i);

            if (arr.get(i).getId().equalsIgnoreCase(id))
                return arr.get(i);
        }
        // đi hết for không return được, sure không thấy, trả về null
        return null;
    }
    
}
