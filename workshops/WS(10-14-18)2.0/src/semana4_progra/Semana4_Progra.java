package semana4_progra;
/**
 *
 * @author Denis Ugalde Meza
 */
public class Semana4_Progra {
    /**
    * @param args the command line arguments
    */
    public static void main(String[] args) {
        
        Circulo circulo = new Circulo(5);
        Triangulo triangulo = new Triangulo(6, 4);
        Cuadrado cuadrado = new Cuadrado(3);
        Rombo rombo = new Rombo(6, 4);
        Rectangulo rectangulo = new Rectangulo(6, 3);
        
        System.out.println(circulo.toString()+ circulo.calcular());
        System.out.println(triangulo.toString()+ triangulo.calcular());
        System.out.println(cuadrado.toString()+ cuadrado.calcular());
        System.out.println(rombo.toString()+ rombo.calcular());
        System.out.println(rectangulo.toString()+ rectangulo.calcular());
        
    }
    
}
