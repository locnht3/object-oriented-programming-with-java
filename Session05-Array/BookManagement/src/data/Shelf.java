package data;

import java.util.Scanner;

public class Shelf {
    private String label;
    private String color;
    private Book[] ds = new Book[100];
    private int count = 0;
    private Scanner sc = new Scanner(System.in);

    public Shelf(String label, String color) {
        this.label = label;
        this.color = color;
    }
    
    public String inputABook() {
        String id, name;
        int quantity;
        double price;
        
        System.out.println("Please input #" + (count + 1) + "/" + ds.length);
        System.out.print("Input id: ");
        id = sc.nextLine();
        System.out.print("Input name: ");
        name = sc.nextLine();
        System.out.print("Input quantity: ");
        quantity = Integer.parseInt(sc.nextLine());
        System.out.print("Input price: ");
        price = Double.parseDouble(sc.nextLine());
        
        ds[count] = new Book(id, name, quantity, price);
        count++;
        
        return "Add " + name + " successfully!";
    }
    
    public void printBookList() {
        System.out.println("The book list: ");
        for (int i = 0; i < count - 1; i++) {
            for (int j = i + 1; j < count; j++) {
                if (ds[i].getPrice() > ds[j].getPrice()) {
                    Book t = ds[i];
                    ds[i] = ds[j];
                    ds[j] = t;
                }
            }
        }
        for (int i = 0; i < count; i++) {
            ds[i].showInfo();
        }
    }
}
