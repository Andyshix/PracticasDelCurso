
/**
 * Write a description of class UnicornisLibrumMemoriae here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class UnicornisLibrumMemoriae
{
    private String tareaActual;
    private boolean concluida;
    private int contador;
    public UnicornisLibrumMemoriae(String tareaActual){
        this.tareaActual = tareaActual;
        concluida = false;
        contador=1;
    }
    public void marcarTareaConcluida(){
        concluida = true;
    }
    public String agregarNuevaTarea(String tarea){
        String res;
        if(concluida==true){
            tareaActual = tarea;
            concluida   = false;
            res         ="Nueva Tarea Asignada";
            contador++;
        }else{
            res = "La tarea en curso aun no ha sido concluida";
        }
        return res;
    }
    public int getContador(){
        return contador;
    }
    public String getTareaActual(){
        return tareaActual;
    }
}
