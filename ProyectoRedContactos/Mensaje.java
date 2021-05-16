
/**
 * Write a description of class Mensaje here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Mensaje
{
    private int remitente;
    private int destinatario;
    private String estado;
    private String contenido;
    public Mensaje(int remitente, int destinatario,String contenido){
        this.remitente    = remitente;
        this.destinatario = destinatario;
        this.contenido    = contenido;
        estado            = "Enviado";
    }
    public int getRemitente(){
        return remitente;
    }
    public int getDestinatario(){
        return destinatario;
    }
    public String getContenido(){
        return contenido;
    }
    public String getEstado(){
        return estado;
    }
    public void setEstado(String esta){
        estado =esta;
    }
}
