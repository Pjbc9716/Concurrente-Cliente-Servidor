package ejercicio;


 //clase tipo: enum
public enum Fotocopia {
    FBN(10,0), FC(15,0);
    //variables costo y cantidad
    private final double cost;
    private int cant;
    //cosntructor con parámetros
    private Fotocopia(double cost, int cant) {
        this.cost = cost;
        this.cant = cant;
    }
//método set para pasarle la cantidad
    public void setCost(int cant){
        this.cant= cant;
    }

    public double getCost() {
        if (this == FBN) {
            return this.cost * cant;//multiplica precio por cantidad
        } else if (this == FC) {
            return this.cost * cant;//multiplica el precio por cantidad
        } else {
            return 0;
        }
    }

}
