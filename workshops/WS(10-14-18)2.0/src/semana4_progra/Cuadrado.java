package semana4_progra;

public class Cuadrado {
    //En la línea 6 se crea el atributo lado, el cual se va a utilizar para realizar el calculo del área del cuadrado.
    //Se crea de tipo double para que retorne el número con decimales.
    private double lado;
    //En la línea 8 se encuentra el constructor de la clase para poder inicializar el atributo
    public Cuadrado(double lado) {
        this.lado = lado;
    }
    //En la línea 12 se crea el método calcular, en este método se encuentra la operación que se encargara de calcular el área del cuadrado.
    public double calcular(){
        //En la línea 14 se encuentra la operación matemática con la que se calcula el área del cuadrado.
        return lado * lado;
    }
    //En la línea 18 se imprime el texto que va con la respectiva área por medio de un toString.
    @Override
    public String toString() {
        return "El área del cuadrado es: ";
    }
}

