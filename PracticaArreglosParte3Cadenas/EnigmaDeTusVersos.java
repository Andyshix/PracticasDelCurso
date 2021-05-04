
/**
 * Write a description of class EnigmaDeTusVersos here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class EnigmaDeTusVersos
{
    public String verificarPalabraEnFrase(String frase,String palabra){
        String res ="";
        frase = frase.toLowerCase();
        palabra = palabra.toLowerCase();
        frase = obtenerPraLetraCadaPalabra(frase);
        int aux=0;
        char y= palabra.charAt(aux);
        for(int i=0;i<frase.length()&& aux<palabra.length();i++){
            char x= frase.charAt(i);
            if(x==y){
                res = "Si es posible formar la palabra deseada";
                aux++;
                if(aux<palabra.length()){
                    y = palabra.charAt(aux);
                }
            }else{
                res = "No es posible formar la palabra deseada";
            }
        }
        return res;
    }

    private String obtenerPraLetraCadaPalabra(String frase){
        String res ;
        char a= frase.charAt(0);
        res = ""+a;
        for(int i=1;i<frase.length();i++){
            char x=frase.charAt(i);
            char antX=frase.charAt(i-1);
            if(antX==' '){
                res = res+x;
            }
        }
        return res;
    }
}
