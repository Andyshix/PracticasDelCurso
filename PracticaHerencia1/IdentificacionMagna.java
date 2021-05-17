
/**
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class IdentificacionMagna extends Identificacion
{
    private int contadorRegistro;
    private int descuento; // en porcentaje
    
    public IdentificacionMagna(String propietario,int edad,int codigo){
        super(propietario,edad,codigo);
        contadorRegistro = 0;
        descuento              = edad;
    }
    public int getContadorRegistro(){
        return contadorRegistro;
    }
    public int getDescuento(){
        return descuento;
    }
}
