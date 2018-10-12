package semana4_progra;
/**
 *
 * @author Denis Ugalde Meza
 */
public class Cuadrado {
    private double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    public double calcular(){
        return lado * lado;
    }
    
    public String elemento(){
        return "El área del cuadrado es: ";
    }
}
