package main;

import data.Shelf;
import java.util.Scanner;

public class Stage {

    public static void main(String[] args) {
        Shelf bookShelf = new Shelf("TỦ CHÍNH", "Black");
        System.out.println("Welcome to the book store!");
        System.out.println("1. Input a book");
        System.out.println("2. Show book list");
        System.out.println("3. Sign out.");
        Scanner sc = new Scanner(System.in);

        do {
            try {
                System.out.print("Please choose: ");
                int n = Integer.parseInt(sc.nextLine());
                switch (n) {
                    case 1:
                        System.out.println(bookShelf.inputABook());
                        break;
                    case 2:
                        bookShelf.printBookList();
                        break;
                    case 3:
                        return;
                    default:
                        throw new AssertionError();
                }
            } catch (Exception e) {
                System.out.println("Please check your input!");
            }
        } while (true);

    }

}
