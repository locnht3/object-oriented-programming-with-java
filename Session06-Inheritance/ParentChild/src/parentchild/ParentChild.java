package parentchild;

public class ParentChild {

    public static void main(String[] args) {
        playWithPointer();
    }
    
    public static void playWithPointer() {
        Parent p = new Parent("BIỆT THỰ", "1000 BTC");
        p.showProfile();
        // p. // xổ tất cả của Cha
                     
        Child c1 = new Child("CĂN HỘ", "100 BTC");
        c1.showProfile();
        // c. // xổ tất cả của Con (Cha cho + @Override + thêm phần khác nữa nếu có)
        c1.sayHello();
        
        Parent c2 = new Child("NHÀ PHỐ", "100 ETH");
        c2.showProfile();   // gọi Cha nhưng chạy Con - @Override
        //c2.sayHello(); // Không xổ ra của riêng Con dù đã new Con và có sẵn trong ram luôn
        // mình đang cư xử như Ba, Cha, dùng danh nghĩa Cha
        // mày biết Cha tao là ai không? Hù theo kiểu của Ba thì phải tuân theo hành động của Ba
        // Con đang dùng danh nghĩa Ba, thì phải cư xử như Ba.
        // Tổ lái con trỏ xuống đáy vùng new Con sẽ lấy được hàm sayHello().
        // Child x = cần trỏ vùng new Con
        
        Child x = (Child)c2;    // mày hãy ráng xuống vùng new Child lấy cho tao cái tọa độ vùng new Child
                                // để tao giữ lại trong x
        //        c2 trỏ vùng new Cha, super
        x.sayHello();
        // x cùng trỏ vùng new NHÀ PHỐ
        
        // Cách 2, nương theo cách 1, nhưng không tốn 1 con trỏ Child
        //(Child)c2. // Không xổ vì dấu chấm có độ ưu tiên cao, ăn theo data type
        ((Child)c2).sayHello(); // dấu ngoặc thay đổi độ ưu tiên, ép xong đi đã 
                                // rồi hãy chấm, kéo sợi thun xong chưa, xong rồi đó.
        // Miễn là lấy được tọa độ thì chấm,
        // tọa độ gán vào biến chấm thì quá tầm thường.       
    }
    
}
