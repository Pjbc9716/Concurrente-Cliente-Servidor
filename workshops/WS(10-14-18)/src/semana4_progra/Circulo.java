package semana4_progra;
/**
 *
 * @author Denis Ugalde Meza
 */
public class Circulo {
    //En la línea 8 se crea el atributo radio, el cual se va a utilizar para realizar el calculo del área del circulo.
    //Se crea de tipo double para que retorne el número con decimales.
    private double radio;
    //En la línea 10 se encuentra el constructor de la clase para poder inicializar el atributo
    public Circulo(double radio) {
        this.radio = radio;
    }
    //En la línea 14 se crea el método calcular, en este método se encuentra la operación que se encargara de calcular el área del circulo.
     public double calcular(){
    //En la línea 17 se encuentra la operación matemática con la que se calcula el área del circulo.
    //Se llama a la clase "Math" para poder utilizar en número "PI" y también la función "POW" para poder elevar el radio al cuadrado.
        return Math.PI*Math.pow(radio, 2);
    }
    public String elemento(){                           
        return "El área del circulo es: ";
    }
}

    
    

