;
/**
 * Write a description of class Ejercicio1 here.
 * 
 * @author (Andrea) 
 * @version (1.0)
 */
public class Ejercicio1
{
    public String calcularDistanciaSentimental(String name1,String name2){
        int sum1 = obtenerSumatoria(name1);
        int sum2 = obtenerSumatoria(name2);
        int distancia = Math.abs(sum1-sum2);
        return "La distancia entre: "+name1+" y "+name2+" es de "+distancia;
    }
    private int obtenerSumatoria(String cad){
        int sumatoria=0;
        for(int pos=0;pos<cad.length();pos++){
            char actual = cad.charAt(pos);
            sumatoria= sumatoria+actual;
        }
        return sumatoria;
    }
}
