package amazingracev2;

import data.Cat;
import data.Dog;
import data.Hamster;
import data.Pet;
import java.util.Random;

public class AmazingRaceV2 {

    public static void main(String[] args) {
        //showRecords();
        showRecordsWithTakeAway();
    }
    
    public static void showRecords() {
        Hamster xx = new Hamster("NHẮT", 2020, 0.3);
        Pet racer[] = new Pet[] { new Dog("CHIHUHU", 2020, 0.5),
                                  new Dog("VÀNG ƠI", 1950, 10.0),
                                  new Cat("TOM", 1960, 15.0),
                                  new Cat("KITTY", 1990, 5.0),
                                  new Hamster("JERRY", 1960, 0.5),
                                  xx
                                };
        // racer[0] = new Dog("", 0, 0);
        // phần tử mảng Pet thì phải là gán 1 con Pet nào đó, Cat, Dog, Hamster
        // gán = new Dog(...); [i] = cần tọa độ vùng new Con Nào Đó()
        // new Dog() ...: bố trí vùng RAM trong HEAP, gọi phễu đổ vào, lấy mốc tọa độ vùng new đưa cho ai đó
        // Đa hình quay trở lại
        // vì mảng Pet, mọi việc CHẤM LÀ CỦA CHA, CỦA PET, CHA TOÀN LÀ ABSTRACT,
        // HOÀN TOÀN KHÔNG ĐÁNG LO, VÌ CON ĐÃ IMPLEMENT
        // CHA QUẤT ROI CHẠY ĐI CHÚNG MÀY, THẾ LÀ 3 ĐỨA CON CHẠY THEO
        // TỐC ĐỘ CỦA RIÊNG CHÚNG, ĐA HÌNH XUẤT HIỆN, OVERRIDE QUA MẶT CHA XUẤT HIỆN
        System.out.println("The records table");
        for (Pet x : racer) {
            // x= racer[0]; x = racer[i]
            x.showRecord();
        }
        
        // TẠI THỜI ĐIỂM VIẾT CODE THẾ NÀY, KHÔNG SORT THÀNH TÍNH CHẠY ĐƯỢC
//        for (int i = 0; i < racer.length - 1; i++) {
//            for (int j = i + 1; j < racer.length; j++) {
//                if (racer[i].run() > racer[j].run()) {
//                    // đa hình, hàm Cha nhưng chạy Con tương ứng: Hamster, Dog, Cat
//                    // Mỗi lần gọi run() để so sánh thì sẽ tốc độ khác
//                }   // bài SV, Hình Học, S cố định cho n lần gọi
//            }       // điểm trung bình cố định cho đến khi cập nhật điểm mới
//        }           // for hoài, getGPA(), getS() cố định nên ta đảo được
//                    // bài AmazingRace bắt tụi nhỏ chạy 1 lượt để ghi nhận thành tích,
//                   // ta so sánh trên thành tích chạy này
                   
        System.out.println("The records table after sorting ascending speed");
        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    Pet t = racer[i];
                    racer[i] = racer[j];
                    racer[j] = t;
                }
            }
        }
        
        for (Pet x : racer) {
            x.showRecord();
        }

    }
    
    public static void showRecordsWithTakeAway() {
        
        // Đường đua đông vui, có nhiều racer, và có một con gì đó không nhìn rõ bay theo,
        // vật gì đó bay theo, tức là có tốc độ,
        // mình không biết, không xác định được nhóm của nó là gì, chưa biết class gì
        // vì mày muốn nhập hội, oke, chạy theo đi, chơi trò take-away
        // mượn gió bẻ măng, mượn Pet để new Object
        
        Pet ufo = new Pet("UFO", 2021, 0.3) {
            
            public static final double MAX_SPEED = 30;
            
            @Override
            public double run() {
                if (count == 1) {
                    firstRecord = new Random().nextDouble() * MAX_SPEED;
                    count++;
                }
                return firstRecord;
            }
            
            @Override
            public void showRecord() {
                System.out.printf("|%-10s|%-10s|%4d|%4.1f|%4.1f|\n", "UFO", name, yob, weight, run());
            }
        };
        
        Hamster xx = new Hamster("NHẮT", 2020, 0.3);
        Pet racer[] = new Pet[] { new Dog("CHIHUHU", 2020, 0.5),
                                  new Dog("VÀNG ƠI", 1950, 10.0),
                                  new Cat("TOM", 1960, 15.0),
                                  new Cat("KITTY", 1990, 5.0),
                                  new Hamster("JERRY", 1960, 0.5),
                                  xx,
                                  ufo
                                };
        
        System.out.println("The records table");
        for (Pet x : racer) {
            x.showRecord();
        }        
                   
        System.out.println("The records table after sorting ascending speed");
        for (int i = 0; i < racer.length - 1; i++) {
            for (int j = i + 1; j < racer.length; j++) {
                if (racer[i].run() > racer[j].run()) {
                    Pet t = racer[i];
                    racer[i] = racer[j];
                    racer[j] = t;
                }
            }
        }
        
        for (Pet x : racer) {
            x.showRecord();
        }

    }
      
}
