
/**
 * Write a description of class Ejercicio5 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio5
{
    public int calcularAcarreos(int numA,int numB){
        int acarreos = 0 ;
        int aux = 0;
        while(numA>0||numB>0){
            int ultA = numA%10;
            int ultB = numB%10;
            int suma = ultA + ultB + aux;
            if(suma>9){
                acarreos++;
                aux = 1;
            }else{
            }
            numA = numA/10;
            numB = numB/10;
        }
        return acarreos;
    }

}
