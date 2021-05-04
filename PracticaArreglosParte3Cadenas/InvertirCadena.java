
/**
 * Write a description of class InvertirCadena here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class InvertirCadena
{
    public String invertirCadena(String cadena){
        String res="";
        for(int i=0;i<cadena.length();i++){
            res = cadena.charAt(i)+res;
        }
        return res;
    }
}
