
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (andrea) 
 * @version (1.0)
 */
public class Ejercicio1
{
    public String esCapicuo(int numero){
        int ultimoDig = numero % 10;
        int primerDig = numero / 100;
        String res;
        if (primerDig == ultimoDig){
            res = "Si";
        }else{
            res = "No";
        }
        return res;
    }
}
