package studentprofile;

import java.util.Scanner;

public class StudentProfile {
    
    // Bài thí nghiệm về việc nhập xuất, làm đơn giản, không OOP, không class.
    
    public static void main(String[] args) {
        inputProfile();
    }
    
    public static void inputProfile() {
        // Nhập vào thông tin SV gồm tên, yob, địa chỉ, và in ra.
        String name, address;
        int yob;
        Scanner sc = new Scanner(System.in);
        System.out.print("Input name: ");
        name = sc.nextLine().toUpperCase();
        
        System.out.print("Input yob: ");
//        yob = sc.nextInt();
//        // nextInt() để lại rác trong buffer, ít nhất là enter, hoặc dấu cách dư và enter.
//        // Vậy nên xóa bộ đệm trước khi vào chuỗi.
//        // Ta lợi dụng lệnh nextLine() hốt sạch buffer kể cả enter.
//        sc.nextLine();  // ghi chơi vậy thôi, ko gán biến nào, mục tiêu là hốt sạch rác.
        
        // Cách 2 để xóa rác trong buffer.
        yob = Integer.parseInt(sc.nextLine());
                      // hàm static, chấm mà xài, không cần new, không cần nhớ lại data đã xử lí.
                      
        System.out.print("Input address: ");
        address = sc.nextLine();
        
        System.out.println("Your profile");
        System.out.println("Name: " + name);
        System.out.println("Yob: " + yob);
        System.out.println("Address: " + address);
        System.out.println("---End of profile---");
    }
    
}
