
/**
 * Write a description of class Ejercicio10 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio10
{
    public String verificarMalvOdioso(int num){
        String res;
        int numBinario = hallarNumBinario(num);
        int cont=0;
        while(numBinario>0){
            int resto = numBinario%10;
            if (resto==1){
                cont++;
                numBinario /= 10;
            }else if (resto==0){
                numBinario /= 10;
            }
        }
        if(cont%2==0){
            res = "Malvado";
        }else{
            res = "Odioso";
        }
        return res;
    }
    
    private int hallarNumBinario(int num){
        int res = 0;
        for(int x=0;num>0;x++){
            int residuo = num%2;
            res = res + residuo* (int)Math.pow(10,x);
            num /=2;
        }
        return res;
    }
}
