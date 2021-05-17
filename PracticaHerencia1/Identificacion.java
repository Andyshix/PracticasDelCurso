
/**
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Identificacion
{
    private String propietario;
    private int edad;
    private int codigo;

    public Identificacion(String propietario,int edad,int codigo){
        this.propietario = propietario;
        this.edad        = edad;
        this.codigo      = codigo;
    }
    
    public String getPropietario(){
        return propietario;
    }
    public int getEdad(){
        return edad;
    }
    public int getCodigo(){
        return codigo;
    }
    public void setPropietario(String valorProp){
        propietario = valorProp;
    }
    public void setEdad(int valorEdad){
        edad = valorEdad;
    }
    public void setCodigo(int valorCodigo){
        codigo = valorCodigo;
    }
}