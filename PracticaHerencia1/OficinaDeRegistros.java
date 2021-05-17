import java.util.ArrayList;
/**
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class OficinaDeRegistros
{
    private ArrayList<Identificacion> listaId;
    
    public OficinaDeRegistros(){
        listaId = new ArrayList<>();
    }

    public void emitirIdentificacion(Identificacion identActual){
        listaId.add(identActual);
    }

    public String contadorDeIdentificaciones(){
        String res = "";
        int cantIdentMagna   = 0;
        int cantIdentTurista = 0;
        int cantIdentClasica = 0;
        for(Identificacion i: listaId){
            if(i instanceof IdentificacionMagna){
                cantIdentMagna++;
            }else if(i instanceof IdentificacionTurista){
                cantIdentTurista++;
            }else if(i instanceof IdentificacionClasica){
                cantIdentClasica++;
            }
        }
        res = "Existe(n): "+cantIdentMagna+ " identificacion(es) Magna "+"\n"+"Existe(n): "+cantIdentTurista+ " identificacion(es) Turista "+"\n"+
        "Existe(n): "+cantIdentMagna+ " identificacion(es) Magna" ;
        System.out.println(res);
        return res;
    }
}
