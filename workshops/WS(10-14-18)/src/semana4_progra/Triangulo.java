package semana4_progra;
/**
 *
 * @author Denis Ugalde Meza
 */
public class Triangulo {
    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    
     public double calcular(){
        return (base * altura)/2;
    }
    
    public String elemento(){
        return "El área del triángulo es: ";
    }
}
    

