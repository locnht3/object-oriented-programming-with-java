package amazingrace;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;

public class AmazingRace {

    public static void main(String[] args) {
        register();
    }
    
    public static void register() {
        Cat tom = new Cat("TOM", 1950, 10.5, "><");
        Pet kitty = new Cat("KITTY", 1990, 5.0, "><");
        tom.showRecord();
        kitty.showRecord();
        
        Dog ngaoDa = new Dog("NGÁO ĐÁ", 2021, 50.0);
        Pet beTo = new Dog("BÊ-TÔ", 2012, 5.0);
        ngaoDa.showRecord();
        beTo.showRecord();
        
        Hamster jerry = new Hamster("JERRY", 1950, 1.2);
        Pet ty = new Hamster("TÝ", 2000, 0.5);
        jerry.showRecord();
        ty.showRecord();
        
        Pet[] arr = new Pet[]{tom, kitty, ngaoDa, beTo, jerry, ty};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].run() > arr[j].run()) {
                    Pet t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        
        System.out.println("The list of pets after ascending by speed");
        for (Pet x : arr) {
            x.showRecord();
        }
        
    }
    
    // run() là đa hình
    // if ([i].run() > [j].run()) khó vì mỗi lần gọi run() thằng i, j là khác nhau
    // getArea() getGpa() là cố định lúc sort, 2 for không đôi S, GPA
    // còn run() không cố định
    
}
