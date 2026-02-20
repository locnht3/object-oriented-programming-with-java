package main;

import data.Shelf;
import data.Student;
import java.util.Scanner;

public class Stage {

    public static void main(String[] args) {
        // Chơi menu: 1. Add ...; 2. Print ...; 3. Search ...; 4. Quit
        // Chờ người chơi chọn món 1 2 3 4 Ahihi - try-catch-do-while
        // if chọn 1 thì tu.add() 2 thì tu.print() 3 thì ...
        // chưa xỉn chưa về, chưa muốn dừng cuộc chơi thì không cho thoát - do-while/while
        Shelf tuSE = new Shelf("PINK", "SE");
        Scanner sc = new Scanner(System.in);
        int choice; // lưu option lựa chọn menu gõ từ bàn phím

        do {
            printMenu();
            System.out.print("Input your choice(1..6): ");
            choice = Integer.parseInt(sc.nextLine());

            //if (choice == 1) == 2 == 3 == 4 == 5
            switch (choice) {
                case 1:
                    tuSE.inputAStudent();
                    break;
                case 2:
                    tuSE.printStudentList();
                    break;
                case 3:
                    tuSE.searchAStudent();
                    break;
                case 6:
                    System.out.println("Bye bye, see you next time!");
                    break;
                default:
                    System.out.println("Please choose 1 to 6, please!!!");
                    break;
            }
        } while (choice != 6); // còn chưa chọn 6 còn lặp lại.
                        // còn đúng thì còn do-làm
                        // đúng là chưa == 6 thì cứ làm đi
                        // chưa bằng 6 đúng ko? đúng hả, làm tiếp đi

    }

    public static void printMenu() {
        System.out.println("Welcome to FAP - FPT Academic Portal");
        System.out.println("Choose the following functions to play with");
        System.out.println("1. Add a student profile");
        System.out.println("2. Print student list");
        System.out.println("3. Search a student by id");
        System.out.println("4. Update a student profile");
        System.out.println("5. Remove a student");  // REMOVE HẾT SỨC CẨN THẬN
        // XÓA KHÔNG HẲN LÀ XÓA, MÀ XÓA LÀ ẨN
        // CẤT CHỖ KHÁC DÀNH CHO NHU CẦU THỐNG KÊ

        System.out.println("6. Quit");
    }

    public static void testTu() {
        //inputStudentList();
        // NGON THÌ MENU VÒNG LẶP CHỌN 1 THÊM HỒ SƠ, 2 IN DANH SÁCH

        Shelf tuSE = new Shelf("PINK", "SE");

        Shelf tuGD = new Shelf("RAINBOW", "GD"); // 2 cái tủ độc lập
        // 2 tủ 2 góc phòng

        tuSE.inputAStudent();
        tuSE.inputAStudent();

        tuGD.inputAStudent();

        tuSE.printStudentList(); // 2 bạn sinh viên
        tuGD.printStudentList(); // 1 bạn sinh viên
    }

    public static void inputStudentList() {
        Scanner sc = new Scanner(System.in);
        String id, name;
        int yob, count;
        double gpa;

        System.out.print("How many students do you want to input? ");
        count = Integer.parseInt(sc.nextLine());

        Student[] arr = new Student[count]; // count = 5

        // for nhập 5 hồ sơ
        for (int i = 0; i < count; i++) {
            System.out.println("Input student #" + (i + 1) + "/" + count);
            System.out.print("Input id: ");
            id = sc.nextLine();

            System.out.print("Input name: ");
            name = sc.nextLine();

            System.out.print("Input yob: ");
            yob = Integer.parseInt(sc.nextLine());

            System.out.print("Input gpa: ");
            gpa = Double.parseDouble(sc.nextLine());

            arr[i] = new Student(id, name, yob, gpa);
        }

        System.out.println("The student list");
        for (Student x : arr) {
            x.showProfile();
        }
    }

}
