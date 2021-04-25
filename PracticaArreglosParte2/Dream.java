
/**
 * Write a description of class Dream here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Dream
{
    private String nombre;
    private String descripcion;
    public Dream(String valNombre, String valDesc){
        nombre      = valNombre;
        descripcion = valDesc;
    }
    public String getNombre(){
        return nombre;
    }
    public String getDescripcion(){
        return descripcion;
    }
}