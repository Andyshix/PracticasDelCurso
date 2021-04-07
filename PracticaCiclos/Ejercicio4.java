
/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio4
{
    public int calcularFactorial(int num){
        int factorial = 1;
        while (num>0){
            factorial = factorial * num;
            num = num-1;
            
        }
        return factorial;
    }
}
