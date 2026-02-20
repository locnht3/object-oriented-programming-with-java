package main;

import data.Shelf;
import data.Student;
import java.util.Scanner;

public class Stage {

    public static void main(String[] args) {      
        //inputStudentList();
        // NGON THÌ MENU VÒNG LẶP CHỌN 1 THÊM HỒ SƠ, 2 IN DANH SÁCH
        
        Shelf tuSE = new Shelf("PINK", "SE");
        
        tuSE.inputAStudent();
        tuSE.inputAStudent();
        
        tuSE.printStudentList();
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
