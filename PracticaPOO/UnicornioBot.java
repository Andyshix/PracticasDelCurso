
/**
 * Write a description of class UnicornioBot here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class UnicornioBot
{
    private String nombreUsuario;
    public UnicornioBot(String nombre){
        nombreUsuario = nombre;
    }
    public String saludar(){
        return "Hola "+nombreUsuario;
    }
    public void setNombreUsuario(String nombre){
        nombreUsuario = nombre;
    }
    public String getNombreUsuario(){
        return nombreUsuario;
    }
}
