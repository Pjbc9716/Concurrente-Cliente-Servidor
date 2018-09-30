package ejercicio;

  //clase tipo: enum
public enum Levantado {
    PC(150,0), MP(100,0);
    //variables costo y cantidad
    private final double cost;
    private int cant;
//cosntructor con parámetros
    private Levantado(double cost, int cant) {
        this.cost = cost;
        this.cant = cant;
    }
    //método set para pasarle la cantidad
    public void setCant (int cant){
        this.cant = cant;
    }
    //método get costo
    public double getCost() {
        if (cant <500) {//si es menor a 500
            if (this == PC) {
                return this.cost * cant; //precio de PC por cantidad
            } else if (this == MP) {
                return this.cost * cant;//precio de MP por cantidad
            } else {
                return 0;
            }
        } else if (cant >= 500) {// sino si cantidad es mayor o igual 
            if (this == PC) {
                return ((this.cost * cant) - (130 * cant));// precio por cantidad menos la cantidad de paginas por 130
            } else if (this == MP) {
                return ((this.cost * cant) - (130 * cant));
            } else {
                return 0;
            }
        }else{
            return 0;
        }
    }

}
