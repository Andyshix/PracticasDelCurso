
/**
 * Write a description of class Ejercicio6 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio6
{
    public String definirNumero(int num){
        String res;
        int aux=0;
        for(int div=1;div<=(num/2);div++){
            if(num%div==0){
                aux = aux + div;
            }
        }
        if(aux==num){
            res = "Numero Perfecto";
        }else if(aux>num){
            res = "Numero Abundante";
        }else{
            res = "Numero Defectivo";
        }
        return res;
    }
}
