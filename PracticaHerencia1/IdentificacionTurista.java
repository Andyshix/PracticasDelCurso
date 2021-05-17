
/**
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class IdentificacionTurista extends Identificacion
{
    private String nacionalidad;
    private int vigencia; //dias no mas de 30 dias
    public IdentificacionTurista(String propietario,int edad,int codigo,String nacionalidad, int vigencia){
        super(propietario,edad,codigo);
        this.nacionalidad = nacionalidad;
        this.vigencia     = vigencia;
    }
    
    public String getNacionalidad(){
        return nacionalidad;
    }
    public int getVigencia(){
        return vigencia;
    }
}
