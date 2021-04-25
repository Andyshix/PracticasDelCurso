
public class Mente
{
    private Recuerdo[] memoria;
    private int posLibre;
    public Mente(int tam){
        memoria  = new Recuerdo[tam];
        posLibre = 0;
    }
    public String agregarRecuerdo(Recuerdo nuevo){
        String res;
        if(posLibre<memoria.length){
            memoria[posLibre] = nuevo;
            posLibre++;
            res = "Recuerdo agregado exitosamente";
        }else{
            res = "No hay espacio en el array";
        }
        return res;
    }
    
    public String obtenerRecuerdoDeLuz(){
            String res;
            if(posLibre == memoria.length){
                Recuerdo aux = memoria[memoria.length/2];
                res          = aux.getDescripcion();
            }else{
                res = "El array aun no esta lleno";
            }
            return res;
    }
    public void ordenarPorDia(){
            for(int i=0;i<memoria.length-1;i++){
                for(int pos=0;pos<memoria.length-1-i;pos++){
                    Recuerdo actual       = memoria[pos];
                    Recuerdo vecino       = memoria[pos+1];
                    int diaRecuerdoActual = actual.getDia();
                    int diaRecuerdoVecino = vecino.getDia();
                    if(diaRecuerdoActual>diaRecuerdoVecino){
                        Recuerdo aux   = actual.obtenerCopia();
                        memoria[pos]   = vecino.obtenerCopia();
                        memoria[pos+1] = aux;
                    }
                }
            }
    }
    public void ordenarPorMes(){
            for(int i=0;i<memoria.length-1;i++){
                for(int pos=0;pos<memoria.length-1-i;pos++){
                    Recuerdo actual       = memoria[pos];
                    Recuerdo vecino       = memoria[pos+1];
                    int mesRecuerdoActual = actual.getMes();
                    int mesRecuerdoVecino = vecino.getMes();
                    if(mesRecuerdoActual>mesRecuerdoVecino){
                        Recuerdo aux   = actual.obtenerCopia();
                        memoria[pos]   = vecino.obtenerCopia();
                        memoria[pos+1] = aux;
                    }
                }
            }
    }
    public void ordenarPorYear(){
            for(int i=0;i<memoria.length-1;i++){
                for(int pos=0;pos<memoria.length-1-i;pos++){
                    Recuerdo actual        = memoria[pos];
                    Recuerdo vecino        = memoria[pos+1];
                    int yearRecuerdoActual = actual.getYear();
                    int yearRecuerdoVecino = vecino.getYear();
                    if(yearRecuerdoActual>yearRecuerdoVecino){
                        Recuerdo aux   = actual.obtenerCopia();
                        memoria[pos]   = vecino.obtenerCopia();
                        memoria[pos+1] = aux;
                    }
                }
            }
    }
}
