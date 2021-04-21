
/**
 * Write a description of class UnicornioBaul here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class UnicornioBaul
{
    private int clave;
    private boolean abierto;

    public UnicornioBaul(){
        clave   = 1111;
        abierto = false;
    }

    public String abrirBaul(int clave){
        String res;
        if(abierto == false){
            if(this.clave==clave){
                abierto = true;
                res     = "El baul se abrio con exito";
            }else{
                res = "La clave es incorrecta";
            }
        }else{
            res = "El baul ya esta abierto";
        }
        return res;
    }

    public String cerrarBaul(){
        String res;
        if(abierto == true){
            abierto = false;
            res = "El baul se cerro con exito";
        }else{
            res = "El baul ya esta cerrado";
        }
        return res;
    }

    public String cambiarClave(int valorClave){
        String res;
        if (abierto == true){
            if(calDigitos(valorClave)==4){
                clave = valorClave;
                res   = "La clave fue cambiada con exito";
            }else{
                res   = "La clave requiere de 4 digitos";
            }
        }else{
            res = "El baul esta cerrado, no se puede realizar el cambio de clave";
        }
        return res;
    }

    private int calDigitos(int num){
        int cont=1;
        while(num>=10){
            num = num/10;
            cont++;
        }
        return cont;
    }
}
