package data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import util.Tool;

public class Cabinet {

    private List<Student> arr = new ArrayList<>();

    private Scanner sc = new Scanner(System.in);

    public Cabinet() {
    }

    public void addAStudent() {
        String id, name;
        int yob;
        double gpa;

        System.out.println("Please input the profile of student #" + (arr.size() + 1));
        while (true) {
            id = Tool.inputAString("Please input id: ", "Try another one!");
            Student xxx = searchAStudent(id);
            if (xxx != null) {
                System.out.println("Duplicated Id. Try another one!");
            } else {
                break;
            }
        }

        name = Tool.inputAString("Please input name: ", "Try another one!");
        yob = Tool.inputAnInteger("Please input yob: ", "This is not an integer. Please try again.");
        gpa = Tool.inputADouble("Please input gpa: ", "This is not a double. Please try again");
        arr.add(new Student(id, name, yob, gpa));
        System.out.println("Add new student successfully!");
    }

    public Student searchAStudent(String id) {
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).getId().equalsIgnoreCase(id)) {
                return arr.get(i);
            }
        }
        return null;
    }

    public void printStudentList() {

        if (arr.isEmpty()) {
            System.out.println("There is nothing to print.");
            return;
        }
        System.out.println("There is/are " + arr.size() + " student(s)");
        for (Student x : arr) {
            x.showProfile();
        }
    }

    public void updateAStudent() {
        String id;
        String newName;
        int newYob;
        double newGpa;

        if (arr.isEmpty()) {
            System.out.println("There is nothing to update.");
            return;
        }

        id = Tool.inputAString("Please input id that you want to update: ", "Try again!");
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND STUDENT with id: " + id);
            return;
        }
        System.out.println("Before updating");
        xxx.showProfile();

        newName = Tool.inputAString("Please input new name: ", "Try again!");
        xxx.setName(newName);
        newYob = Tool.inputAnInteger("Please input new yob: ", "This is not an integer! Please try again!");
        xxx.setYob(newYob);
        newGpa = Tool.inputADouble("Please input new gpa: ", "This is not a double! Please try again!");
        xxx.setGpa(newGpa);

        System.out.println("After updating");
        xxx.showProfile();
    }

    public void deleteAStudent() {
        String id;
        if (arr.isEmpty()) {
            System.out.println("There is nothing to delete.");
            return;
        }

        id = Tool.inputAString("Please input id that you want to delete: ", "Try again!");
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND STUDENT with id: " + id);
            return;
        }

        arr.remove(xxx);
        System.out.println("Remove student with id: " + id + " successfully!");
    }

    public void searchAStudent() {
        String id;

        if (arr.isEmpty()) {
            System.out.println("There is nothing to search.");
            return;
        }

        id = Tool.inputAString("Please input id that you want to search: ", "Try again!");
        Student xxx = searchAStudent(id);
        if (xxx == null) {
            System.out.println("NOT FOUND STUDENT with id: " + id);
            return;
        }

        System.out.println("Student found!!! Here she/he is: ");
        xxx.showProfile();
    }

    public void sortStudentList() {
        if (arr.isEmpty()) {
            System.out.println("There is nothing to sort.");
            return;
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

        System.out.println("The student list after sorting by ascending gpa");
        for (Student x : arr) {
            x.showProfile();
        }
    }

}
