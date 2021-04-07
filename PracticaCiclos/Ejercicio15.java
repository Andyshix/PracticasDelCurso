
/**
 * Write a description of class Ejercicio15 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio15
{
    public String evaluarUnicornios(int num){
        String res;
        int dig=calDigitos(num);
        int corazon=0;
        if(dig%2==0){
            
            for(int i=0;i<((dig/2)-1);i++){
                num /=10;
            }
            corazon = num%100;
        }else{
            for(int i=0;i<(dig/2);i++){
                corazon = num/10;
                num /= 10;
            }
            corazon = corazon%10;
        }
        if (corazon%3==0){
            res = "Numero Unicornio";
        }else{
            res = "Numero Normal";
        }
        return res;
    } 

    private int calDigitos(int n){
        int cont=1;
        while(n>=10){
            n = n/10;
            cont++;
        }
        return cont;
    }
}
