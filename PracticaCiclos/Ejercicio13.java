
/**
 * Write a description of class Ejercicio13 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio13
{
   public String verificarAmistad(int A,int B){
       String res;
       int sumaA=sumarDivisores(A);
       int sumaB=sumarDivisores(B);
       if (sumaA==B){
           if (sumaB==A){
               res = "Son amigos";
           }else{
               res = "NO son amigos";
           }
       }else{
           res = "NO son amigos";
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
