
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio2
{
        public String verificarPrimo(int n){
            String res;
            boolean bandera = true;
            for(int div=2;div<=(n/2) && bandera==true ;div++){
               if (n%div==0){
                   bandera = false;
               }
            
            }
            if(bandera == true){
                res = "Es un numero Primo";
            }else{
                res = "Es un numero Compuesto";
            }
            return res;
        }
}
