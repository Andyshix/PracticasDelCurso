
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio1
{
    public int calDigitos(int num){
        int cont=1;
        while(num>=10){
            num = num/10;
            cont++;
        }
        return cont;
    }
    public int contDig(int n){
        int res=0;
        while(n>=1){
            n = n/10;
            res++;
        }
        return res;
    }
}
