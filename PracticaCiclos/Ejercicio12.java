
/**
 * Write a description of class Ejercicio12 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio12
{
    public int calcularDivision(int num1,int num2){
        int res=0;
        while(num1>=num2){
            num1 = num1-num2; 
            res++;
        }
        return res;
    }
}
