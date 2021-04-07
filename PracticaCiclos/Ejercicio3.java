
/**
 * Write a description of class Ejercicio3 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio3
{
    public int calcularInverso(int num){
        int inverso = 0;
        int modulo;
        while(num>0){
            modulo  = num%10;
            inverso = inverso*10+modulo;
            num     = num/10;
        }
        return inverso;
    }
}
