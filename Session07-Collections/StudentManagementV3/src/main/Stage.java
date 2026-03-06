package main;

import data.Cabinet;
import util.Tool;

public class Stage {
    
    public static void main(String[] args) {
        Cabinet se = new Cabinet();
        int choice;
        do {
            printMenu();
            choice = Tool.inputAnInteger("Please input your choice: ", "Please input an integer! Try again!");
            switch (choice) {
                case 1:
                    se.addAStudent();
                    break;
                case 2:
                    se.printStudentList();
                    break;
                case 3:
                    se.updateAStudent();
                    break;
                case 4:
                    se.deleteAStudent();
                    break;
                case 5:
                    se.searchAStudent();
                    break;
                case 6:
                    se.sortStudentList();
                    break;
                case 7:
                    System.out.println("See you again!");
                    return;
                default:
                    throw new AssertionError();
            }
        } while (true);
    }
    
    public static void printMenu() {
        System.out.println("Welcome to The Student Mangement App!!!");
        System.out.println("We have some functions following:");
        System.out.println("1. Add new student.");
        System.out.println("2. Print student list.");
        System.out.println("3. Update student profile.");
        System.out.println("4. Remove a student.");
        System.out.println("5. Search a student.");
        System.out.println("6. Sort the student list by ascending gpa.");
        System.out.println("7. Quit.");
    }
}
