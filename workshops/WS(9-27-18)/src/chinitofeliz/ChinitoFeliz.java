/*
 Vamos a trabajar en una fábrica de comida congelada. 
La empresa vende dos tipos de productos un producto es burritos y otras pizzas. 
El sistema debe tener los ingredientes de cada uno de los productos (ustedes deben agregar los ingredientes). 
Luego vamos a tener dos tipos de clientes empresas y personas.
Los burritos tienen un precio de $2 y la pizza de $3
Todos los clientes deben pagar el 13% de impuestos.
Si el cliente es una empresa se les debe hacer un 5% de descuento en el total de la compra y
él envió se hace de manera gratuita.
La factura debe mostrar el costo total, la cantidad de productos que, del cliente, con su dirección, correo electrónico, número telefónico y número de fax.
Si el cliente es una persona no le vamos hacer descuento a menos que compre más de 200 unidades de los productos que 
vendemos. Si compra más de 200 unidades le vamos hacer un 3% de descuento.
La factura del cliente debe tener nombre, apellido del cliente, teléfono y correo electrónico. 
Además, un cobro de $30 por envió del producto.
El sistema debe tener una cantidad n de clientes y luego desplegar las facturas de todos los clientes.
 */
package chinitofeliz;

public class ChinitoFeliz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Admi admi = new Admi();//instanciamos
         //objetos con sus métodos 
         admi.addContact();
         admi.viewContact();
    }
    
}
