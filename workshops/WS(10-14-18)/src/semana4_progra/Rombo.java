package semana4_progra;
/**
 *
 * @author Denis Ugalde Meza
 */
public class Rombo {
    private double diagonalMenor;
    private double diagonalMayor;
    
    public Rombo(double diagonalMenor, double diagonalMayor) {
        this.diagonalMenor = diagonalMenor;
        this.diagonalMayor = diagonalMayor;
    }
    
        public double calcular(){
        return (diagonalMenor*diagonalMayor)/2;
    }
    
    public String elemento(){
        return "El área del rombo es: ";
    }
}
    

