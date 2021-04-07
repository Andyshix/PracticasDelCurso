
/**
 * Write a description of class Ejercicio8 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio8
{
    public int hallarNumCambio(int num){
        int res;
        int ultDig = num%10;
        int primerDig;
        while(num>9){
            num /=10;
        }
        primerDig = num;
        res = ultDig*10 + primerDig;
        return res;
    }
}
