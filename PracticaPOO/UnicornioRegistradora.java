
/**
 * Write a description of class CajaRegistradora here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class UnicornioRegistradora
{       
    private int precioTotal;
    public UnicornioRegistradora(){
        precioTotal = 0;
    }

    public void comprar(int precioProducto, int cantProducto){
        precioTotal = precioTotal+(precioProducto*cantProducto);
    }

    public int getPrecioTotal(){
        return precioTotal;
    }

    public String cancelarPago(int dinero){
        String mensaje;
        int cambio = dinero-precioTotal;
        if(cambio>=0){
            mensaje = "Cobro exitoso, el cambio a devolver es: "+cambio;
        }else{
            mensaje = "Error: El dinero indicado no cubre la compra";
        }
        return mensaje;
    }
}
