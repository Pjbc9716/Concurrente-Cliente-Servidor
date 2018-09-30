package ejercicio;

//clase tipo: enum
public enum Impresion {
    IBN(10,0), IC(15,0);
    //variables costo y cantidad
    private final double cost;
    private int cant;
    //cosntructor con parámetros
    private Impresion(double cost, int cant) {
        this.cost = cost;
        this.cant = cant;
    }
    //método set para pasarle la cantidad
    public void setCant (int cant){
        this.cant = cant;
    }
   //método get costo
    public double getCost() {
        if (this == IBN) {
            return this.cost * cant;
            //nos devuelve el precio DE BN multiplicado por la cantidad
        } else if (this == IC) {
            return this.cost * cant;
            //nos devuelve el precio de color multiplicado por la cantidad
        } else {
            return 0;
        }
    }
}
