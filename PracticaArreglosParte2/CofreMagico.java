
/**
 * Write a description of class CofreMagicoç here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class CofreMagico
{
    private DreamN[] cofre;
    private int posLibre;
    public CofreMagico(int tam){
        cofre    = new DreamN[tam];
        posLibre = 0;
    }

    public String guardarDream(DreamN nuevo){
        String res;
        if(posLibre<cofre.length){
            cofre[posLibre] = nuevo;
            posLibre++;
            res = "Se guardo el dream exitosamente";
        }else{
            res = "No ha sido posible almacenarlo, el cofre esta lleno";
        }
        return res;
    }

    public void ordenarDreamsPorPrioridad(){
        for(int i=0;i<cofre.length-1;i++){
            for(int pos=0;pos<cofre.length-1-i;pos++){
                DreamN actual       = cofre[pos];
                int prioridadActual = actual.getPrioridad();
                DreamN vecino       = cofre[pos+1];
                int prioridadVecino = vecino.getPrioridad();
                if(prioridadActual>prioridadVecino){
                    DreamN aux   = actual.obtenerCopia();
                    cofre[pos]   = vecino.obtenerCopia();
                    cofre[pos+1] = aux;
                }
            }
        }
    }

    public String cumplirPrimerDreamDelCofre(){
        String res;
        if(cofre[0]!= null){
            cofre[0] = null;
            reordenar(0);
            res      = "Se cumplio el primer dream de la lista";
        }else{
            res      = "El cofre magico esta vacio";
        }
        return res;
    }
    private void reordenar(int ini){
        for(int i=ini;i<posLibre-1;i++){
            cofre[i] = cofre[i+1];
        }
        cofre[posLibre-1] = null;
        posLibre--;
    }
    
    public String cumplirDreamDelCofre(String topico){
        String res      = "";
        boolean bandera = false;
        for(int i=0;i<cofre.length && bandera==false;i++){
            if(cofre[i]!=null){
                DreamN actual       = cofre[i];
                String topicoActual = actual.getTopico();
                if(topico.equals(topicoActual)){
                    bandera  = true;
                    cofre[i] = null;
                    reordenar(i);
                    res = "Se cumplio el primer dream con el topico: "+topico+" de la lista";
                }else{
                    res = "No existe una cancion con ese titulo";
                }
            }else{
                res     = "El cofre magico esta vacio";
                bandera = true;
            }
        }
        return res;
    }
}
