package Labs.Clark_Lab01_03;

import java.util.ArrayList;

public class Cart {
    private int cartId;
    private String userid;
    private ArrayList<Integer> Products;
    
    public ArrayList<Integer> getProducts() {
        return Products;
    }

    public void setProducts(ArrayList<Integer> products) {
        Products = products;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }
    
}
