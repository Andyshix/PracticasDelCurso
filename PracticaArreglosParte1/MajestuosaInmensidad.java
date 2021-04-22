
/**
 * Write a description of class MajestuosaInmensidad here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class MajestuosaInmensidad
{
   public int[] ordenarLuminosidad(int[] arreglo){
       int[] res;
       int[] arregloOrd = ordenamientoBurbuja(arreglo);
       int cantNumPar = calNumPares(arregloOrd);
       for(int i = 0;i<arregloOrd.length-cantNumPar;i++){
           if(arregloOrd[i]%2==0){
               int aux = arregloOrd[i];
               arregloOrd[i]=0;
               reordenar(i,arregloOrd);
               arregloOrd[arregloOrd.length-1]=aux;
           }
       }
       int a = arregloOrd.length-cantNumPar;
       int x = 1;
       for(int i=a;i<arregloOrd.length-1;i++){
            for(int j=a;j<=arregloOrd.length-1-x;j++){
                if(arreglo[j]<arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
            x++;
        }
       return res = arregloOrd;
    }
    private int calNumPares(int [] arreglo){
        int res = 0;
        for(int i=0;i<arreglo.length;i++){
            if(arreglo[i]%2==0){
                res++;
            }
        }
        return res;
    }
    private int[] ordenamientoBurbuja(int []arreglo){
       int [] res;
       for(int i=1;i<arreglo.length-1;i++){
            for(int j=0;j<=arreglo.length-1-i;j++){
                if(arreglo[j]>arreglo[j+1]){
                    int aux = arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
       return res = arreglo;
    }
    private void reordenar(int ini,int[] arreglo){
        for(int i=ini;i<arreglo.length-1;i++){
            arreglo[i] = arreglo[i+1];
        }
    }
}
