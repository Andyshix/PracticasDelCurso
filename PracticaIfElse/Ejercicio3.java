
/**
 * Write a description of class Ejercicio3 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio3
{
    public String tipoDeDia (int dia){
        String res;
        int primerDig  = dia / 10;
        int segundoDig = dia % 10;
        if (primerDig % 2 == 0){
            if (segundoDig % 2 == 1){
                res = "Cruz de Dariel";
            }else{
                res = "Dia Normal";
            }
            
        }else{
            if (segundoDig % 2 ==0){
                res = "Cruz de Dariel";
            }else{
                res = "Dia Normal";
            }
        }
        return res;
    }
}
