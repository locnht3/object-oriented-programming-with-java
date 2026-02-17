package varnfunc;

public class VarNFunc {

    public static void main(String[] args) {
//        playWithVariables();
//        playWithIntegers();
//        playWithDoubles();
        playWithCharacters();
    }
    
    // static chỉ chơi với static.
    public static void playWithVariables() {
        // Biến là 1 vùng ram được đặt tên/định danh/identifier, chiếm 1 số byte nhất định
        // tùy hình thái dữ liệu mà nó sẽ chứa, dùng để chứa 1 value nào đó.
        // Biến là cách đặt tên cho 1 đại lượng, 1 giá trị.
        // Hình thái dữ liệu được gọi là data type: primitive, object.
        
        int yob = 2003;
        int a = 79, b;
        b = 39;      
        System.out.println("yob: " + yob);
        
        int age = 2026 - yob;
        System.out.println("age: " + age + " years old");
        System.out.println("age: " + (2026 - yob) + " years old");
        System.out.printf("age: %d years old\n", age);
    }
    
    // Mọi giá trị/value xuất hiện trong code, số nào đó, chữ nào đó, chuỗi nào đó (3.14, 0,1, "age")
    // được gọi là literal value.
    // Mọi literal value của số nguyên trong code/mọi số nguyên xuất hiện trong code
    // được xem là 4 bytes int.
    public static void playWithIntegers() {
        int n = 2_100_000_000;
        System.out.println("n: " + n);
        
        long money = 5_000_000_000L;
        System.out.println("money: " + money);
        
        int status = 0xFA;  // hệ hexa
        System.out.println("status: " + status);    // 250
        
        int phone = 070;    // hệ octal
        System.out.println("phone: " + phone);  // 56
    }
    
    // Mặc định Java ưu tiên chơi với double hơn là float.
    // Mọi số thực trong code được xem là double.
    public static void playWithDoubles() {
        double pi = 3.14;
        System.out.println("pi: " + pi);
        System.out.printf("pi: %.2f\n", pi);  //%lf không hỗ trợ, Java xài chung %f
        
        float vat = 0.1F;
        System.out.println("vat: " + vat);
    }

    // Trong Java, kiểu char xài 2 bytes, dùng dấu '' biểu thị là một kí tự đơn.
    public static void playWithCharacters() {
        char unit = '$';
        System.out.println("unit: " + unit);
        
        // Lưu tên, lưu 1 câu văn, đoạn văn, chuỗi, gồm nhiều kí tự ghép lại,
        // xử lí trên chuỗi là phải xài hàm, tên mảng không phải là primitive.
        // Java cung cấp 1 data type hoàn toàn mới. dùng để lưu trữ chuỗi - String.
        // String dùng để lưu trữ, tên gọi cho những thứ phức tạp, một loạt các kí tự ở với nhau - kiểu object.
        String name = "Ngô Huỳnh Tấn Lộc";
        System.out.println("name: " + name);      
        System.out.println("1st letter in my name: " + name.charAt(0));
        System.out.println("My name as in a lowercase: " + name.toLowerCase());
    } 
    
}
