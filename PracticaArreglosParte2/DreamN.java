
/**
 * Write a description of class Dream1 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class DreamN
{
    private String topico;
    private String descripcion;
    private int prioridad;
    public DreamN(String topico,String descripcion,int prioridad){
        this.topico      = topico;
        this.descripcion = descripcion;
        this.prioridad   = prioridad;
    }
    
    public String getTopico(){
        return topico;
    }
    public String getDescripcion(){
        return descripcion;
    }
    public int getPrioridad(){
        return prioridad;
    }
    public DreamN obtenerCopia(){
        DreamN copia = new DreamN(topico,descripcion,prioridad);
        return copia;
    }
}
