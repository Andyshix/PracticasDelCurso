import java.util.ArrayList;
/**
 * Write a description of class Persona here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Persona
{
    private String nombre;
    private int edad;
    private int celular;
    private ArrayList<Persona> contactos;
    private ArrayList<Mensaje> bandejaRecibidos;
    private ArrayList<Mensaje> bandejaEnviados;

    public Persona(String nombre,int edad,int celular){
        this.nombre  = nombre;
        this.edad    = edad;
        this.celular = celular;
        contactos    = new ArrayList<>();
        bandejaRecibidos = new ArrayList<>();
        bandejaEnviados  = new ArrayList<>();
    }

    public void agregarAmigo(Persona amigo){
        contactos.add(amigo);
    }

    public Persona buscarPorNumero(int numBuscado){
        Persona res=null;
        boolean bb = false;
        for(int pos=0;pos<contactos.size()&&bb==false;pos++){
            Persona actual = contactos.get(pos);
            int celularActual = actual.getCelular();
            if(numBuscado == celularActual){
                res = actual;
                bb  = true;
            }
        }
        return res;
    }

    private int getCelular(){
        return celular;
    }

    public Persona buscarPorNombre(String nombBuscado){
        Persona res = null;
        boolean bb  = false;
        for(int pos=0;pos<contactos.size()&&bb==false;pos++){
            Persona actual = contactos.get(pos);
            String nombreActual = actual.getNombre();
            if(nombBuscado.equals(nombreActual)){
                res = actual;
                bb  = true;
            }
        }
        return res;
    }

    private String getNombre(){
        return nombre;
    }

    public void ordenarContactosPorNombre(){

        for(int i=1;i<contactos.size();i++){
            for(int pos=0;pos<=contactos.size()-1-i;pos++){
                Persona actual        = contactos.get(pos);
                Persona vecino        = contactos.get(pos+1);
                String nombreActual = actual.getNombre();
                String nombreVecino = vecino.getNombre();
                if(nombreActual.compareTo(nombreVecino)>0){
                    Persona aux      = actual.obtenerCopia();
                    contactos.set(pos,vecino.obtenerCopia());
                    contactos.set(pos+1,aux);
                }
            }
        }
    }

    private Persona obtenerCopia(){
        Persona copia = new Persona(nombre,edad,celular);
        return  copia;
    }

    public String enviarMensaje(int celAmigo, String contMensaje){
        String res;
        if(buscarPorNumero(celAmigo)!=null){
            Persona amigo = buscarPorNumero(celAmigo);
            Mensaje msj = new Mensaje(celular,celAmigo,contMensaje);
            amigo.recibirSms(msj);
            bandejaEnviados.add(msj);
            res = "El mensaje fue enviado exitosamente";
        }else{
            res = "El numero ingresado no esta en tu lista de amigos";
        }
        return res;
    }
    private void recibirSms(Mensaje mjs){
        bandejaRecibidos.add(mjs);
    }

    public void revisarBandejaMsjRecibidos(){
        for(int pos=0;pos<bandejaRecibidos.size();pos++){
            Mensaje msj = bandejaRecibidos.get(pos);
            int remitente = msj.getRemitente();
            String contenido = msj.getContenido();
            msj.setEstado("Leido");
            System.out.println("De: "+remitente+"  "+contenido+"\n");
        }
    }
    
    public void revisarBandejaMsjEnviados(){
        for(int pos=0;pos<bandejaEnviados.size();pos++){
            Mensaje msj = bandejaEnviados.get(pos);
            int destinatario = msj.getDestinatario();
            String contenido = msj.getContenido();
            String estado = msj.getEstado();
            System.out.println("Para: "+destinatario+"  "+contenido+"("+estado+")"+"\n");
        }
    }
}