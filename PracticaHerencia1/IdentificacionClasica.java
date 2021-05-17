
/**
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class IdentificacionClasica extends Identificacion
{
    private String direccionVivienda;
    private String direccionTrabajo;
    private int contadorDeUsos;
    private int puntos;
    public IdentificacionClasica(String propietario,int edad,int codigo,String direccionVivienda,String direccionTrabajo){
        super(propietario,edad,codigo);
        this.direccionVivienda = direccionVivienda;
        this.direccionTrabajo  = direccionTrabajo;
        contadorDeUsos         = 0;
        puntos                 = 0;
    }
    public String getDireccionVivienda(){
        return direccionVivienda;
    }
    public String getDireccionTrabajo(){
        return direccionTrabajo;
    }
    public int getContadorDeUsos(){
        return contadorDeUsos;
    }
    public int getPuntos(){
        return puntos;
    }
}
