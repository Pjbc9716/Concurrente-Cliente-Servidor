package ejercicio;


public enum CorreccionOrtografica {//clase de tipo enum
    CO(800, 0, ""); // con 3 paraémtros
    //variables 
    private final double cost;
    private double cant;
    private String type;
    // cosntructor con paármetros
    private CorreccionOrtografica(double cost, double cant, String type) {
        this.cost = cost;
        this.cant = cant;
        this.type = type;
    }
//método set con parámetros
    public void setInfo(double cant, String type) {
        this.cant = cant;
        this.type = type;
    }
//método get 
    public double getCost() {
        if (type.equals("Estudiante")) {// si es igual a estudiante
            return this.cost * cant - (cant * 150);//costo por cantidad menos cantidad por 150
        } else if (type.equals("Revista")) {//si es igual a estudiante
            return this.cost * cant + (cant * 100);//costo por cantidad más cantidad por 150
        } else if (type.equals("N/A")) {
            return this.cost * cant;//sino simplemente costo por cantidad
        } else {
            return 0;
        }
    }

}
