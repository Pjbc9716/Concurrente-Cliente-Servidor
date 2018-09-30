package ejercicio;


public enum DisenoGrafico {
    Diseno (20000,0,"");//de tipo num con diferentes parámetros
    //variables costo, horas, tipo
    private final double cost;
    private int hour;
    private String type;
    //cosntructor con parámetros
    private DisenoGrafico(double cost, int hour, String type) {
        this.cost = cost;
        this.hour = hour;
        this.type = type;
    }
    //método set con parámetros con horas y tipo
    public void setInfo (int hour, String type){
        this.hour = hour;
        this.type = type;
    }
    //método get 
    public double getCost ( ){
        if (type.equals("Nuevo")){ // si el tipo es igual a nuevo
            return this.cost*hour; //multiplica costo por horas
        }else if (type.equals("Usado")){//si el tipo es igual a usado 
            return (this.cost*hour-(5000*hour));//mutiplica costopor horas menos 5000 multiplicado por la cantidad de horas
        }else{
            return 0;
        }
        
    }
    
    
}
