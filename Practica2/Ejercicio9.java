
/**
 * Write a description of class Ejemplo9 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio9
{
    public int cuantosPuedesSeguir(int seguidores, int siguiendo){
        int res;
        int total = 3 * seguidores;
        res = total - siguiendo;
        return res;
    }
}
