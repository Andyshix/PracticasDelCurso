
/**
 * Write a description of class Ejercicio4 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio4
{
    public String estadoSemaforo(String estadoSem, int nCambios ){
        String res = "";
        if(nCambios%3==0){
            res = estadoSem;
        }else if(nCambios%3==1){
            if(estadoSem.equals("verde")){
                estadoSem = "amarillo";
            }else if (estadoSem.equals("amarillo")){
                estadoSem = "rojo";
            }else{
                estadoSem = "verde";
            }
        }else if(nCambios%3==2){
            if(estadoSem.equals("verde")){
                estadoSem = "rojo";
            }else if (estadoSem.equals("amarillo")){
                estadoSem = "verde";
            }else {
                estadoSem = "amarillo";
            }
        }
        res = estadoSem;
        return res;
    }
    
    
}