
/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio5
{
   public String calcularParentesco(int A,int B){
       String res;
       if(A%B == 0){
           res = "son parientes";
       }else {
           if(B%A == 0){
               res = "son parientes";
           }else{
               res = "no son parientes";
           }
       }
       return res;
   }
}
