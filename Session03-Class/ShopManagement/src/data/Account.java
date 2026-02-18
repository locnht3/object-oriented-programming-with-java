package data;

public class Account {
    private String id;
    private String name;
    private String cccd;
    private String phone;
    private double balance;

    public Account(String id, String name, String cccd, String phone, double balance) {
        this.id = id;
        this.name = name;
        this.cccd = cccd;
        this.phone = phone;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public void showProfile() {
        System.out.printf("|%-4s|%-20s|%12s|%10s|%9.1f|\n", id, name, cccd, phone, balance);
    }
    
    public void withdrawMoney(double money) {
        if (balance <= 50000)
            System.out.println("Tài khoản không đủ số dư.");
        else if (balance - money <= 50000)
            System.out.println("Số tiền cần rút không thực hiện được. Vui lòng thử số tiền khác.");
        else {
            setBalance(balance - money);
            System.out.println("Giao dịch thực hiện thành công.");
        }
            
    }
}
