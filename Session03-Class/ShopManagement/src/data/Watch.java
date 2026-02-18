package data;

public class Watch {
    private String code;
    private String manufacturer;
    private String gender;
    private String waterResistance;
    private double price;

    public Watch(String code, String manufacturer, String gender, String waterResistance, double price) {
        this.code = code;
        this.manufacturer = manufacturer;
        this.gender = gender;
        this.waterResistance = waterResistance;
        this.price = price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getWaterResistance() {
        return waterResistance;
    }

    public void setWaterResistance(String waterResistance) {
        this.waterResistance = waterResistance;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void showWatch() {
        System.out.printf("|%-20s|%-15s|%-10s|%-13s|%10.1f|\n", code, manufacturer, gender, waterResistance, price);
    }
}
