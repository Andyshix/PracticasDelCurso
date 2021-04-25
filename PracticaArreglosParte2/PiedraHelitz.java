
/**
 * Write a description of class PiedraHelitz here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class PiedraHelitz
{
    private String tituloCancion;
    private String autorCancion;
    public PiedraHelitz(String titulo,String autor){
        tituloCancion = titulo;
        autorCancion  = autor;
    }

    public void setTitulo(String titulo){
        tituloCancion = titulo;
    }

    public void setAutor(String autor){
        autorCancion = autor;
    }

    public String getTitulo(){
        return tituloCancion;
    }

    public String getAutor(){
        return autorCancion;
    }

    public PiedraHelitz obtenerCopia(){
        PiedraHelitz copia = new PiedraHelitz(tituloCancion,autorCancion);
        return copia;
    }
}
