
/**
 * Write a description of class Taberna here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Taberna
{
    private Dream[] memoria;
    private int posLibre;
    public Taberna(int tam){
        memoria  = new Dream[tam];
        posLibre = 0;
    }

    public String buscarDream(String nombreDream){
        String res      = "El dream no existe";
        boolean bandera = false;
        for(int i=0;i<memoria.length&&bandera==false;i++){
            Dream nuevo        = memoria[i];
            String nombreNuevo = nuevo.getNombre();
            if(nuevo!=null){
                if(nombreDream.equals(nombreNuevo)){
                    res     = "El dream existe en la posicion: "+i;
                    bandera = true;
                }
            }
        }
        return res;
    }

    public String almacenarDream(Dream nuevo){
        String res;
        if(posLibre<memoria.length){
            memoria[posLibre] = nuevo;
            buscarPosicionLibre();
            res = "Se guardo el elemento exitosamente";
        }else{
            res = "No ha sido posible almacenarlo, la memoria esta llena";
        }
        return res;
    }

    public String eliminarDream(int pos){
        String res;
        if(pos>=0 && pos<memoria.length){
            if(memoria[pos]!=null){
                memoria[pos] = null;
                buscarPosicionLibre();
                res = "Dato eliminado";
            }else{
                res = "El espacio indicado esta vacio";
            }
        }else{
            res = "La posicion indicada no existe";
        }
        return res;
    }

    private void buscarPosicionLibre(){
        boolean bandera  = false;
        for(int pos=0;pos<memoria.length&&bandera==false;pos++){
            Dream actual = memoria[pos];
            if(actual == null){
                posLibre = pos;
                bandera  = true;
            }
        }
        if(bandera==false){
            posLibre = memoria.length;
        }
    }

    public String generarReporte(){
        String res = "";
        for(int pos=0;pos<memoria.length;pos++){
            Dream aux = memoria[pos];
            if(aux != null){
                String nombre = aux.getNombre();
                String desc   = aux.getDescripcion();
                res           = res+nombre+" "+desc+"\n";
            }
        }
        System.out.println(res);
        return res;
    }
}