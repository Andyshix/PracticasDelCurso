
/**
 * Write a description of class Ejercicio2 here.
 * 
 * @author (andrea) 
 * @version (30/03/2020)
 */
public class Ejercicio2
{
     public int sumaMenor(int a,int b,int c){
        int res;
        int sum1 = a + b;
        int sum2 = b + c;
        int sum3 = a + c;
        if (sum1 < sum2){
            if(sum1 < sum3){
                res = sum1;
            }else{
                res = sum3;
            }
        }else{
             if (sum2 < sum3) {
                res = sum2;
             }else {
                res = sum3;
            }
        }
        return res;
     }
}
