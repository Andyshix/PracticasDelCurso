
/**
 * Write a description of class Ejercicio7 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio7
{
    public String verificarNarcisista(int num){
        String res;
        int potencia = calDigitos(num);
        int modulo;
        int com=num;
        int aux=0;
        while (num>0){
            modulo = num%10;
            aux = aux+ (int)Math.pow(modulo,potencia);
            num = num/10;
        }
        if (aux==com){
            res = "Narcisista";
        }else{
            res = "Normal";
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
