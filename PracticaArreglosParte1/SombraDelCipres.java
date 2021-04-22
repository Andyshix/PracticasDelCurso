
/**
 * Write a description of class SombraDelCipres here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class SombraDelCipres
{
    public int[] calcularProyeccionSombra(int sombraActual,int horas){
        int[] arreglo = new int[horas];
        arreglo[0] = sombraActual;
        int aux=1;
        for(int i=1;i<horas;i++){
            if(sombraActual%2==0){
                arreglo[i]   = sombraActual/2;
                sombraActual = arreglo[i];
            }else{
                arreglo[i]   = sombraActual+aux;
                sombraActual = arreglo[i];
                aux++;
            }
        }
        return arreglo;
    }
}
