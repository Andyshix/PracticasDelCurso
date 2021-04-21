
/**
 * Write a description of class RitmoCornio here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class RitmoCornio
{
    private String cancion1;
    private String cancion2;
    private String cancion3;
    private String estado;
    private String cancionActual;
    public RitmoCornio(String cancion1,String cancion2,String cancion3){
        this.cancion1 = cancion1;
        this.cancion2 = cancion2;
        this.cancion3 = cancion3;
        estado = "en pausa";
        cancionActual = cancion1;
    }
    
    public String reproducirCancion(){
        String res;
        if(estado.equals("en pausa")){
            res = "La cancion ha empezado a sonar";
            estado = "reproduciendo";
        }else{
            res = "Ya esta sonando la cancion";
        }
        return res;
    }
    public String pausarCancion(){
        String res;
        if(estado.equals("reproduciendo")){
            res = "La cancion ha sido pausada";
            estado = "en pausa";
        }else{
            res = "La cancion ya se encuentra en pausa";
        }
        return res;
    }
    public void cambiarCancion(){
        if(cancionActual.equals(cancion1)){
            cancionActual = cancion2;
        }else if(cancionActual.equals(cancion2)){
            cancionActual = cancion3;
        }else{
            cancionActual = cancion1;
        }
        estado ="reproduciendo";
    } 
    public String getCancionActual(){
        return cancionActual;
    }
}
