
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
    //Obtiene el nombre del usuario

    public String getUserName() {
        return userName;
    }
// asigna el nombre del usuario
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
