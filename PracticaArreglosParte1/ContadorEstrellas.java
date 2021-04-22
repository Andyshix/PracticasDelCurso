
/**
 * Write a description of class ContadorEstrellas here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class ContadorEstrellas
{
    public String contadorStars(int [] arreglo,int ini, int fin){
        String res;
        int contador=0;

        if(ini>=0 && fin<arreglo.length){
            for(int i=ini;i<=fin;i++){
                if(arreglo[i]==0){
                    contador++;
                }
            }
            res = "Hay "+contador+" estrella(s) que han dejado de brillar";
        }else{
            res = "Hay un parametro que no es valido";
        }
        return res;
    }
}
