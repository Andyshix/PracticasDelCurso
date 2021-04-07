
/**
 * Write a description of class Ejercicio14 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio14
{
    public String verificarANovios(int A,int B){
       String res;
       int sumaA=sumarDivisores(A)-1;
       int sumaB=sumarDivisores(B)-1;
       if (sumaA==B){
           if (sumaB==A){
               res = "Son novios";
           }else{
               res = "NO son nada";
           }
       }else{
           res = "NO son nada";
       }
       return res;  
   }
   
   private int sumarDivisores(int num){
        int suma=0;
        for(int div=1;div<=(num/2);div++){
            if(num%div==0){
                suma = suma + div;
            }
        }
        return suma;
    }
}

