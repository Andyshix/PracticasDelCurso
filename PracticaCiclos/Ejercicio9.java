
/**
 * Write a description of class Ejercicio9 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio9
{
    public int hallarNumBinario(int num){
        int res = 0;
        for(int x=0;num>0;x++){
            int residuo = num%2;
            res = res + residuo* (int)Math.pow(10,x);
            num /=2;
        }
        return res;
    }
}
