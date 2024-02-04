package Labs.Clark_Lab01_03;

public class Customer extends User {
    private String address;
    private String phoneNum; // Not an int?

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void addToCart(int productId, String userId){}
    public void removeFromCart(int productId, String userId){}
    
}
