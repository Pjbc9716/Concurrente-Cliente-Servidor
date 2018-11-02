
package lista;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author PJ129
 */
public class Amazon {

    private ArrayList<Usuario> userList = new ArrayList<Usuario>();
    private ArrayList<Inventario> stockList = new ArrayList<Inventario>();
// inventario para llenar el carrito del cliente.
    public void fillStock() {
        for (int i = 1; i <= 10; i++) {
            String code = "P00" + i;
            switch (i) {
                case 1:
                    this.stockList.add(new Inventario(code, "Camisa", 1000));
                    break;
                case 2:
                    this.stockList.add(new Inventario(code, "Jeans", 1500));
                    break;
                case 3:
                    this.stockList.add(new Inventario(code, "Sweater", 1700));
                    break;
                case 4:
                    this.stockList.add(new Inventario(code, "Zapatos", 2000));
                    break;
                case 5:
                    this.stockList.add(new Inventario(code, "Kindle ", 1200));
                    break;
                case 6:
                    this.stockList.add(new Inventario(code, "Medias", 500));
                    break;
                case 7:
                    this.stockList.add(new Inventario(code, "Gorra", 700));
                    break;
                case 8:
                    this.stockList.add(new Inventario(code, "Underwear", 600));
                    break;
                case 9:
                    this.stockList.add(new Inventario(code, "Camisa de Vestir", 1700));
                    break;
                case 10:
                    this.stockList.add(new Inventario(code, "Tenis", 1500));
                    break;
            }
        }
        fillCustomerList();
    }
//Crea cliente
    public void createUserCart(String customerName) {
        for (int i = 0; i < this.stockList.size(); i++) {
            this.userList.get(this.getUserIndex(customerName)).getUserCart().add(new Carrito(this.stockList.get(i).getCodigo(), 0));
        }
        this.fillCart(customerName);
    }
// llena la lista del cliente
    public void fillCustomerList() {
        this.userList.add(new Usuario("Pablo"));
        for (int i = 0; i < this.stockList.size(); i++) {
            this.userList.get(this.getUserIndex("Pablo")).getUserCart().add(new Carrito(this.stockList.get(i).getCodigo(), 0));
        }
        signIn();
    }
// log in para el cliente
    public void signIn() {
        String customerName = JOptionPane.showInputDialog("Bienvenido\nIngrese el nombre del cliente\nPresione 2 para imprimir la informacion");
        if (customerName.equals("2")) {
            this.printInfo();

        } else {
            for (int i = 0; i < this.userList.size(); i++) {
                if (this.userList.get(i).getUserName().equals(customerName)) {
                    fillCart(customerName);
                    break;
                }
                if (i == this.userList.size() - 1) {
                    addCustomer(customerName);
                    break;
                }
            }
        }
    }
//Agrega cliente
    public void addCustomer(String customerName) {
        this.userList.add(new Usuario(customerName));
        this.createUserCart(customerName);
    }

    public int getUserIndex(String userName) {
        int customerPosition = -1;
        for (int i = 0; i < this.userList.size(); i++) {
            if (this.userList.get(i).getUserName().equals(userName)) {
                customerPosition = i;
            }
        }
        return customerPosition;
    }
//Agregamos los productos al carrito
    public void fillCart(String customerName) {
        boolean keepBuying = true;
        while (keepBuying) {
            int product = Integer.parseInt(JOptionPane.showInputDialog("Hola " + customerName + "\nSeleccione el producto\n1." + this.stockList.get(0).getProduct()
                    + "\n2." + this.stockList.get(1).getProduct() + "\n3." + this.stockList.get(2).getProduct() + "\n4." + this.stockList.get(3).getProduct()
                    + "\n5." + this.stockList.get(4).getProduct() + "\n6." + this.stockList.get(5).getProduct() + "\n7." + this.stockList.get(6).getProduct()
                    + "\n8." + this.stockList.get(7).getProduct() + "\n9." + this.stockList.get(8).getProduct() + "\n10." + this.stockList.get(9).getProduct()));
            int quantity = Integer.parseInt(JOptionPane.showInputDialog("Cantidad de " + this.stockList.get(product - 1).getProduct()));
            this.userList.get(this.getUserIndex(customerName)).getUserCart().get(product - 1).setQuantity(quantity);
            int option = Integer.parseInt(JOptionPane.showInputDialog("1.Seguir comprando\n2.Salir"));
            if (option == 2) {
                keepBuying = false;
                this.signIn();
            }
        }
    }
// imprime todo lo que el cliente lleva en el carrito
    public void printInfo() {
        System.out.println("Compras por cliente");
        for (int i = 0; i < this.userList.size(); i++) {
            System.out.println("___Factura del cliente " + this.userList.get(i).getUserName() + "____\n");
            for (int j = 0; j < this.stockList.size(); j++) {
                if (this.stockList.get(j).getCodigo().equals(this.userList.get(i).getUserCart().get(j).getProduct()) && this.userList.get(i).getUserCart().get(j).getQuantity() > 0) {
                    System.out.println("Producto: " + this.stockList.get(j).getProduct() + "->Cantidad: " + this.userList.get(i).getUserCart().get(j).getQuantity());
                }
            }
            System.out.print("\n__________________________________\n");
        }
    }
}

