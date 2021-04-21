
/**
 * Write a description of class SylvanoCornio here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class SylvanoCornio
{
    private int cantidadSavia;
    private int cantidadComponente;
    private boolean encendido;
    public SylvanoCornio(){
        cantidadSavia      = 0;
        cantidadComponente = 0;
        encendido          = false;   
    }

    public String encenderSylvanoCornio(){
        String res;
        encendido = true;
        return res="Sylvanocornio encendido";
    }
    public String apagarSylvanoCornio(){
        String res;
        encendido = false;
        return res="Sylvanocornio apagado";
    }
   
    public String recolectarSavia(int cantidad){
        String res;
        if(encendido==true){
            if((cantidadSavia+cantidad)<=90){
                cantidadSavia = cantidadSavia+cantidad;
                res = "La accion ha sido completada con exito";
            }else{
                res = "No puede realizar esta accion, espacio insuficiente";
            }
        }else{
            res = "El SylvanoCornio esta apagado";
        }
        return res;
    }

    public String crearReflejoLagrima(){
        String mensaje;
        if(encendido==true){
            if(cantidadComponente<20){
                if(cantidadSavia>=50){
                    cantidadComponente++;
                    cantidadSavia = cantidadSavia-50;
                    mensaje ="La accion ha sido completada con exito";
                }else{
                    mensaje ="No puede realizar esta accion, cantidad insuficiente de savia";
                }
            }else{
                mensaje = "No puede realizar esta accion, espacio insuficiente";
            }
        }else{
            mensaje = "El SylvanoCornio esta apagado";
        }
        return mensaje;
    }
    
    public void retirarComponentes(){
        cantidadComponente = 0;
    }
}
