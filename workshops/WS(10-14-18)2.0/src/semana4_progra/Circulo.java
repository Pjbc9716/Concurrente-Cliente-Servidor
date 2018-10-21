package semana4_progra;

public class Circulo {
    //En la línea 6 se crea el atributo radio, el cual se va a utilizar para realizar el calculo del área del circulo.
    //Se crea de tipo double para que retorne el número con decimales.
    private double radio;
    //En la línea 8 se encuentra el constructor de la clase para poder inicializar el atributo
    public Circulo(double radio) {
        this.radio = radio;
    }
    //En la línea 12 se crea el método calcular, en este método se encuentra la operación que se encargara de calcular el área del circulo.
     public double calcular(){
    //En la línea 15 se encuentra la operación matemática con la que se calcula el área del circulo.
    //Se llama a la clase "Math" para poder utilizar en número "PI" y también la función "POW" para poder elevar el radio al cuadrado.
        return Math.PI*Math.pow(radio, 2);
    }
    
    //En la línea 20 se imprime el texto que va con la respectiva área por medio de un toString.
    @Override
    public String toString() {
        return "El area es del circulo es: ";
    }
}



    
    

