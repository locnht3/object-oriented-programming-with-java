package parentchild;

public class Parent {
    protected String assetOne; // Cha có 2 món tài sản, Con sẽ có luôn
    protected String assetTwo;

    public Parent(String assetOne, String assetTwo) {
        this.assetOne = assetOne;
        this.assetTwo = assetTwo;
    }

    public void setAssetOne(String assetOne) {
        this.assetOne = assetOne;
    }

    public void setAssetTwo(String assetTwo) {
        this.assetTwo = assetTwo;
    }

    @Override
    public String toString() {
        return "Parent{" + "assetOne=" + assetOne + ", assetTwo=" + assetTwo + '}';
    }
    
    public void showProfile() {
        System.out.println("PARENT: asset1: " + assetOne + "; asset2: " + assetTwo);
    }
    
    
}
