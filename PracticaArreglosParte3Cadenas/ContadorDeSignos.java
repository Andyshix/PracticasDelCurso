
/**
 * Write a description of class ContadorDeSignosç here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class ContadorDeSignos
{
    public String contarSgnos(String verso){
        String res;
        int contador=0;
        for(int i=0;i< verso.length();i++){
            char x= verso.charAt(i);
            if(x==','||x=='.'||x==';'||x=='!'||x=='¡'||x=='¿'||x=='?'){
                contador++;
            }
        }
        if(contador==0){
            res = "No existen signos de puntuacion";
        }else{
            res = "Existen "+contador+" signos de puntucion";
        }
        
        return res;
    }
}
