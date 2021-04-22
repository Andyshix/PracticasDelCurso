
/**
 * Write a description of class Equilibrio here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Equilibrio
{ 
    public String hallarDesequilibrio(int [] arreglo){
        String res = "El numero de desequilibrio es:";
        boolean bandera = true;
        int mitad = arreglo.length/2;
        int ini = 0;
        int fin = arreglo.length;
        int aux = 0;
        while(ini<fin-1&&bandera==true){
            int sumaIzquierda = sumarArreglo(arreglo,ini,mitad);
            int sumaDerecha   = sumarArreglo(arreglo,mitad,fin);
            if(sumaIzquierda==sumaDerecha){
                res = "Ambas sumas son iguales no existe desequilibrio";
                bandera = false;
            }else if(sumaIzquierda>sumaDerecha){
                fin = mitad;
                mitad = (ini+fin)/2;
                aux = sumaIzquierda;
            }else{
                ini = mitad;
                mitad = (ini+fin)/2;
                aux = sumaDerecha;
            }
            res = res + aux;
        }
        
        return res;
    }

    private int sumarArreglo(int [] arr,int ini, int fin){
        int suma = 0;
        for(int i=ini;i<fin;i++){
            suma= suma + arr[i];
        }
        return suma;
    }
}
