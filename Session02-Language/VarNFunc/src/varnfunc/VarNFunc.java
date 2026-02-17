package varnfunc;

import java.util.Scanner;

public class VarNFunc {

    public static void main(String[] args) {
//        playWithVariables();
//        playWithIntegers();
//        playWithDoubles();
//        playWithCharacters();
//        playWithBooleans();
//        printIntegerList();
//        printIntegerList(200);  // hard-code, code cứng giá trị
//        inputFromKeyboard();
//        int n = getAnInteger();
//        System.out.println("n from keyboard: " + n);
//        
//        // In từ 1 ... n
//        printIntegerList(n); // pass by value, truyền tham trị.
//        testMathFunctions();
        
        int n = getAnInteger();
        if (isPrime(n))
            System.out.println(n + " is a prime.");
        else
            System.out.println(n + " is not a prime.");
        
        printPrimeList();
        print100FirstPrimes();
        solve();
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
    
    // Một biểu thức so sánh, một mệnh đề, câu phát biểu sẽ rơi vào 2 trạng thái: đúng - sai.
    // C: đúng quy ước là 1, sai quy ước là 0 => kiểu int.
    // Java: đúng là true, sai là false => kiểu boolean.
    public static void playWithBooleans() {
        boolean marriedStatus = false;
        if (marriedStatus == true)
            System.out.println("Đánh đồn có địch mới vui.");
        else {
            System.out.println("Vườn hồng có lối nhưng chưa ai vào.");
            System.out.println("Luôn có hy vọng.");
        }
    }
    
    // In ra các số nguyên từ 1 ... 100
    public static void printIntegerList() {
        System.out.println("The list of 100 first integers: ");
        System.out.println("1 2 3 4 5 6 7 8 9 10 11 ...");
        for (int i = 1; i <= 100; i++) 
            System.out.print(i + " ");
        
        System.out.println("");
    }
    
    // In các số tự nhiên từ 1 ... n
    // HIỆN TƯỢNG TRONG 1 CLASS BẤT KỲ MÀ CÓ 2 HÀM TRÙNG TÊN NHAU,
    // NHƯNG KHÁC PHẦN THAM SỐ ĐẦU VÀO, MÀ PHẢI KHÁC TRÊN DATA TYPE, KHÔNG QUAN TÂM TÊN BIẾN,
    // HIỆN TƯỢNG NÀY ĐƯỢC GỌI LÀ OVERLOAD/OVERLOADING - QUÁ TẢI HÀM.
    public static void printIntegerList(int n) {
        System.out.println("The list of " + n + " first integers:");
        for (int i = 1; i <= n; i++) {
            System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    public static void inputFromKeyboard() {
        int n;
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Please input a positive integer: ");
        n = banPhimCuaTui.nextInt();
        System.out.println("n: " + n);
    }
    
    public static int getAnInteger() {
        int n;
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Please input a positive integer: ");
        n = banPhimCuaTui.nextInt();
        return n;
    }
    
    public static void testMathFunctions() {
        //sqrt(4) -> 2
        double result = Math.sqrt(25);
        System.out.println("result: " + result);
        System.out.println(Math.sqrt(100));
    }
    
    // Viết hàm kiểm tra 1 số có phải nguyên tố hay không.
    public static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else
            for (int i = 2; i <= Math.sqrt(n); i++) 
                if (n % i == 0)
                    return false;
        
        return true;
    }
    
    // Viết hàm in ra các số nguyên tố trong đoạn từ 1 ... 1000.
    public static void printPrimeList() {
        for (int i = 1; i <= 1000; i++) {
            if (isPrime(i))
                System.out.print(i + " ");
        }
        System.out.println("");
    }
    
    // Viết hàm in ra 100 số nguyên tố đầu tiên.
    public static void print100FirstPrimes() {
        int tmp = 1;
        for (int i = 1; tmp <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                tmp++;
            }

        }
        System.out.println("");
    }
    
    // Viết hàm nhập vào từ bàn phím 2 hệ số a và b đại diện cho phương trình bậc 1.
    // ax + b = 0
    // In ra nghiệm phương trình này.
    public static void solve() {
        double a, b;
        Scanner banPhimCuaTui = new Scanner(System.in);
        System.out.print("Please input a: ");
        a = banPhimCuaTui.nextDouble();
        System.out.print("Please input b: ");
        b = banPhimCuaTui.nextDouble();
        
        System.out.println(a + "x + " + b + " = 0");
        if (a == 0 && b == 0)
            System.out.println("x là vô cùng.");
        else if (a == 0 && b != 0)
            System.out.println("x vô nghiệm.");
        else if (b == 0)
            System.out.println("x = 0");
        else
            System.out.println("x: " + (-b / a));
    }
    
}
