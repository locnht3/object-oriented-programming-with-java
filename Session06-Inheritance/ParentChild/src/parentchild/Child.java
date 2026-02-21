package parentchild;

public class Child extends Parent {

    public Child(String assetOne, String assetTwo) {
        super(assetOne, assetTwo);
    }
    
    @Override
    public void showProfile() {
        System.out.println("CHILD: asset1: " + assetOne + "; asset2: " + assetTwo);
    }
    
    // Biến dị hoàn toàn, tức là có hàm mà bên Cha không có,
    // đừng hỏi tui nếu Cha có thêm hàm, Con bị ảnh hưởng liền.
    
    public void sayHello() {
        System.out.println("Hey, I am a rich kid!!!");
    }

}
