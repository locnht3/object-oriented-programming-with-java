package amazingracev3;

import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;
import java.util.*;

public class AmazingRaceV3 {

    public static void main(String[] args) {
       runToDead();
    }
    
    public static void runToDead() {
        
        // CÓ QUYỀN CÓ AI ĐÓ CHẠY NGANG NHẢY VÔ
        // MĨ NHÂN NGƯ CỦA CHÂU TINH TRÌ NHẢY VÀO!!!
        // Người Cá đúng chuẩn - class Mermaid thì chuyên ngồi mỏm đá, dụ thủy thủ đến bắt ăn thịt!!!
        // nếu ta làm class Mermaid rời - concrete, phải chuột tạo mới class Mermaid, viết code bình thường,
        // trong code này có hàm batThuyThuVaAnThit()
        // bắt Mermaid implement DeathRacer, bắt người cá đi đua thì chuyện này quá đáng, 
        // không phù hợp logic, người cá không thích di chuyển đi đua!!!
        
        // Nhưng có 1 nàng người cá thích ăn chay, lên bờ chơi với con người,
        // không theo logic chung người cá là ăn thịt người thủy thủ,
        // object lẻ không nhập chung đoàn Mermaid truyền thống,
        // không bắt Mermaid implements DeathRacer,
        // Mĩ nhân ngư Châu Tinh Trì phá đoàn, tham gia đua dưới kênh Nhiêu Lộc cho vui,
        // không bắt cả họ Người Cá đi đua,
        // object đánh lẻ, đánh lẻ đua, thì chỉ cần đua tốc độ là được rồi,
        // Anonymous Class, không thèm tạo Class rời, mà vẫn tham gia CLB,
        // chỉ cần có hành động của CLB là oke rồi, ghé ngang thôi thì cũng phải hành động,
        // implements all abstract methods on the go, take-away
        
        // Làm class riêng rẽ để nhân bản được nhiều Member,
        // làm on the go dành cho vãng lai ghé ngang,
        // CẢ 2 ĐỀU PHẢI IMPLEMENTS, @OVERRIDE VÌ CHA, CLB KHÔNG HOÀN HẢO
        
        // OBJECT ON THE GO, CẦN CÓ HÀM ĐUA VÀ GÁY THÀNH TÍCH LÀ XONG, KHÔNG LÀM CLASS RỜI, KHÔNG LÀM CLASS CÓ SẴN ĐỂ NHÂN BẢN
        // DeathRacer mnnCTT = new Mermaid();  // class rời này sẽ có @Override
                                               // 2 hàm runToDead() showHowToDead() - y chang Motor à
        // mượn gió bẻ măng, không có Khuôn sẵn thì phải code @Override từ đầu,
        // cho mỗi lần chơi trò làm biếng tạo Khuôn
        // on the go @Override
        DeathRacer mnnCTT = new DeathRacer() {
            // VÙNG KHÔNG GIAN CỦA CLASS MERMAID MÀ TA LÀM BIẾNG LÀM RIÊNG
            // VÙNG NÀY CHÍNH LÀ PHẦN MỞ RỘNG CỦA CHA/CLB
            // BA SẼ LÀ CÁNH CHIM (new/super() new DeathRacer)
            // đưa Con extends/implements thật xa thật nhiều @Override
            // ta có quyền làm như truyền thống, thêm đặc điểm...
            // đừng lạm dụng, on-the-go thì nên quan tâm phần đang tham gia
            public static final double MAX_SPEED = 50.0;
            
            @Override
            public double runToDead() {
                return new Random().nextDouble() * MAX_SPEED * 3;
            }
            
            // anonymous làm biếng tạo class rời cho cả abstract class và interface
            // bên Abstract class thì ta còn có đặc điểm của Cha cho để xài
            // anonymous của Interface, đua thì đua đi, hỏi han làm chi, không có infor
            @Override
            public void showHowToDead() {
                System.out.printf("|%-20s|%-15s|2015|%5.1f|\n", "MERMAID-RACER", "MNN CTT", runToDead());
            }
        };
                                               
        
        Dog d1 = new Dog("NGÁO ĐÁ", 2020, 50.0);
        // chấm full hàm của Con, đủ code hàm Cha, CLB
        
        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        // chấm full hàm Cha, khai Cha, chạy không sợ vì đa hình Con qua mặt
        // tổ lái con trỏ được, new Dog mà sợ gì
        // tao là "danh nghĩa Cha" thì chỉ xổ Cha thôi
        // mày biết Bố tao là ai không? hù theo kiểu Bố
        
        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        // ngộ nhỡ dấu chấm thì sao?
        // chấm chỉ xổ full CLB, 2 hàm runToDead() showHowToDead()
        // tao là đua thủ chỉ quan tâm đua thôi
        // chạy không sợ vì Con qua mặt, có đủ hàm Override đã làm rồi, đa hình tiếp
        // ép con trỏ được luôn, new Dog mà sợ gì
        
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");
        
        // mnn em vẫn là một Racer, có hành động đua gấp 3 lần giới hạn vật lí người cá,
        // em xứng đáng gia nhập CLB DeathRacer
        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2, mnnCTT};
        // racer[0] = new Dog(...);
        // racer[1] = new Motor(...);
        // toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowToDead()
        // Con tự lo, Con Motor chạy theo kiểu Motor, Con Dog chạy theo Dog
        
        System.out.println("The racing record");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
     
}
