package parentchild;

// 1. Phát hiện IS A, extends
// 2. Khai báo các đặc điểm của Con
// 2.1. Nếu Con trùng với Cha về đặc điểm thì ta không cần khai báo, không cần làm, Cha lo
// 2.2. Con có quyền dị biệt đặc điểm so với Cha, dị biệt hành động luôn (không bàn @Override)
// 3. Phễu Con, giữ bản sắc nếu cần
public class Child extends Parent {

    private String childAsset; // Con tạo dựng cơ ngơi riêng, sure Cha không biết

    public Child(String assetOne, String assetTwo, String childAsset) {        
        super(assetOne, assetTwo); // must be 1st statement in the Child's constructor
        this.childAsset = childAsset;        
    } // Cha chưa tồn tại, lấy chỗ đâu cho Con extends
      // Có Cha rồi mới có Con, Cha sẽ là cánh chim, đưa Con bay thật xa
      // new Cha mở rộng vùng nhớ Cha, mới có chỗ cho Con

    public String getChildAsset() {
        return childAsset;
    }

    public void setChildAsset(String childAsset) {
        this.childAsset = childAsset;
    }
    
    @Override
    public void showProfile() {
        System.out.println("CHILD: asset1: " + assetOne + "; asset2: " + assetTwo);
        System.out.println("By the way, here is my own asset: " + childAsset);
    }
}
