
/**
 * Write a description of class LegadoDeLosAncestros here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class LegadoDeLosAncestros
{
    public String verificarPrefijo(String palabra,String prefijo){
        String res ="";
        String palabra1 = palabra.toLowerCase();
        prefijo = prefijo.toLowerCase();
        int aux=0;
        char y= prefijo.charAt(aux);
        for(int i=0;i<palabra1.length()&& aux<prefijo.length();i++){
            char x= palabra1.charAt(i);
            if(x==y){
                res = "El nombre "+palabra+", Si comienza con el prefijo "+prefijo;
                aux++;
                if(aux<prefijo.length()){
                    y = prefijo.charAt(aux);
                }
            }else{
                aux = prefijo.length();
                res = "El nombre "+palabra+", No comienza con el prefijo "+prefijo;
            }
        }
        return res;
    }

}
