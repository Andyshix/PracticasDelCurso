
/**
 * Write a description of class ContadorDeVocales here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class ContadorDeVocales
{
    public String contarVocales(String frase){
        frase = frase.toLowerCase();
        int contador=0;
        for(int i=0;i< frase.length();i++){
            char x= frase.charAt(i);
            if(x=='a'||x=='e'||x=='i'||x=='o'||x=='u'){
                contador++;
            }
        }
        return "Existen "+contador+" signos de puntucion";
    }
}