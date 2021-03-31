
/**
 * Write a description of class Ejercicio9 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio9
{
    public String hallarBisiesto(int año){
        String res;
        if (año%400==0){
            res = "Es bisiesto";
        }else{
            if(año%100==0){
                res = "No es bisiesto";
            }else {
                if (año%4==0){
                    res = "Si es bisiesto";
                }else{
                    res = "No es bisiesto";
                }
            }
    
        }
        return res;
    }
}