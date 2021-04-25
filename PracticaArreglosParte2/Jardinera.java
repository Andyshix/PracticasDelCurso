
/**
 * Write a description of class Jardinera here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Jardinera
{
    private FlorImperial[] jardin;
    private int posLibre;
    public Jardinera(){
        jardin   = new FlorImperial[10];
        posLibre = 0;
    }

    public String agregarFlorImperial(FlorImperial nuevo){
        String res;
        if(posLibre<jardin.length){
            jardin[posLibre] = nuevo;
            posLibre++;
            res = "La flor ha sido agregada exitosamente";
        }else{
            res = "Ya no hay espacio en la Jardinera";
        }
        return res;
    }

    public String getLongitudFlorImperial(int pos){
        String res;
        if(pos<jardin.length){
            if(jardin[pos]!=null){
                FlorImperial flor = jardin[pos];
                int altura        =  flor.getAltura();
                res = "La altura de la flor imperial es: "+altura;
            }else{
                res = "La posicion ingresada esta vacia";
            }
        }else{
            res = "La posicion ingresada no es valida";
        }
        return res;
    }

    public String crecerFlorImperial(int pos){
        String res;
        if(pos<jardin.length){
            if(jardin[pos]!=null){
                FlorImperial nuevo = jardin[pos];
                res = nuevo.crecer();
            }else{
                res = "La posicion ingresada esta vacia";
            }
        }else{
            res = "La posicion ingresada no es valida";
        }
        return res;
    }
}
