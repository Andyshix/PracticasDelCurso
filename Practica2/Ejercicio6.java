
/**
 * Write a description of class Ejemplo6 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio6
{
   public String obtenerOrden (int A,int B,int C){
       String resp;
       int x = A;
       A = B;
       B = x;
       int y = A;
       A = C;
       C = y;
       resp = A+" " + B +" "+ C;
       return resp;
    }
}
