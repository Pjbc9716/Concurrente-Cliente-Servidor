package semana4_progra;

public class Triangulo {
    //En la línea 6 y 7 se crean los atributos base y altura, los cuales se van a utilizar para realizar el calculo del área del triángulo.
    //Se crea de tipo double para que retorne el número con decimales.
    private double base;
    private double altura;
    
    //En la línea 10 se encuentra el constructor de la clase para poder inicializar los atributos.
    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    //En la línea 15 se crea el método calcular, en este método se encuentra la operación que se encargara de calcular el área del triángulo.
    public double calcular(){
        //En la línea 17 se encuentra la operación matemática con la que se calcula el área del triángulo.
        return (base * altura)/2;
    }
    //En la línea 21 se imprime el texto que va con la respectiva área por medio de un toString.
    @Override
    public String toString() {
        return "El área del triángulo es: ";
    }
    
    
    
}
    

