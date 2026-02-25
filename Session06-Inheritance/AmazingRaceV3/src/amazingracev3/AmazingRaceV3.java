package amazingracev3;

import data.DeathRacer;
import data.Dog;
import data.Motor;
import data.Pet;

public class AmazingRaceV3 {

    public static void main(String[] args) {
       runToDead();
    }
    
    public static void runToDead() {
        
        // CÓ QUYỀN CÓ AI ĐÓ CHẠY NGANG NHẢY VÔ
        // MĨ NHÂN NGƯ CỦA CHÂU TINH TRÌ NHẢY VÀO!!!
        
        Dog d1 = new Dog("NGÁO ĐÁ", 2020, 50.0);
        // chấm full hàm của Con, đủ code hàm Cha, CLB
        
        Pet d2 = new Dog("VÀNG ƠI", 1950, 10.0);
        // chấm full hàm Cha, khai Cha, chạy không sợ vì đa hình Con qua mặt
        // tổ lái con trỏ được, new Dog mà sợ gì
        // tao là "danh nghĩa Cha" thì chỉ xổ Cha thôi
        // mày biết Bố tao là ai không? hù theo kiểu Bố
        
        DeathRacer d3 = new Dog("NANH TRẮNG", 1901, 20.0);
        // ngộ nhỡ dấu chấm thì sao?
        // chấm chỉ xổ full CLB, 2 hàm runToDead() showHowToDead()
        // tao là đua thủ chỉ quan tâm đua thôi
        // chạy không sợ vì Con qua mặt, có đủ hàm Override đã làm rồi, đa hình tiếp
        // ép con trỏ được luôn, new Dog mà sợ gì
        
        Motor m1 = new Motor("EXCITER", "150.0cm3", "58F8-22204");
        DeathRacer m2 = new Motor("WINNER", "150.0cm3", "56F6-67889");
        
        DeathRacer racer[] = {d1, (Dog)d2, d3, m1, m2};
        // racer[0] = new Dog(...);
        // racer[1] = new Motor(...);
        // toàn bộ là DeadRacer, đa hình là đa hình trên runToDead() showHowToDead()
        // Con tự lo, Con Motor chạy theo kiểu Motor, Con Dog chạy theo Dog
        
        System.out.println("The racing record");
        for (DeathRacer x : racer) {
            x.showHowToDead();
        }
    }
    
}
