/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista;

import java.util.ArrayList;

/**
 *
 * @author PJ129
 */
public class Usuario {

    private String userName;
    private ArrayList<Carrito> userCart;

    public Usuario(String userName) {
        this.userName = userName;
        this.userCart = new ArrayList<Carrito>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public ArrayList<Carrito> getUserCart() {
        return userCart;
    }

    public void setUserCart(ArrayList<Carrito> userCart) {
        this.userCart = userCart;
    }

}
