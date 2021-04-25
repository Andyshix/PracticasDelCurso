
/**
 * Write a description of class CajaMusica here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class CajaMusica
{
    private PiedraHelitz[] canciones;
    private int posLibre;
    public CajaMusica(int tam){
        canciones = new PiedraHelitz[tam];
        posLibre  = 0;
    }

    public String agregarCancion(PiedraHelitz nuevo){
        String res;
        if(posLibre<canciones.length){
            canciones[posLibre]=nuevo;
            posLibre++;
            res = "La cancion ha sido agregada exitosamente";
        }else{
            res = "Ya no hay espacio en la Caja Musical";
        }
        return res;
    }

    public String eliminarCancion(String tituloCancion){
        String res      = "";
        boolean bandera = false;
        for(int i=0;i<canciones.length && bandera==false;i++){
            if(canciones[i]!=null){
                PiedraHelitz actual = canciones[i];
                String tituloActual = actual.getTitulo();
                if(tituloCancion.equals(tituloActual)){
                    bandera      = true;
                    canciones[i] = null;
                    reordenar(i);
                    res = "La cancion ha sido eliminada";
                }else{
                    res = "No existe una cancion con ese titulo";
                }
            }else{
                res     = "La caja musical esta vacia";
                bandera = true;
            }
        }
        return res;
    }
    private void reordenar(int ini){
        for(int i=ini;i<posLibre-1;i++){
            canciones[i] = canciones[i+1];
        }
        canciones[posLibre-1]=null;
        posLibre--;
    }

    public String reemplazarCancion(PiedraHelitz cancion, int pos){
        String res;
        if(pos>=0&&pos<canciones.length){
            if(canciones[pos]!=null){
                PiedraHelitz cancionRem = canciones[pos];
                String tituloCancionNew = cancion.getTitulo();
                String autorCancionNew  = cancion.getAutor();
                cancionRem.setTitulo(tituloCancionNew);
                cancionRem.setAutor(autorCancionNew);
                res = "La cancion ha sido reemplazada con exito";
            }else{
                res = "La posicion ingresada esta vacia no hay cancion que reemplazar, el reemplazo no se realizo";
            }
        }else{
            res = "La posicion indicada no es valida";
        }
        return res;
    }

    public void ordenarCancionesPorArtista(){
        for(int i=1;i<canciones.length;i++){
            for(int pos=0;pos<=canciones.length-1-i;pos++){
                PiedraHelitz actual         = canciones[pos];
                PiedraHelitz vecino         = canciones[pos+1];
                String artistaCancionActual = actual.getAutor();
                String artistaCancionVecino = vecino.getAutor();
                if(artistaCancionActual.compareTo(artistaCancionVecino)>0){
                    PiedraHelitz aux = actual.obtenerCopia();
                    canciones[pos]   = vecino.obtenerCopia();
                    canciones[pos+1] = aux;
                }
            }
        }

    }

    public void ordenarCancionesPorTitulo(){

        for(int i=1;i<canciones.length;i++){
            for(int pos=0;pos<=canciones.length-1-i;pos++){
                PiedraHelitz actual        = canciones[pos];
                PiedraHelitz vecino        = canciones[pos+1];
                String tituloCancionActual = actual.getTitulo();
                String tituloCancionVecino = vecino.getTitulo();
                if(tituloCancionActual.compareTo(tituloCancionVecino)>0){
                    PiedraHelitz aux = actual.obtenerCopia();
                    canciones[pos]   = vecino.obtenerCopia();
                    canciones[pos+1] = aux;
                }
            }
        }
    }
}