
/**
 * Write a description of class Fragmentos here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Fragmentos
{
    public String compararCadenas(String palabra1, String palabra2){
        String res;
        if(palabra1.compareTo(palabra2)==0){
            res = "Las palabras son lexicograficamente iguales";
        }else if(palabra1.compareTo(palabra2)>0){
            res = "La palabra "+palabra1+" es mayor lexicograficamente que "+palabra2;
        }else{
            res = "La palabra "+palabra1+" es menor lexicograficamente que "+palabra2;
        }
        return res;
    }
}
