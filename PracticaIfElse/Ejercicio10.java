
/**
 * Write a description of class Ejercicio10 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio10
{
    public String hallarCrece (int num){
        String res;
        int primerDig  =num/100;
        int segundoDig =(num/10)%10;
        int tercerDig  =num%10;
        if(primerDig <= segundoDig){
            if(segundoDig<=tercerDig){
                res = "Es un numero en crecimiento";
            }else{
                res = "No es un numero en crecimiento";
            }
        }else{
            res = "No es un numero en crecimiento";
        }
        return res;
    }
}
